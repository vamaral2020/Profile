package com.profile.br.entity;

import com.profile.br.SexoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class People {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String cel;
    private SexoEnum sexo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private EnderecoEntity endereco;


    public People(String name){
        this.name = name;
    }

}
