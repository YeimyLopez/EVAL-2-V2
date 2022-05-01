package com.idat.ec2_PieroNicolasQuispePozo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec2_PieroNicolasQuispePozo.dto.ClienteRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.ClienteResponseDTO;
import com.idat.ec2_PieroNicolasQuispePozo.model.Cliente;
import com.idat.ec2_PieroNicolasQuispePozo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void guardarCliente(ClienteRequestDTO c) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdRequest());
		cliente.setNombre(c.getNombreRequest());
		cliente.setDireccion(c.getDireccionRequest());
		cliente.setDni(c.getDniRequest());
		repository.save(cliente);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarCliente(ClienteRequestDTO c) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdRequest());
		cliente.setNombre(c.getNombreRequest());
		cliente.setDireccion(c.getDireccionRequest());
		cliente.setDni(c.getDniRequest());
		repository.saveAndFlush(cliente);
		
	}

	@Override
	public List<ClienteResponseDTO> listarCliente() {
		List<Cliente> cliente = repository.findAll();
		List<ClienteResponseDTO> dto = new ArrayList<ClienteResponseDTO>();
		ClienteResponseDTO clienteDTO = null;
		
		for(Cliente clientes : cliente) {
			clienteDTO = new ClienteResponseDTO();
			clienteDTO.setIdResponse(clientes.getIdCliente());
			clienteDTO.setNombreResponse(clientes.getNombre());
			clienteDTO.setDireccionResponse(clientes.getDireccion());
			clienteDTO.setDniResponse(clientes.getDni());
			dto.add(clienteDTO);
		}
		return dto;
	}

	@Override
	public ClienteResponseDTO clienteById(Integer id) {
		Cliente cliente = repository.findById(id).orElse(null);
		ClienteResponseDTO clienteDTO = new ClienteResponseDTO();
		clienteDTO = new ClienteResponseDTO();
		clienteDTO.setIdResponse(cliente.getIdCliente());
		clienteDTO.setNombreResponse(cliente.getNombre());
		clienteDTO.setDireccionResponse(cliente.getDireccion());
		clienteDTO.setDniResponse(cliente.getDni());
		return clienteDTO;
	}




}
