package com.idat.ec2_PieroNicolasQuispePozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec2_PieroNicolasQuispePozo.dto.UsuarioRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.UsuarioResponseDTO;
import com.idat.ec2_PieroNicolasQuispePozo.model.Usuario;
import com.idat.ec2_PieroNicolasQuispePozo.repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public void guardarUsuario(UsuarioRequestDTO p) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(p.getIdRequest());
		usuario.setUsuario(p.getUsuarioRequest());
		usuario.setContrasenia(p.getContraseniaRequest());
		usuario.setRol(p.getRolRequest());
		repository.save(usuario);
		
	}

	@Override
	public void eliminarUsuario(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarUsuario(UsuarioRequestDTO p) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(p.getIdRequest());
		usuario.setUsuario(p.getUsuarioRequest());
		usuario.setContrasenia(p.getContraseniaRequest());
		usuario.setRol(p.getRolRequest());
		repository.saveAndFlush(usuario);
		
	}
	
	@Override
	public List<UsuarioResponseDTO> listarUsuario() {
//		List<Usuario> usuario = repository.findAll();
////		List<UsuarioResponseDTO> dto = new ArrayList<UsuarioResponseDTO>();
////		UsuarioResponseDTO usuarioDTO = null;
////		
////		for(Usuario usuarios : usuario) {
////			usuarioDTO = new UsuarioResponseDTO();
////			usuarioDTO.setIdResponse(usuarios.getIdUsuario());
////			usuarioDTO.setUsuarioResponse(usuarios.getUsuario());
////			usuarioDTO.setContraseniaResponse(usuarios.getContrasenia());
////			usuarioDTO.setRolResponse(usuarios.getRol());
////			dto.add(usuarioDTO);
//		}
		return null;
	}

	@Override
	public UsuarioResponseDTO usuarioById(Integer id) {
//		Usuario usuario = repository.findById(id).orElse(null);
//		UsuarioResponseDTO usuarioDTO = new UsuarioResponseDTO();
//		usuarioDTO = new UsuarioResponseDTO();
//		usuarioDTO.setIdResponse(usuario.getIdUsuario());
//		usuarioDTO.setUsuarioResponse(usuario.getUsuario());
//		usuarioDTO.setContraseniaResponse(usuario.getContrasenia());
//		usuarioDTO.setRolResponse(usuario.getRol());
		return null;
	}

}
