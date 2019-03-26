package com.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.beans.Producto;
import com.proyecto.dao.ProductoDAO;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoDAO productoDAO;

	public boolean registrar(Producto t) {
		// TODO Auto-generated method stub
		try {
			productoDAO.registrar(t);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error registrar producto Service:"+e.toString());
		}

		return false;
	}

	public List<Producto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Producto> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean actualizar(Producto t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
