package com.jpsrs.exception;

import java.util.stream.Stream;

public enum EnumKanjiJLPT {
	
	JLPTN5("JLPT N5 Beginner"),
	JLPTN4("JLPT N4 Elementary"),
	JLPTN3("JLPT N3 Intermediate"),
	JLPTN2("JLPT N2 Advanced"),
	JLPTN1("JLPT N1 Expert");
	
	private String abbreviation;

    EnumKanjiJLPT(String abbreviation) {
        this.abbreviation = abbreviation ;
    }
     
    public String getCode() {
        return  this.abbreviation ;  
    }

    public static EnumKanjiJLPT of(String jlpt) {
        return Stream.of(EnumKanjiJLPT.values())
                .filter(p -> p.getCode().equals(jlpt))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
