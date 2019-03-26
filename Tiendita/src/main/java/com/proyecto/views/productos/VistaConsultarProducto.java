package com.proyecto.views.productos;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.proyecto.views.OptionPanel;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaConsultarProducto extends JPanel {
	
	private OptionPanel optionPanel;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public VistaConsultarProducto() {
		setBackground(new Color(102, 102, 102));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblRegistroDeProductos = new JLabel("BUSCAR UN PRODUCTO");
		lblRegistroDeProductos.setForeground(new Color(255, 255, 255));
		lblRegistroDeProductos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRegistroDeProductos.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblRegistroDeProductos, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(179, 155, 76, 32);
		panel.add(lblNombre);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(179, 243, 76, 32);
		panel.add(lblMarca);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(179, 326, 76, 32);
		panel.add(lblCambio);
		
		JLabel lblPresentacion = new JLabel("Presentacion");
		lblPresentacion.setBounds(179, 416, 76, 32);
		panel.add(lblPresentacion);
		
		JLabel lblUtilidad = new JLabel("Utilidad (%)");
		lblUtilidad.setBounds(615, 158, 76, 32);
		panel.add(lblUtilidad);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(615, 246, 76, 32);
		panel.add(lblContenido);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setBounds(615, 329, 76, 32);
		panel.add(lblUnidadDeMedida);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(615, 419, 76, 32);
		panel.add(lblTipo);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(179, 87, 772, 35);
		panel.add(textField);
		
		JLabel lblNewLabel = new JLabel("INGRESE EL NOMBRE A BUSCAR");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(179, 40, 772, 45);
		panel.add(lblNewLabel);
		
		JLabel lblDatos = new JLabel("Datos");
		lblDatos.setOpaque(true);
		lblDatos.setBackground(new Color(0, 128, 128));
		lblDatos.setBounds(265, 154, 248, 35);
		panel.add(lblDatos);
		
		JLabel label = new JLabel("Datos");
		label.setOpaque(true);
		label.setBackground(new Color(0, 128, 128));
		label.setBounds(265, 240, 248, 35);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Datos");
		label_1.setOpaque(true);
		label_1.setBackground(new Color(0, 128, 128));
		label_1.setBounds(265, 323, 248, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Datos");
		label_2.setOpaque(true);
		label_2.setBackground(new Color(0, 128, 128));
		label_2.setBounds(265, 413, 248, 35);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Datos");
		label_3.setOpaque(true);
		label_3.setBackground(new Color(0, 128, 128));
		label_3.setBounds(703, 152, 248, 35);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Datos");
		label_4.setOpaque(true);
		label_4.setBackground(new Color(0, 128, 128));
		label_4.setBounds(703, 240, 248, 35);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Datos");
		label_5.setOpaque(true);
		label_5.setBackground(new Color(0, 128, 128));
		label_5.setBounds(703, 323, 248, 35);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Datos");
		label_6.setOpaque(true);
		label_6.setBackground(new Color(0, 128, 128));
		label_6.setBounds(703, 413, 248, 35);
		panel.add(label_6);

	}
}
