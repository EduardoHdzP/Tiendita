package com.proyecto.beans;

public class Direccion {
	private String calle;
	private int numero;
	private String orientacion;
	private String colonia;
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	
	public String formatear() {
		return calle+" "+orientacion+" #"+numero+"col: "+colonia;
	}
	

}
