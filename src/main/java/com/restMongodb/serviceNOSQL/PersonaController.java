package com.restMongodb.serviceNOSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaRepository repository;

    @GetMapping
    public List<Persona> getAllPersonas() {
        return repository.findAll();
    }

    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return repository.save(persona);
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable String id) {
        repository.deleteById(id);
    }
}
