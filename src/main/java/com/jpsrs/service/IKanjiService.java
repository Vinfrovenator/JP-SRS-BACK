package com.jpsrs.service;

import com.jpsrs.exception.EnumKanjiJLPT;
import com.jpsrs.model.alphabet.Kanji;

import java.util.Optional;

public interface IKanjiService {

    Optional<Kanji> getKanji(final Long id);

    Kanji getKanji(String kanji);

    Iterable<Kanji> getKanji();

    void deleteKanji(final Long id);

    Kanji addKanji(Kanji kanji);

    Kanji updateKanji(Kanji kanji);

    Iterable<Kanji> getKanjiByJlpt(EnumKanjiJLPT jlpt);

}
