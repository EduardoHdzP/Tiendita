package com.proyecto.beans;

public class Perdida {
	private int clave;
	private String fecha;//Datetime
	private int cantidad;
	private String motivo;
	private int numRenglonResurtido;
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public int getNumRenglonResurtido() {
		return numRenglonResurtido;
	}
	public void setNumRenglonResurtido(int numRenglonResurtido) {
		this.numRenglonResurtido = numRenglonResurtido;
	}
	
	

}
