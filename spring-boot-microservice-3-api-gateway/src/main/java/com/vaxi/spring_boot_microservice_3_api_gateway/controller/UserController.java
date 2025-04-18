package com.vaxi.spring_boot_microservice_3_api_gateway.controller;

import com.vaxi.spring_boot_microservice_3_api_gateway.model.Role;
import com.vaxi.spring_boot_microservice_3_api_gateway.security.UserPrincipal;
import com.vaxi.spring_boot_microservice_3_api_gateway.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/change/{role}")
    public ResponseEntity<?> changeRole (@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role){
        userService.changeRole(role, userPrincipal.getUsername());

        return ResponseEntity.ok(true);

    }

    @GetMapping
    public ResponseEntity<?> getCurrentuser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return new ResponseEntity<>(userService.FindByUsernameReturnToken(userPrincipal.getUsername()), HttpStatus.OK);
    }

}
