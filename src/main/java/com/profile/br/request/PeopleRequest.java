package com.profile.br.request;

import com.profile.br.SexoEnum;
import com.profile.br.entity.EnderecoEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PeopleRequest {


    private String name;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String cel;
    private SexoEnum sexo;
    private EnderecoEntity endereco;
}
