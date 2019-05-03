package com.proyecto.dao;

import com.proyecto.beans.Producto;

public interface ProductoDAO extends Crud<Producto>{
	
	public boolean existe(String nombre);
	
}
