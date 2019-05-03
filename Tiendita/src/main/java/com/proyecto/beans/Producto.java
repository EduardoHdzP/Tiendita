package com.proyecto.beans;

import java.util.Vector;

public class Producto {
	private int clave;
	private String nombre;
	private String marca;
	private String cambio;
	private String presentacion;
	private float utilidad;
	private float contenido;
	private String uMedida;
	private String tipo;
	
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public float getUtilidad() {
		return utilidad;
	}
	public void setUtilidad(float utilidad) {
		this.utilidad = utilidad;
	}
	public float getContenido() {
		return contenido;
	}
	public void setContenido(float contenido) {
		this.contenido = contenido;
	}
	public String getuMedida() {
		return uMedida;
	}
	public void setuMedida(String uMedida) {
		this.uMedida = uMedida;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Producto [clave=" + clave + ", nombre=" + nombre + ", marca=" + marca + ", cambio=" + cambio
				+ ", presentacion=" + presentacion + ", utilidad=" + utilidad + ", contenido=" + contenido
				+ ", uMedida=" + uMedida + ", tipo=" + tipo + "]";
	}
	
	/*
	 * 
	 * private int clave;
	private String nombre;
	private String marca;
	private String cambio;
	private String presentacion;
	private float utilidad;
	private float contenido;
	private String uMedida;
	private String tipo;*/
	
	public Vector<String> toVectorFormat(){
		Vector<String> p=new Vector<String>();
		p.add(String.valueOf(clave));
		p.add(nombre);
		p.add(marca);
		p.add(cambio);
		p.add(presentacion);
		p.add(String.valueOf(utilidad));
		p.add(String.valueOf(contenido));
		p.add(uMedida);
		p.add(tipo);

		return p;
	}
	
	
	
	

}
