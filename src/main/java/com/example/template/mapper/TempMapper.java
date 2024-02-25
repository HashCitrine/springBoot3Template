package com.example.template.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TempMapper {

  @Select("""
      SELECT NAME
      FROM TEMP
      WHERE ID = #{id}
      """)
  String getName(Long id);
}
