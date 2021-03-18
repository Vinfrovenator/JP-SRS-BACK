package com.jpsrs.api.kana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Kana")
public class Kana {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="kana")
	private String kana;
	
	@Column(name="romaji")
	private String romaji;
	
	@Enumerated(EnumType.STRING)
	private EnumKanaSystem system;
	
	@Enumerated(EnumType.STRING)
	private EnumKanaLevel level;
	
	@Column(name="nbline")
	private int nbLine;
	
	@Column(name="note")
	private String note;

	public Kana() {
	}
	
	public Kana(Long id, String kana, String romaji, EnumKanaSystem system, EnumKanaLevel level, int nbLine,
			String note) {
		super();
		this.id = id;
		this.kana = kana;
		this.romaji = romaji;
		this.system = system;
		this.level = level;
		this.nbLine = nbLine;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public String getRomaji() {
		return romaji;
	}

	public void setRomaji(String romaji) {
		this.romaji = romaji;
	}

	public EnumKanaSystem getSystem() {
		return system;
	}

	public void setSystem(EnumKanaSystem system) {
		this.system = system;
	}

	public EnumKanaLevel getLevel() {
		return level;
	}

	public void setLevel(EnumKanaLevel level) {
		this.level = level;
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
