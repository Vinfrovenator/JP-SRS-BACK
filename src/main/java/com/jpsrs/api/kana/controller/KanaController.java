package com.jpsrs.api.kana.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpsrs.api.kana.model.Kana;
import com.jpsrs.api.kana.service.KanaServiceImpl;

@RestController
public class KanaController {

	@Autowired
	private KanaServiceImpl kanaServiceImpl;
	
	@GetMapping("/kana")
	public Iterable<Kana> getKana() {
		return kanaServiceImpl.getKana();
	}
	
	@GetMapping("/kana/{id}")
	public Optional<Kana> getKana(@PathVariable final Long id){
		Optional<Kana> kana = kanaServiceImpl.getKana(id);
		if(kana.isPresent()) {
			return kana;
		}else {
			return null;
		}
	}
	
	@PutMapping("/kana/{id}")
	public Kana saveNote(@PathVariable final Long id, @RequestBody(required=false) String note) {
		Optional<Kana> e = kanaServiceImpl.getKana(id);
		
		if(e.isPresent()) {
			Kana currentKana = e.get();
			
			if(note != null) {
				currentKana.setNote(note);
			}else {
				currentKana.setNote("");
			}
			
			kanaServiceImpl.saveKana(currentKana);
			return currentKana;
			
		}else {
			return null;
		}
	}
	
	@DeleteMapping("/kana/{id}")
	public void deleteKana(@PathVariable final Long id) {
		kanaServiceImpl.deleteKana(id);
	}
	
}
