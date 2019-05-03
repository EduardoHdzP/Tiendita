package com.proyecto.views;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Producto;
import com.proyecto.services.ProductoService;

public class Pruebas {
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
		
		//ps.eliminar(2);
		//actualizar();
		//listarTodos();
		ArrayList<Producto> productos= (ArrayList<Producto>) ps.buscarPorNombre("Co");
		for (Producto producto : productos) {
			System.out.println("Out:"+producto.toString());
		}
		Producto p= ps.buscarPorId(10);
		System.out.println(p.toString());
		
	}*/
	
	public void registrarProducto() {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
		
		Producto p=new Producto();
		p.setClave(2);
		p.setNombre("Coca-cola");
		p.setMarca("Cocacola");
		p.setCambio("NO");
		p.setPresentacion("Envase");
		p.setUtilidad(0.3f);
		p.setContenido(2.5f);
		p.setuMedida("Litro");
		p.setTipo("Refresco");
		
		
		try {
			System.out.println("Resultado:"+ps.registrar(p));
			
			
		} catch (Exception e) {
			System.out.println("Error: "+e.toString());
		}
	}

	public static void listarTodos() {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
		
		ArrayList<Producto> productos= (ArrayList<Producto>) ps.listarTodos();
		for (Producto producto : productos) {
			System.out.println("Out:"+producto.toString());
		}
	}

	public static void actualizar() {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
		
		Producto p=new Producto();
		p.setClave(1);
		p.setNombre("Coca-cola-loca");
		p.setMarca("Cocacola");
		p.setCambio("NO");
		p.setPresentacion("Envase");
		p.setUtilidad(0.3f);
		p.setContenido(2.5f);
		p.setuMedida("Litro");
		p.setTipo("Refresco");
		ps.actualizar(p);
	}
}
