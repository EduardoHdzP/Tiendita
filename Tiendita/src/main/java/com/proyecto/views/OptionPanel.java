package com.proyecto.views;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class OptionPanel extends JPanel {
	private JButton btnGuardar;
	private JButton btnLimpiar;
	private JButton btnSalir;

	/**
	 * Create the panel.
	 */
	public OptionPanel() {
		setBackground(Color.BLACK);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setHorizontalTextPosition(SwingConstants.LEADING);
		btnGuardar.setFont(new Font("Sylfaen", Font.BOLD, 20));
		add(btnGuardar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Sylfaen", Font.BOLD, 20));
		add(btnLimpiar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Sylfaen", Font.BOLD, 20));
		add(btnSalir);
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}
	
	
	

}
