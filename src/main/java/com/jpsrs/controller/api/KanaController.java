package com.jpsrs.controller.api;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jpsrs.model.alphabet.Kana;
import com.jpsrs.service.KanaServiceImpl;

@RestController
@RequestMapping("/kana")
public class KanaController {

	@Autowired
	private KanaServiceImpl kanaServiceImpl;
	
	@GetMapping("/")
	public Iterable<Kana> getKana() {
		return kanaServiceImpl.getKana();
	}
	
	@GetMapping("/{id}")
	public Kana getKana(@PathVariable final Long id){
		Optional<Kana> kana = kanaServiceImpl.getKana(id);
		return kana.orElseGet(kana::orElseThrow);
	}
	
	@PutMapping("/{id}")
	public Kana saveNote(@PathVariable final Long id, @RequestBody(required=false) String note) {
		Optional<Kana> e = kanaServiceImpl.getKana(id);
		
		if(e.isPresent()) {
			var currentKana = e.get();

			currentKana.setNote(Objects.requireNonNullElse(note, ""));
			
			kanaServiceImpl.updateKana(currentKana);
			return currentKana;
			
		}else {
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteKana(@PathVariable final Long id) {
		kanaServiceImpl.deleteKana(id);
	}
	
}
