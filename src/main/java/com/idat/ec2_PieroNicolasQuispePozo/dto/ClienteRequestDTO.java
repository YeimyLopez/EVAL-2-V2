package com.idat.ec2_PieroNicolasQuispePozo.dto;

public class ClienteRequestDTO {
	private Integer idRequest;
	private String nombreRequest;
	private String direccionRequest;
	private String dniRequest;
	
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
	public String getDniRequest() {
		return dniRequest;
	}
	public void setDniRequest(String dniRequest) {
		this.dniRequest = dniRequest;
	}
	
	

}
