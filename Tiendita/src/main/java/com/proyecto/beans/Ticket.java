package com.proyecto.beans;

public class Ticket {
	private int clave;
	private String fecha;//Datetime
	private float total;
	private int claveEmpleado;
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
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getClaveEmpleado() {
		return claveEmpleado;
	}
	public void setClaveEmpleado(int claveEmpleado) {
		this.claveEmpleado = claveEmpleado;
	}
	

}
