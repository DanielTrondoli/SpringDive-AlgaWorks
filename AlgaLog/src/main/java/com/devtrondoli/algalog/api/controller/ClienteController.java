package com.devtrondoli.algalog.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtrondoli.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		List<Cliente> l = new ArrayList<>();
		l.add(new Cliente(1L, "Daniel Trondoli", "5518981063047", "trondoli1@hotmail.com"));
		l.add(new Cliente(1L, "Daniel Trondoli", "5518981063047", "trondoli1@hotmail.com"));
		l.add(new Cliente(1L, "Daniel Trondoli", "5518981063047", "trondoli1@hotmail.com"));
		l.add(new Cliente(1L, "Daniel Trondoli", "5518981063047", "trondoli1@hotmail.com"));
		l.add(new Cliente(1L, "Daniel Trondoli", "5518981063047", "trondoli1@hotmail.com"));
		l.add(new Cliente(1L, "Daniel Trondoli", "5518981063047", "trondoli1@hotmail.com"));
		return l;		
	}
}
