package com.proyecto.views;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Producto;
import com.proyecto.services.ProductoService;

public class Pruebas {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
		
		/*private int clave;
		private String nombre;
		private String marca;
		private String cambio;
		private String presentacion;
		private float utilidad;
		private float contenido;
		private String uMedida;
		private String tipo;*/
		
		Producto p=new Producto();
		p.setClave(1);
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

}
