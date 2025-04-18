package com.vaxi.spring_boot_microservice_3_api_gateway.services;

import com.vaxi.spring_boot_microservice_3_api_gateway.model.Role;
import com.vaxi.spring_boot_microservice_3_api_gateway.model.User;
import com.vaxi.spring_boot_microservice_3_api_gateway.repository.UserRepository;
import com.vaxi.spring_boot_microservice_3_api_gateway.security.jwt.JwtProvider;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setFechaCreacion(LocalDateTime.now());
        User userCreated = userRepository.save(user);

        // Aqui se crea el token del usuario qeue esta en la base de datos
        String jwt = jwtProvider.generateToken(userCreated);
        userCreated.setToken(jwt);

        return userCreated;

    }

    @Override
    public Optional<User> findByUsername(String username){

        return userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public void changeRole(Role newRole, String username) {

        userRepository.updateUserRole(username, newRole);

    }


    @Override
    public User FindByUsernameReturnToken(String username) {

        User user = userRepository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("El usuario no fue encontrado:" +username));

        String jwt = jwtProvider.generateToken(user);
        user.setToken(jwt);
        return user;
    }
}
