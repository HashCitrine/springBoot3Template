package com.example.template.service;

import com.example.template.dto.res.ResTemp;
import com.example.template.entity.Temp;
import com.example.template.mapper.TempMapper;
import com.example.template.mapping.ModelMapper;
import com.example.template.repository.TempRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempService {

  private final TempMapper tempMapper;
  private final TempRepository tempRepository;

  private final ModelMapper modelMapper;

  public String getName(Long id) {
    return tempMapper.getName(id);
  }

  public ResTemp getTemp(Long id) {
    Temp result = tempRepository.findById(id).orElse(new Temp());
    return modelMapper.toResTemp(result);
  }

  public ResTemp saveTemp(Temp temp) {
    Temp result = tempRepository.save(temp);
    return modelMapper.toResTemp(result);
  }
}
