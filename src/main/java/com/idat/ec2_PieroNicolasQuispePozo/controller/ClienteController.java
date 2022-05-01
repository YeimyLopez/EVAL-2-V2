package com.idat.ec2_PieroNicolasQuispePozo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ec2_PieroNicolasQuispePozo.dto.ClienteRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.ClienteResponseDTO;
import com.idat.ec2_PieroNicolasQuispePozo.service.ClienteService;

@RestController
@RequestMapping("/cliente/v1")
public class ClienteController {
	@Autowired 
	private ClienteService service;

	@RequestMapping(method = RequestMethod.GET, path="/listar")
	public ResponseEntity<List<ClienteResponseDTO>> listar(){
		return new ResponseEntity<List<ClienteResponseDTO>>(service.listarCliente(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path ="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody ClienteRequestDTO cliente){
		service.guardarCliente(cliente);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, path="/listar/{id}")
	public @ResponseBody ResponseEntity<ClienteResponseDTO> clienteById(@PathVariable Integer id){
		ClienteResponseDTO cliente= service.clienteById(id);
		
		if(cliente != null) {
			return new ResponseEntity<ClienteResponseDTO>(cliente,HttpStatus.OK);
		}
		return new ResponseEntity<ClienteResponseDTO>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, path="/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		ClienteResponseDTO cliente= service.clienteById(id);
		
		if (cliente != null) {
			service.eliminarCliente(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.PUT, path="/editar")
	public ResponseEntity<Void> editar(@RequestBody ClienteRequestDTO client){
		ClienteResponseDTO cliente = service.clienteById(client.getIdRequest());
		
		if(cliente != null) {
			service.editarCliente(client);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
}
