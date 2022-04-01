package com.profile.br.services;

import com.profile.br.entity.EnderecoEntity;
import com.profile.br.exception.BadRequestException;
import com.profile.br.repository.EnderecoRepository;
import com.profile.br.request.EndereRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoEntity save(EndereRequestDto dto){

        EnderecoEntity build = EnderecoEntity.builder()
                .cep(dto.getCep())
                .cidade(dto.getCidade())
                .complemento(dto.getComplemento())
                .estado(dto.getEstado())
                .logradouro(dto.getLogradouro())
                .build();
        return enderecoRepository.save(build);
    }

    public EnderecoEntity listEndereco(Long id) {
        EnderecoEntity endereco = enderecoRepository.findById(id)
                .orElseThrow(()-> new BadRequestException("Endereço não encontrado"));
        return endereco;
    }
}
