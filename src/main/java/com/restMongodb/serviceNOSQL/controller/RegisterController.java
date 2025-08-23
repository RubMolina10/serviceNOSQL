package com.restMongodb.serviceNOSQL.controller;

import com.restMongodb.serviceNOSQL.DTO.registerDTO;
import com.restMongodb.serviceNOSQL.model.Register;
import com.restMongodb.serviceNOSQL.repository.RegsiterLoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class RegisterController {
    @Autowired
    private RegsiterLoginRepository repository;

    // @GetMapping
    // public List<Register> gRegisterLogins() {
    //     return repository.findAll();
    // }

    @GetMapping
    public List<registerDTO> gRegisterLogins() {
        return repository.findAll()
                .stream()
                .map(p -> new registerDTO(p.getUsername(), p.getisActive()))
                .toList();
    }

    @PostMapping
    public Register createRegisterLogin(@RequestBody Register register) {
        return repository.save(register);
    }

}
