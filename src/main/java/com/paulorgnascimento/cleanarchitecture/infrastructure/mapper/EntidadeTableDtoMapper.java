package com.paulorgnascimento.cleanarchitecture.infrastructure.mapper;
import com.paulorgnascimento.cleanarchitecture.domain.entities.Entidade;
import com.paulorgnascimento.cleanarchitecture.infrastructure.dto.EntidadeTableDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntidadeTableDtoMapper {
    EntidadeTableDto toTableDto(Entidade entity);
}
