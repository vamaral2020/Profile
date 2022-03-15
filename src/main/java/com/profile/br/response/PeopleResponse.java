package com.profile.br.response;

import com.profile.br.entity.People;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
@Data
public class PeopleResponse {

    private String name;

    public People toPeopleResponse(){

        return new People(name);
    }
}
