package com.idat.ec2_PieroNicolasQuispePozo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec2_PieroNicolasQuispePozo.dto.BodegaRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.BodegaResponseDTO;
import com.idat.ec2_PieroNicolasQuispePozo.model.Bodega;
import com.idat.ec2_PieroNicolasQuispePozo.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {


	@Autowired
	private BodegaRepository repository;

	@Override
	public void guardarBodega(BodegaRequestDTO c) {
		Bodega bodega = new Bodega();
		bodega.setIdBodega(c.getIdRequest());
		bodega.setNombre(c.getNombreRequest());
		bodega.setDireccion(c.getDireccionRequest());
		repository.save(bodega);
		
	}

	@Override
	public void eliminarBodega(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarBodega(BodegaRequestDTO c) {
		Bodega bodega = new Bodega();
		bodega.setIdBodega(c.getIdRequest());
		bodega.setNombre(c.getNombreRequest());
		bodega.setDireccion(c.getDireccionRequest());
		repository.saveAndFlush(bodega);
		
	}

	@Override
	public List<BodegaResponseDTO> listarBodega() {
		List<Bodega> bodega = repository.findAll();
		List<BodegaResponseDTO> dto = new ArrayList<BodegaResponseDTO>();
		BodegaResponseDTO bodegaDTO = null;
		
		for(Bodega bodegas : bodega ) {
			bodegaDTO = new BodegaResponseDTO();
			bodegaDTO.setIdResponse(bodegas.getIdBodega());
			bodegaDTO.setNombreResponse(bodegas.getNombre());
			bodegaDTO.setDireccionResponse(bodegas.getDireccion());
			dto.add(bodegaDTO);
		}
		return dto;
	}

	@Override
	public BodegaResponseDTO bodegaById(Integer id) {
		Bodega bodega = repository.findById(id).orElse(null);
		BodegaResponseDTO bodegaDTO = new BodegaResponseDTO();
		bodegaDTO = new BodegaResponseDTO();
		bodegaDTO.setIdResponse(bodega.getIdBodega());
		bodegaDTO.setNombreResponse(bodega.getNombre());
		bodegaDTO.setDireccionResponse(bodega.getDireccion());
		return bodegaDTO;
	}
}
