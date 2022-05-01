package com.idat.ec2_PieroNicolasQuispePozo.dto;

public class UsuarioRequestDTO {
	
	private Integer idRequest;
	private String usuarioRequest;
	private String contraseniaRequest;
	private String rolRequest;
	
	public Integer getIdRequest() {
		return idRequest;
	}
	public void setIdRequest(Integer idRequest) {
		this.idRequest = idRequest;
	}
	public String getUsuarioRequest() {
		return usuarioRequest;
	}
	public void setUsuarioRequest(String usuarioRequest) {
		this.usuarioRequest = usuarioRequest;
	}
	public String getContraseniaRequest() {
		return contraseniaRequest;
	}
	public void setContraseniaRequest(String contraseniaRequest) {
		this.contraseniaRequest = contraseniaRequest;
	}
	public String getRolRequest() {
		return rolRequest;
	}
	public void setRolRequest(String rolRequest) {
		this.rolRequest = rolRequest;
	}
	

}
