package com.proyecto.dao;

import java.util.List;

public interface Crud<T> {
	
	public boolean registrar(T t);
	public List<T> listarTodos();
	public List<T> buscarPorNombre(String nombre);
	public T buscarPorId(int id);
	public boolean actualizar(T t);
	public boolean eliminar(int id);

}
