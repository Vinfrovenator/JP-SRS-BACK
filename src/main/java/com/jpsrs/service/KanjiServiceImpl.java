package com.jpsrs.service;

import com.jpsrs.exception.EnumKanjiJLPT;
import com.jpsrs.model.alphabet.Kanji;
import com.jpsrs.repository.KanjiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KanjiServiceImpl implements IKanjiService{

    @Autowired
    private KanjiRepository kanjiRepository;

    @Override
    public Optional<Kanji> getKanji(Long id) {
        return kanjiRepository.findById(id);
    }

    @Override
    public Iterable<Kanji> getKanji() {
        return kanjiRepository.findAll();
    }

    @Override
    public Kanji getKanji(String character){
        Optional<Kanji> k = Optional.ofNullable(kanjiRepository.findByCharacter(character));
        return k.orElseGet(k::orElseThrow);
    }

    @Override
    public void deleteKanji(Long id) {
        kanjiRepository.deleteById(id);
    }

    @Override
    public Kanji addKanji(Kanji kanji) {
        return kanjiRepository.save(kanji);
    }

    @Override
    public Kanji updateKanji(Kanji kanji) {
        return kanjiRepository.save(kanji);
    }

    @Override
    public Iterable<Kanji> getKanjiByJlpt(EnumKanjiJLPT jlpt) {
        return kanjiRepository.findByJlpt(jlpt);
    }
}
