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

import com.idat.ec2_PieroNicolasQuispePozo.dto.BodegaRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.BodegaResponseDTO;
import com.idat.ec2_PieroNicolasQuispePozo.service.BodegaService;

@RestController
@RequestMapping("/bodega/v1")
public class BodegaController {
	@Autowired
	private BodegaService service;

	@RequestMapping(method= RequestMethod.GET, path="/listar")
	public ResponseEntity<List<BodegaResponseDTO>> listar(){
		return new ResponseEntity<List<BodegaResponseDTO>>(service.listarBodega(),HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.POST, path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody BodegaRequestDTO bodega){
		service.guardarBodega(bodega);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/listar/{id}")
	public @ResponseBody ResponseEntity<BodegaResponseDTO> bodegaById(@PathVariable Integer id){
		BodegaResponseDTO bodega = service.bodegaById(id);
		
		if(bodega != null) {
			return new ResponseEntity<BodegaResponseDTO>(bodega,HttpStatus.OK);
		}
		return new ResponseEntity<BodegaResponseDTO>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, path="/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		BodegaResponseDTO bodega = service.bodegaById(id);
		if(bodega != null) {
			service.eliminarBodega(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.PUT, path="/editar")
	public ResponseEntity<Void> editar(@RequestBody BodegaRequestDTO bodega){
		BodegaResponseDTO bodeg = service.bodegaById(bodega.getIdRequest());
		if(bodeg != null) {
			service.editarBodega(bodega);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}

}
