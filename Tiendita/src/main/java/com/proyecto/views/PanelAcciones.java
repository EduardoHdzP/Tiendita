package com.proyecto.views;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelAcciones extends JPanel {
	private JButton btnRegistrar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JLabel lblUsuarios;
	
	private String textoBtn;

	/**
	 * Create the panel.
	 */
	public PanelAcciones(String titulo) {
		setBackground(Color.LIGHT_GRAY);
		setBounds(5,10,174,741);
		
		lblUsuarios = new JLabel(titulo);
		lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuarios.setForeground(Color.BLACK);
		lblUsuarios.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblUsuarios.setBackground(new Color(0, 0, 0));
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				formatoEntered(btnRegistrar);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				formatoExited(btnRegistrar);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				formatoExited(btnRegistrar);
				//btnRegistrar.setEnabled(false);
			}
		});
		btnRegistrar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistrar.setIconTextGap(7);
		btnRegistrar.setIcon(new ImageIcon(PanelAcciones.class.getResource("/com/proyecto/images/insertar-32.png")));
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBackground(new Color(51, 51, 51));
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		
		btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				formatoEntered(btnModificar);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				formatoExited(btnModificar);
			}
		});
		btnModificar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnModificar.setHorizontalAlignment(SwingConstants.LEFT);
		btnModificar.setIconTextGap(7);
		btnModificar.setIcon(new ImageIcon(PanelAcciones.class.getResource("/com/proyecto/images/editar-32.png")));
		btnModificar.setContentAreaFilled(false);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setBackground(new Color(51, 51, 51));
		btnModificar.setForeground(Color.BLACK);
		btnModificar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				formatoEntered(btnConsultar);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				formatoExited(btnConsultar);
			}
		});
		btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnConsultar.setHorizontalAlignment(SwingConstants.LEFT);
		btnConsultar.setIconTextGap(7);
		btnConsultar.setIcon(new ImageIcon(PanelAcciones.class.getResource("/com/proyecto/images/consultar-32.png")));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBackground(new Color(51, 51, 51));
		btnConsultar.setForeground(Color.BLACK);
		btnConsultar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				formatoEntered(btnEliminar);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				formatoExited(btnEliminar);
			}
		});
		btnEliminar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnEliminar.setHorizontalAlignment(SwingConstants.LEFT);
		btnEliminar.setIconTextGap(7);
		btnEliminar.setIcon(new ImageIcon(PanelAcciones.class.getResource("/com/proyecto/images/eliminar-32.png")));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBackground(new Color(51, 51, 51));
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		
		btnListar = new JButton("Listar");
		btnListar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				formatoEntered(btnListar);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				formatoExited(btnListar);
			}
		});
		btnListar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnListar.setHorizontalAlignment(SwingConstants.LEFT);
		btnListar.setIconTextGap(7);
		btnListar.setIcon(new ImageIcon(PanelAcciones.class.getResource("/com/proyecto/images/listado-32.png")));
		btnListar.setContentAreaFilled(false);
		btnListar.setBackground(new Color(51, 51, 51));
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
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
	
	public void formatoEntered(JButton b) {
		textoBtn=b.getText();
		b.setForeground(Color.BLUE);
		b.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		b.setText(b.getText().toUpperCase());
	}
	public void formatoExited(JButton b) {
		b.setForeground(Color.BLACK);
		b.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		b.setText(textoBtn);
	}

	
	

}
