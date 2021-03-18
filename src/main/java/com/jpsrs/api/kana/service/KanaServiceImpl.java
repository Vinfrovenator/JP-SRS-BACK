package com.jpsrs.api.kana.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpsrs.api.kana.model.Kana;
import com.jpsrs.api.kana.repository.KanaRepository;

@Service
public class KanaServiceImpl implements IkanaService{
	
	@Autowired
	private KanaRepository kanaRepository;
	
	@Override
	public Optional<Kana> getKana(final Long id){
		return kanaRepository.findById(id);
	}
	
	@Override
	public Iterable<Kana> getKana(){
		return kanaRepository.findAll();
	}
	
	@Override
	public void deleteKana(final Long id) {
		kanaRepository.deleteById(id);
	}
	
	@Override
	public Kana saveKana(Kana kana) {
		Kana savedKana = kanaRepository.save(kana);
		return savedKana;
	}

}
