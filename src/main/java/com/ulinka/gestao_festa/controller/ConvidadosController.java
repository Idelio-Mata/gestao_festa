/*
 * Copyright (c) 2026 UlinkaTech.
 *
 * Author: Idélio Teófilo Mata
 * Project: gestao-festa
 * Created: 3/31/2026 6:47 PM
 *
 * This source code is the proprietary property of UlinkaTech.
 * Unauthorized copying, modification, distribution, or use
 * of this file, via any medium, is strictly prohibited.
 *
 * All rights reserved.
 */

package com.ulinka.gestao_festa.controller;


import com.ulinka.gestao_festa.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {

    @Autowired // Injeta o repositório no controller
    private ConvidadosRepository convidadosRepository;

    @GetMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidadosRepository.findAll());
        return modelAndView;
    }


}