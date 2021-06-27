package com.jpsrs.controller.api;

import com.jpsrs.exception.EnumKanjiJLPT;
import com.jpsrs.model.alphabet.Kanji;
import com.jpsrs.service.KanjiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/kanji")
public class KanjiController {

    @Autowired
    private KanjiServiceImpl kanjiServiceImpl;

    @GetMapping("/{id}")
    public Optional<Kanji> getKanji(@PathVariable final Long id) {
        return kanjiServiceImpl.getKanji(id);
    }

    @GetMapping("/")
    public Iterable<Kanji> getKanji() {
        return kanjiServiceImpl.getKanji();
    }

    @GetMapping("/trace/{character}")
    public Kanji getKanji(@PathVariable String character){
        Optional<Kanji> k = Optional.ofNullable(kanjiServiceImpl.getKanji(character));
        return k.orElseGet(k::orElseThrow);
    }

    @DeleteMapping("/{id}")
    public void deleteKanji(@PathVariable final Long id) {
        kanjiServiceImpl.deleteKanji(id);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Kanji addKanji(@RequestBody Kanji kanji) {
        return kanjiServiceImpl.addKanji(kanji);
    }

    @PutMapping("/{id}")
    public Kanji updateKanji(@RequestBody Kanji kanji, @PathVariable Long id) {
            Optional<Kanji> e = kanjiServiceImpl.getKanji(id);
            if(e.isPresent()) {
                var currentKanji = e.get();

                if(kanji.getCharacter() != null && !kanji.getCharacter().equals(currentKanji.getCharacter())){
                    currentKanji.setCharacter(kanji.getCharacter());
                }

                if(kanji.getMeaning() != null && !kanji.getMeaning().equals(currentKanji.getMeaning())){
                    currentKanji.setMeaning(kanji.getMeaning());
                }

                if(kanji.getKunYomi() != null && !kanji.getKunYomi().equals(currentKanji.getKunYomi())){
                    currentKanji.setKunYomi(kanji.getKunYomi());
                }

                if(kanji.getOnYomi() != null && !kanji.getOnYomi().equals(currentKanji.getOnYomi())){
                    currentKanji.setOnYomi((kanji.getOnYomi()));
                }

                if(kanji.getJlpt() != null && !kanji.getJlpt().equals(currentKanji.getJlpt())){
                    currentKanji.setJlpt(currentKanji.getJlpt());
                }

                if(kanji.getRadical() != null && !kanji.getRadical().equals(currentKanji.getRadical())){
                    currentKanji.setRadical(kanji.getRadical());
                }

                if(kanji.getFrequency() != currentKanji.getFrequency()){
                    currentKanji.setFrequency(kanji.getFrequency());
                }

                if(kanji.getNbLine() != currentKanji.getNbLine()){
                    currentKanji.setNbLine(kanji.getNbLine());
                }

                if(kanji.getNote() != null && !kanji.getNote().equals(currentKanji.getNote())) {
                    currentKanji.setNote(kanji.getNote());
                }

                kanjiServiceImpl.updateKanji(currentKanji);
                return currentKanji;

            }else {
                return null;
            }
    }

    @GetMapping("/jlpt/{jlpt}")
    public Iterable<Kanji> getKanjiByJlpt(@PathVariable("jlpt") EnumKanjiJLPT jlpt) {
        return kanjiServiceImpl.getKanjiByJlpt(jlpt);
    }

}
