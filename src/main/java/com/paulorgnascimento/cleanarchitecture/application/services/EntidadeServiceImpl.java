package com.paulorgnascimento.cleanarchitecture.application.services;

import com.paulorgnascimento.cleanarchitecture.application.dto.EntidadeDto;
import com.paulorgnascimento.cleanarchitecture.application.mapper.EntidadeMapper;
import com.paulorgnascimento.cleanarchitecture.domain.entity.Entidade;
import com.paulorgnascimento.cleanarchitecture.infrastructure.gateway.Todo;
import com.paulorgnascimento.cleanarchitecture.infrastructure.persistence.entity.EntidadeMapping;
import com.paulorgnascimento.cleanarchitecture.infrastructure.persistence.repository.EntidadeRepository;
import org.springframework.stereotype.Service;

@Service
public class EntidadeServiceImpl implements EntidadeService {

    private final EntidadeMapper entidadeMapper;
    private final EntidadeRepository entidadeTableDtoRepository;
    private final GetTodoService getTodoService;

    public EntidadeServiceImpl(EntidadeMapper entidadeMapper,
                               EntidadeRepository entidadeRepository, GetTodoService getTodoService) {
        this.entidadeMapper = entidadeMapper;
        this.entidadeTableDtoRepository = entidadeRepository;
        this.getTodoService = getTodoService;
    }

    @Override
    public void criarEntidade(EntidadeDto entidadeDto) {

        Todo todo = getTodoService.execute(1);

        Entidade entidade = entidadeMapper.fromDto(entidadeDto);
        EntidadeMapping entidadeMapping = entidadeMapper.fromEntity(entidade);

        entidadeTableDtoRepository.save(entidadeMapping);
    }
}
