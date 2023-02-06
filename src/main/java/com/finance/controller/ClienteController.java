package com.finance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

import com.finance.entity.ClienteEntity;
import com.finance.service.ClienteService;

@RestController
@RequestMapping("cliente")
@Log4j2
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<Iterable<ClienteEntity>> listarTodosClientes(){
        return ResponseEntity.ok(clienteService.listarTodosClientes());
    }

}
