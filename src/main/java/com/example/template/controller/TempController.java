package com.example.template.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.template.entity.Temp;
import com.example.template.mapper.TempMapper;
import com.example.template.repository.TempRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TempController {

	private final TempMapper tempMapper;
	private final TempRepository tempRepository;

	@GetMapping
	ResponseEntity<String> getName(Long id) {
		return ResponseEntity.ok(tempMapper.getName(id));
	}

	@GetMapping("/temp")
	ResponseEntity<Temp> getTemp(Long id) {
		return ResponseEntity.ok(tempRepository.findById(id).orElse(null));
	}

	@PostMapping("/temp")
	ResponseEntity<Temp> getTemp(@RequestBody Temp temp) {
		tempRepository.save(temp);

		return ResponseEntity.ok(temp);
	}
}
