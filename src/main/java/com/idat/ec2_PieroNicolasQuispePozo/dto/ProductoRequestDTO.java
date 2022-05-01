package com.idat.ec2_PieroNicolasQuispePozo.dto;

public class ProductoRequestDTO {
	
	private Integer idRequest;
	private String productoRequest;
	private String descripcionRequest;
	private Double precioRequest;
	private Integer stockRequest;
	
	public Integer getIdRequest() {
		return idRequest;
	}
	public void setIdRequest(Integer idRequest) {
		this.idRequest = idRequest;
	}
	public String getProductoRequest() {
		return productoRequest;
	}
	public void setProductoRequest(String productoRequest) {
		this.productoRequest = productoRequest;
	}
	public String getDescripcionRequest() {
		return descripcionRequest;
	}
	public void setDescripcionRequest(String descripcionRequest) {
		this.descripcionRequest = descripcionRequest;
	}
	public Double getPrecioRequest() {
		return precioRequest;
	}
	public void setPrecioRequest(Double precioRequest) {
		this.precioRequest = precioRequest;
	}
	public Integer getStockRequest() {
		return stockRequest;
	}
	public void setStockRequest(Integer stockRequest) {
		this.stockRequest = stockRequest;
	}
	

}
