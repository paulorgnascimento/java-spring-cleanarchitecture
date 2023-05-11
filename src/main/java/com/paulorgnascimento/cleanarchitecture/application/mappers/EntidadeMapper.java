package com.paulorgnascimento.cleanarchitecture.application.mappers;

import com.paulorgnascimento.cleanarchitecture.application.dto.EntidadeDto;
import com.paulorgnascimento.cleanarchitecture.domain.entities.Entidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntidadeMapper {
    Entidade toEntity(EntidadeDto dto);
}
