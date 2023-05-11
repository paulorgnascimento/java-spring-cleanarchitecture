package com.paulorgnascimento.cleanarchitecture.application.services;

import com.paulorgnascimento.cleanarchitecture.application.dto.EntidadeDto;
import com.paulorgnascimento.cleanarchitecture.application.mappers.EntidadeMapper;
import com.paulorgnascimento.cleanarchitecture.domain.entities.Entidade;
import com.paulorgnascimento.cleanarchitecture.infrastructure.dto.EntidadeTableDto;
import com.paulorgnascimento.cleanarchitecture.infrastructure.mapper.EntidadeTableDtoMapper;
import com.paulorgnascimento.cleanarchitecture.infrastructure.repository.EntidadeRepository;
import org.springframework.stereotype.Service;

@Service
public class EntidadeServiceImpl implements EntidadeService {

    private final EntidadeMapper entidadeMapper;
    private final EntidadeTableDtoMapper entidadeTableDtoMapper;
    private final EntidadeRepository entidadeTableDtoRepository;

    public EntidadeServiceImpl(EntidadeMapper entidadeMapper,
                               EntidadeTableDtoMapper entidadeTableDtoMapper,
                               EntidadeRepository entidadeRepository) {
        this.entidadeMapper = entidadeMapper;
        this.entidadeTableDtoMapper = entidadeTableDtoMapper;
        this.entidadeTableDtoRepository = entidadeRepository;
    }

    @Override
    public void criarEntidade(EntidadeDto entidadeDto) {
        Entidade entidade = entidadeMapper.toEntity(entidadeDto);
        EntidadeTableDto entidadeTableDto = entidadeTableDtoMapper.toTableDto(entidade);

        entidadeTableDtoRepository.save(entidadeTableDto);
    }
}
