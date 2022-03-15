package com.profile.br.repository;

import com.profile.br.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PeopleRepository extends JpaRepository<People, Long> {


    List<People> listAll();
    List<People> findByName(String name);
}
