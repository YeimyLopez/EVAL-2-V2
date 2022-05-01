package com.idat.ec2_PieroNicolasQuispePozo.service;

import java.util.List;

import com.idat.ec2_PieroNicolasQuispePozo.dto.ProductoRequestDTO;
import com.idat.ec2_PieroNicolasQuispePozo.dto.ProductoResponseDTO;

public interface ProductoService {
	
	public void guardarProducto(ProductoRequestDTO producto);
	public void eliminarProducto(Integer id);
	public void editarProducto(ProductoRequestDTO p);
	public List<ProductoResponseDTO> listarProducto();
	public ProductoResponseDTO productById(Integer id);

}
