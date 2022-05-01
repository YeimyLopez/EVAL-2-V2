package com.idat.ec2_PieroNicolasQuispePozo.dto;

public class ClienteResponseDTO {
	
	private Integer idResponse;
	private String nombreResponse;
	private String direccionResponse;
	private String dniResponse;
	
	public Integer getIdResponse() {
		return idResponse;
	}
	public void setIdResponse(Integer idResponse) {
		this.idResponse = idResponse;
	}
	public String getNombreResponse() {
		return nombreResponse;
	}
	public void setNombreResponse(String nombreResponse) {
		this.nombreResponse = nombreResponse;
	}
	public String getDireccionResponse() {
		return direccionResponse;
	}
	public void setDireccionResponse(String direccionResponse) {
		this.direccionResponse = direccionResponse;
	}
	public String getDniResponse() {
		return dniResponse;
	}
	public void setDniResponse(String dniResponse) {
		this.dniResponse = dniResponse;
	}

}
