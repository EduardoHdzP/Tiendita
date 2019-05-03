package com.proyecto.services;

import java.util.ArrayList;
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
		ArrayList<Producto> productos=new ArrayList<Producto>();
		try {
			productos=(ArrayList<Producto>) productoDAO.listarTodos();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error_listarTodos_:"+e.toString());
		}
		return productos;
	}

	public List<Producto> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		ArrayList<Producto> productos=new ArrayList<Producto>();
		try {
			productos=(ArrayList<Producto>) productoDAO.buscarPorNombre(nombre);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error_listarTodos_:"+e.toString());
		}
		return productos;
	}

	public Producto buscarPorId(int id) {
		// TODO Auto-generated method stub
		Producto p=null;
		try {
			p=productoDAO.buscarPorId(id);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error_listarTodos_:"+e.toString());
		}
		return p;
	}

	public boolean actualizar(Producto t) {
		// TODO Auto-generated method stub
		try {
			productoDAO.actualizar(t);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error_listarTodos_:"+e.toString());
		}
		return false;
	}

	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		try {
			productoDAO.eliminar(id);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error_listarTodos_:"+e.toString());
		}
		return false;
	}

	public boolean existe(String nombre) {
		// TODO Auto-generated method stub
		if(productoDAO.existe(nombre)) 
			return true;
		else
			return false;
	}

}
