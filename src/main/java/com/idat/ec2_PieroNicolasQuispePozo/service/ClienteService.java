package com.idat.ec2_PieroNicolasQuispePozo.service;

import java.util.List;

import com.idat.ec2_PieroNicolasQuispePozo.dto.ClienteRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.ClienteResponseDTO;




public interface ClienteService {
	public void guardarCliente(ClienteRequestDTO c);
	public void eliminarCliente(Integer id);
	public void editarCliente(ClienteRequestDTO c);
	public List<ClienteResponseDTO> listarCliente();
	public ClienteResponseDTO clienteById(Integer id);
}
