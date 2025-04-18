package com.vaxi.Spring.boot_.microservice_1_inmueble.controller;


import com.vaxi.Spring.boot_.microservice_1_inmueble.model.Inmueble;
import com.vaxi.Spring.boot_.microservice_1_inmueble.service.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inmueble")
public class InmuebleController {


    @Autowired
    private InmuebleService inmuebleService;


    @PostMapping
    public ResponseEntity<?> saveInmueble (@RequestBody Inmueble inmueble) {

        return new ResponseEntity<>(
                inmuebleService.saveInmueble(inmueble),HttpStatus.CREATED);
    }


    //http:localhost:3333/api/inmueble/87
    @DeleteMapping("{inmuebleId}")
    public ResponseEntity<?> deleteInmueble (@PathVariable Long inmuebleId) {
        inmuebleService.deleteInmueble(inmuebleId);

        return new ResponseEntity<> (HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<?> getAllInmuebles() {
        return ResponseEntity.ok(inmuebleService.findAllInmuebles());
    }


}
