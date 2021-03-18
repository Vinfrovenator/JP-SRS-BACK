package com.jpsrs.api.kana.service;

import java.util.Optional;

import com.jpsrs.api.kana.model.Kana;

public interface IkanaService {

	Optional<Kana> getKana(final Long id);
	
	Iterable<Kana> getKana();
	
	void deleteKana(final Long id);
	
	Kana saveKana(Kana kana);
	
}
