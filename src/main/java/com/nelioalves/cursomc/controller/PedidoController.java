package com.nelioalves.cursomc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nelioalves.cursomc.model.Pedido;
import com.nelioalves.cursomc.service.PedidoService;

@RestController
@RequestMapping(value="/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}