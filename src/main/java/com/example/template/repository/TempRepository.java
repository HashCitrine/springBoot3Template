package com.example.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.template.entity.Temp;

@Repository
public interface TempRepository extends JpaRepository<Temp, Long> {


}
