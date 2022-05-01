package com.idat.ec2_PieroNicolasQuispePozo.dto;

public class ProductoResponseDTO {
	
	private Integer idResponse;
	private String productoResponse;
	private String descripcionResponse;
	private Double precioResponse;
	private Integer stockResponse;
	
	public Integer getIdResponse() {
		return idResponse;
	}
	public void setIdResponse(Integer idResponse) {
		this.idResponse = idResponse;
	}
	public String getProductoResponse() {
		return productoResponse;
	}
	public void setProductoResponse(String productoResponse) {
		this.productoResponse = productoResponse;
	}
	public String getDescripcionResponse() {
		return descripcionResponse;
	}
	public void setDescripcionResponse(String descripcionResponse) {
		this.descripcionResponse = descripcionResponse;
	}
	public Double getPrecioResponse() {
		return precioResponse;
	}
	public void setPrecioResponse(Double precioResponse) {
		this.precioResponse = precioResponse;
	}
	public Integer getStockResponse() {
		return stockResponse;
	}
	public void setStockResponse(Integer stockResponse) {
		this.stockResponse = stockResponse;
	}
	
}
