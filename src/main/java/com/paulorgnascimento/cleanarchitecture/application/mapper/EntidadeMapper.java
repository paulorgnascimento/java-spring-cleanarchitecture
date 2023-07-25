package com.paulorgnascimento.cleanarchitecture.application.mapper;

import com.paulorgnascimento.cleanarchitecture.application.dto.EntidadeDto;
import com.paulorgnascimento.cleanarchitecture.domain.entity.Entidade;
import com.paulorgnascimento.cleanarchitecture.infrastructure.persistence.entity.EntidadeMapping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntidadeMapper {
    Entidade fromDto(EntidadeDto dto);
    EntidadeMapping fromEntity(Entidade entity);
}
