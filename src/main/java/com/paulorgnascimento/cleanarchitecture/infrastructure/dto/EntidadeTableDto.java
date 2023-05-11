package com.paulorgnascimento.cleanarchitecture.infrastructure.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EntidadeTableDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String campo1;
    private String campo2;
    private int campo3;
    private int campo4;
    private double campo5;
}