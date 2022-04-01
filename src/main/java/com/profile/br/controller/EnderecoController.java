package com.profile.br.controller;

import com.profile.br.entity.EnderecoEntity;
import com.profile.br.request.EndereRequestDto;
import com.profile.br.services.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/endereco")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService service;

    @PostMapping
    public ResponseEntity<EnderecoEntity> enderecoSave(EndereRequestDto dto) {
        EnderecoEntity enderecoEntity = service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoEntity);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<EnderecoEntity> endereco(@PathVariable Long id){
        return ResponseEntity.ok(service.listEndereco(id));
    }
}
