package com.jpsrs.service;

import java.util.Optional;

import com.jpsrs.model.alphabet.Kana;

public interface IkanaService {

	Optional<Kana> getKana(final Long id);
	
	Iterable<Kana> getKana();
	
	void deleteKana(final Long id);
	
	Kana updateKana(Kana kana);
	
}
