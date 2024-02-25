package com.example.template.controller;

import com.example.template.dto.res.ResTemp;
import com.example.template.entity.Temp;
import com.example.template.service.TempService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TempController {

  private final TempService tempService;

  @GetMapping("temp/{id}")
  ResponseEntity<String> getName(@PathVariable(value = "id") Long id) {
    return ResponseEntity.ok(tempService.getName(id));
  }

  @GetMapping("/temp")
  ResponseEntity<ResTemp> getTemp(Long id) {
    return ResponseEntity.ok(tempService.getTemp(id));
  }

  @PostMapping("/temp")
  ResponseEntity<ResTemp> saveTemp(@RequestBody Temp temp) {
    return ResponseEntity.ok(tempService.saveTemp(temp));
  }
}
