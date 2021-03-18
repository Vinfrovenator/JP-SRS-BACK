package com.jpsrs.api.kanji.model;

public enum EnumKanjiJLPT {
	
	JLPTN5("JLPT N5 Beginner"),
	JLPTN4("JLPT N4 Elementary"),
	JLPTN3("JLPT N3 Intermediate"),
	JLPTN2("JLPT N2 Advanced"),
	JLPTN1("JLPT N1 Expert");
	
	private String abbreviation ;  
    
    private EnumKanjiJLPT(String abbreviation) {  
        this.abbreviation = abbreviation ;  
    }  
     
    public String getWording() {  
        return  this.abbreviation ;  
    } 
}
