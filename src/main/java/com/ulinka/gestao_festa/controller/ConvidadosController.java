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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvidadosController {

    @GetMapping("/convidados")
    public String listar(){
        return "ListaConvidados";
    }

}