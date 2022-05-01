package com.idat.ec2_PieroNicolasQuispePozo.dto;

public class BodegaRequestDTO {
	
	private Integer idRequest;
	private String nombreRequest;
	private String direccionRequest;

	public Integer getIdRequest() {
		return idRequest;
	}
	public void setIdRequest(Integer idRequest) {
		this.idRequest = idRequest;
	}
	public String getNombreRequest() {
		return nombreRequest;
	}
	public void setNombreRequest(String nombreRequest) {
		this.nombreRequest = nombreRequest;
	}
	public String getDireccionRequest() {
		return direccionRequest;
	}
	public void setDireccionRequest(String direccionRequest) {
		this.direccionRequest = direccionRequest;
	}
	

}
