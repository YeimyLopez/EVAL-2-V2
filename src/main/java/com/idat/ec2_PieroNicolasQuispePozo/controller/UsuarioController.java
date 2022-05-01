package com.idat.ec2_PieroNicolasQuispePozo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ec2_PieroNicolasQuispePozo.dto.UsuarioRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.UsuarioResponseDTO;
import com.idat.ec2_PieroNicolasQuispePozo.security.JWTTokenUtil;
import com.idat.ec2_PieroNicolasQuispePozo.security.JWTUserDetailService;

@RestController
@CrossOrigin
public class UsuarioController {
	@Autowired
	private JWTTokenUtil tokenUtil;
	
	@Autowired
	private JWTUserDetailService userDetails;
	
	@RequestMapping(method = RequestMethod.POST, path ="/crearToken")
	public ResponseEntity<?> crearToken(@RequestBody UsuarioRequestDTO request){
		
		UserDetails userDetail = userDetails.loadUserByUsername(request.getUsuarioRequest());
		
		return ResponseEntity.ok(new UsuarioResponseDTO(tokenUtil.generateToken(userDetail.getUsername())));
	}
	
//	@RequestMapping(method= RequestMethod.GET, path="/listar")
//	public ResponseEntity<List<UsuarioResponseDTO>> listar(){
//		return new ResponseEntity<List<UsuarioResponseDTO>>(service.listarUsuario(),HttpStatus.OK);
//	}
//	
//	@RequestMapping(method= RequestMethod.POST, path="/guardar")
//	public ResponseEntity<Void> guardar(@RequestBody UsuarioRequestDTO usuario){
//		service.guardarUsuario(usuario);
//		return new ResponseEntity<Void>(HttpStatus.CREATED);
//	}
//	
//	@RequestMapping(method= RequestMethod.GET, path="/listar/{id}")
//	public @ResponseBody ResponseEntity<UsuarioResponseDTO> productById(@PathVariable Integer id){
//		UsuarioResponseDTO usuario = service.usuarioById(id);
//		
//		if(usuario != null) {
//			return new ResponseEntity<UsuarioResponseDTO>(usuario,HttpStatus.OK);
//		}
//		return new ResponseEntity<UsuarioResponseDTO>(HttpStatus.NOT_FOUND);
//	}
//	
//	@RequestMapping(method= RequestMethod.DELETE, path="/eliminar/{id}")
//	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
//		UsuarioResponseDTO usuario = service.usuarioById(id);
//		if(usuario != null) {
//			service.eliminarUsuario(id);
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
//	}
//	
	
//	@RequestMapping(method= RequestMethod.PUT, path="/editar")
//	public ResponseEntity<Void> editar(@RequestBody UsuarioRequestDTO usuario){
//		UsuarioResponseDTO usuari = service.usuarioById(usuario.getIdRequest());
//		if(usuari != null) {
//			service.editarUsuario(usuario);
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
//		
//	

}

