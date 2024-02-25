package com.example.template.mapping;

import com.example.template.dto.res.ResTemp;
import com.example.template.entity.Temp;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModelMapper {

  ResTemp toResTemp(Temp temp);
}
