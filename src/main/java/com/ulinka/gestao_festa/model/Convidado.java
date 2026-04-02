/*
 * Copyright (c) 2026 UlinkaTech.
 *
 * Author: Idélio Teófilo Mata
 * Project: gestao-festa
 * Created: 4/2/2026 9:47 AM
 *
 * This source code is the proprietary property of UlinkaTech.
 * Unauthorized copying, modification, distribution, or use
 * of this file, via any medium, is strictly prohibited.
 *
 * All rights reserved.
 */

package com.ulinka.gestao_festa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Convidado{

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private Integer quantidadeAcompanhantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }
}