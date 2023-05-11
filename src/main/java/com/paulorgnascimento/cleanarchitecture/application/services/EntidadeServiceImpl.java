package com.paulorgnascimento.cleanarchitecture.application.services;

import com.paulorgnascimento.cleanarchitecture.application.dto.EntidadeDto;
import com.paulorgnascimento.cleanarchitecture.application.mappers.EntidadeMapper;
import com.paulorgnascimento.cleanarchitecture.domain.entities.Entidade;
import org.springframework.stereotype.Service;

@Service
public class EntidadeServiceImpl implements EntidadeService {

    private final EntidadeMapper entidadeMapper;

    public EntidadeServiceImpl(EntidadeMapper entidadeMapper) {
        this.entidadeMapper = entidadeMapper;
    }

    @Override
    public void criarEntidade(EntidadeDto entidadeDto) {
        Entidade entidade = entidadeMapper.toEntity(entidadeDto);

    }
}
