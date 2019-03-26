package com.proyecto.views;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ActionPanel extends JPanel {
	private JButton btnRegistrar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JLabel lblUsuarios;

	/**
	 * Create the panel.
	 */
	public ActionPanel(String titulo) {
		setBackground(Color.DARK_GRAY);
		setSize(486,751);
		
		lblUsuarios = new JLabel(titulo);
		lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuarios.setForeground(new Color(51, 102, 51));
		lblUsuarios.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		lblUsuarios.setOpaque(true);
		lblUsuarios.setBackground(new Color(0, 0, 0));
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(new Color(51, 51, 51));
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setBackground(new Color(51, 51, 51));
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(51, 51, 51));
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(51, 51, 51));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		
		btnListar = new JButton("Listar");
		btnListar.setBackground(new Color(51, 51, 51));
		btnListar.setForeground(Color.WHITE);
		btnListar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		setLayout(new GridLayout(10, 1, 0, 10));
		add(lblUsuarios);
		add(btnRegistrar);
		add(btnModificar);
		add(btnConsultar);
		add(btnEliminar);
		add(btnListar);
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnListar() {
		return btnListar;
	}

	public JLabel getLblUsuarios() {
		return lblUsuarios;
	}
	

	
	

}
