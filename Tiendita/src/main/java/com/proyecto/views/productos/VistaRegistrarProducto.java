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

public class VistaRegistrarProducto extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private OptionPanel optionPanel;

	/**
	 * Create the panel.
	 */
	public VistaRegistrarProducto() {
		setBackground(new Color(102, 102, 102));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblRegistroDeProductos = new JLabel("REGISTRO DE PRODUCTOS");
		lblRegistroDeProductos.setForeground(new Color(255, 255, 255));
		lblRegistroDeProductos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRegistroDeProductos.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblRegistroDeProductos, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(179, 106, 76, 32);
		panel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(265, 103, 250, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(179, 194, 76, 32);
		panel.add(lblMarca);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 191, 250, 35);
		panel.add(textField_1);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(179, 277, 76, 32);
		panel.add(lblCambio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(265, 274, 250, 35);
		panel.add(textField_2);
		
		JLabel lblPresentacion = new JLabel("Presentacion");
		lblPresentacion.setBounds(179, 367, 76, 32);
		panel.add(lblPresentacion);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(265, 364, 250, 35);
		panel.add(textField_3);
		
		JLabel lblUtilidad = new JLabel("Utilidad (%)");
		lblUtilidad.setBounds(615, 109, 76, 32);
		panel.add(lblUtilidad);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(615, 197, 76, 32);
		panel.add(lblContenido);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setBounds(615, 280, 76, 32);
		panel.add(lblUnidadDeMedida);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(615, 370, 76, 32);
		panel.add(lblTipo);
		
		JComboBox cbUtilidad = new JComboBox();
		cbUtilidad.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15", "20", "25", "30", "35", "40"}));
		cbUtilidad.setBounds(701, 103, 250, 35);
		panel.add(cbUtilidad);
		
		JComboBox cbContenido = new JComboBox();
		cbContenido.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cbContenido.setBounds(701, 191, 250, 35);
		panel.add(cbContenido);
		
		JComboBox cbUmedida = new JComboBox();
		cbUmedida.setModel(new DefaultComboBoxModel(new String[] {"Kilos", "Litros", "Paquetes", "Cajas"}));
		cbUmedida.setBounds(701, 274, 250, 35);
		panel.add(cbUmedida);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dulces", "Bevidas"}));
		comboBox.setBounds(701, 364, 250, 35);
		panel.add(comboBox);

	}
}
