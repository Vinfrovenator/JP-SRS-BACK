package com.jpsrs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpsrs.model.alphabet.Kana;

@Repository
public interface KanaRepository extends CrudRepository<Kana, Long> {

}
