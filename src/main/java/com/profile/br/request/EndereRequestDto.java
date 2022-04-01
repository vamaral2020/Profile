package com.profile.br.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EndereRequestDto {

    private String cep;
    private String logradouro;
    private String cidade;
    private String estado;
    private String complemento;
}
