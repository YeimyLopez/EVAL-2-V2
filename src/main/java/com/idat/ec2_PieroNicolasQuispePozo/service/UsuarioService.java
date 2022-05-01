package com.idat.ec2_PieroNicolasQuispePozo.service;

import java.util.List;

import com.idat.ec2_PieroNicolasQuispePozo.dto.UsuarioRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.UsuarioResponseDTO;

public interface UsuarioService {
	public void guardarUsuario(UsuarioRequestDTO p);
	public void eliminarUsuario(Integer id);
	public void editarUsuario(UsuarioRequestDTO p);
	public List<UsuarioResponseDTO> listarUsuario();
	public UsuarioResponseDTO usuarioById(Integer id);

}
