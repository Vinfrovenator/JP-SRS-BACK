package com.jpsrs.api.kana.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpsrs.api.kana.model.Kana;

@Repository
public interface KanaRepository extends CrudRepository<Kana, Long> {

}
