package com.paulorgnascimento.cleanarchitecture.infrastructure.repository;

import com.paulorgnascimento.cleanarchitecture.infrastructure.dto.EntidadeTableDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadeRepository extends JpaRepository<EntidadeTableDto, Long> {
}