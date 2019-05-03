package com.proyecto.views.productos;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Producto;
import com.proyecto.services.ProductoService;
import com.proyecto.views.OptionPanel;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;

public class VistaListarProducto extends JPanel {
	
	private OptionPanel optionPanel;
	private DefaultTableModel dtmProductos;
	private String cabecera[]={"ID","NOMBRE","MARCA","CAMBIO","PRESENTACION","UTILIDAD","CONTENIDO","U. MEDIDA","TIPO"};
	private String datos[][]=null;
	private JTable tbProductos;

	/**
	 * Create the panel.
	 */
	public VistaListarProducto() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblRegistroDeProductos = new JLabel("LISTADO DE PRODUCTOS");
		lblRegistroDeProductos.setForeground(new Color(255, 255, 255));
		lblRegistroDeProductos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRegistroDeProductos.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblRegistroDeProductos, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		dtmProductos=new DefaultTableModel(datos,cabecera);
		tbProductos = new JTable(dtmProductos);
		scrollPane.setViewportView(tbProductos);

		listarTodos();
	}
	public void listarTodos() {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
		
		ArrayList<Producto> productos= (ArrayList<Producto>) ps.listarTodos();
		if(productos.size()>0) {
			for (Producto producto : productos) {
				//System.out.println("Out:"+producto.toString());
				//dtmProductos.addRow(producto.toA);;
				dtmProductos.addRow(producto.toVectorFormat());
			}
		}else {
			JOptionPane.showMessageDialog(null, "No hay productos");
		}
	}
}
