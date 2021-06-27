package com.jpsrs.repository;

import com.jpsrs.exception.EnumKanjiJLPT;
import com.jpsrs.model.alphabet.Kanji;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KanjiRepository extends CrudRepository<Kanji, Long> {

    Kanji findByCharacter(String character);
    Iterable<Kanji> findByJlpt(EnumKanjiJLPT jlpt);

}
