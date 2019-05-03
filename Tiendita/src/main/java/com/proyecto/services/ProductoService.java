package com.proyecto.services;

import com.proyecto.beans.Producto;
import com.proyecto.dao.Crud;

public interface ProductoService extends Crud<Producto>{

	public boolean existe(String nombre);
}
