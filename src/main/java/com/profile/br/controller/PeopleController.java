package com.profile.br.controller;

import com.profile.br.entity.People;
import com.profile.br.request.PeopleRequest;
import com.profile.br.services.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleService service;

    @GetMapping
    public ResponseEntity<List<People>> list(String name){
        List<People> byName = service.findByName(name);
        return ResponseEntity.ok(byName);
    }

    @PostMapping
    public ResponseEntity<People> peoppleSaved(PeopleRequest request){
        People save = service.save(request);
        return  ResponseEntity.status(HttpStatus.CREATED).body(save);
    }
}
