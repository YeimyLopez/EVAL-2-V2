package com.idat.ec2_PieroNicolasQuispePozo.service;

import java.util.List;

import com.idat.ec2_PieroNicolasQuispePozo.dto.BodegaRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.BodegaResponseDTO;

public interface BodegaService {
	
	public void guardarBodega(BodegaRequestDTO c);
	public void eliminarBodega(Integer id);
	public void editarBodega(BodegaRequestDTO c);
	public List<BodegaResponseDTO> listarBodega();
	public BodegaResponseDTO bodegaById(Integer id);
}
