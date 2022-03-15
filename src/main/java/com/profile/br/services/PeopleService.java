package com.profile.br.services;

import com.profile.br.entity.People;
import com.profile.br.repository.PeopleRepository;
import com.profile.br.request.PeopleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PeopleRepository peopleRepository = null;

    public Page<People> listAll(Pageable pageable){
        return peopleRepository.findAll(pageable);
    }

    public List<People> findByName(String name){
        return peopleRepository.findByName(name);
    }


    @Transactional
    public People save(PeopleRequest peopleRequest){
        People build = People.builder()
                .name(peopleRequest.getName())
                .rg(peopleRequest.getRg())
                .cpf(peopleRequest.getCpf())
                .dataNascimento(peopleRequest.getDataNascimento())
                .cel(peopleRequest.getCel())
                .telefone(peopleRequest.getTelefone())
                .sexo(peopleRequest.getSexo())
                .build();
        return peopleRepository.save(build);
   }
}
