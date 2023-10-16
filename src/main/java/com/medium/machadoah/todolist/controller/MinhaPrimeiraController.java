package com.medium.machadoah.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// https://localhost:8080/ ------

@RestController
@RequestMapping(path = "/primeiraRota")
public class MinhaPrimeiraController {

    /**
     * Métodos de acesso do protocolo HTTP:
     * -----------------------------------
     * GET - Buscar uma informação
     * POST - Adicionar uma informação
     * PUT - Alterar dado/informação
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte do dado/informação
     *
     */

    @GetMapping(path = "/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
