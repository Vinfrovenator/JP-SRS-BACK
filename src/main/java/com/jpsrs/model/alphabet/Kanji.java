package com.jpsrs.model.alphabet;

import com.jpsrs.exception.EnumKanjiJLPT;

import javax.persistence.*;

@Entity
@Table(name = "kanji")
public class Kanji {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kanji", nullable = false)
    private String character;

    @Column(name = "meaning", nullable = false)
    private String meaning;

    @Column(name = "onyomi")
    private String onYomi;

    @Column(name = "kunyomi")
    private String kunYomi;

    @Enumerated(EnumType.STRING)
    private EnumKanjiJLPT jlpt;

    @Column(name = "radical", nullable = false)
    private String radical;

    @Column(name = "frequency", nullable = false)
    private int frequency;

    @Column(name = "nbline", nullable = false)
    private int nbLine;

    @Column(name = "note")
    private String note;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getOnYomi() {
        return onYomi;
    }

    public void setOnYomi(String onYomi) {
        this.onYomi = onYomi;
    }

    public String getKunYomi() {
        return kunYomi;
    }

    public void setKunYomi(String kunYomi) {
        this.kunYomi = kunYomi;
    }

    public EnumKanjiJLPT getJlpt() {
        return jlpt;
    }

    public void setJlpt(EnumKanjiJLPT jlpt) {
        this.jlpt = jlpt;
    }

    public String getRadical() {
        return radical;
    }

    public void setRadical(String radical) {
        this.radical = radical;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getNbLine() {
        return nbLine;
    }

    public void setNbLine(int nbLine) {
        this.nbLine = nbLine;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
