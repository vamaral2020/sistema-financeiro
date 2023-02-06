package com.finance.service;


import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

import com.finance.entity.ClienteEntity;
import com.finance.repository.ClienteRepository;
import com.finance.repository.EnderecoRepository;

@Log4j2
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;

    public ClienteService(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public Iterable<ClienteEntity> listarTodosClientes(){
        return  clienteRepository.findAll();
    }
}
