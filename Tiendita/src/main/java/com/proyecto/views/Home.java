package com.proyecto.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.proyecto.views.productos.VistaConsultarProducto;
import com.proyecto.views.productos.VistaModificarProducto;
import com.proyecto.views.productos.VistaRegistrarProducto;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Home extends JFrame {

	private JPanel principalPane;
	
	private ActionPanel actionPanel;
	private OptionPanel optionPanel;
	
	private ProductPanel productPanel;
	private UserPanel userPanel;
	
	
	private VistaRegistrarProducto vistaRegistrarProducto;
	private VistaModificarProducto vistaModificarProducto;
	private VistaConsultarProducto vistaConsultarProducto;
	
	private JButton btnRegistrar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JPanel panelContenido;
	private JPanel panelzquierdo;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(false);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.CremeSkin");
					Home frame = new Home();
					frame.setVisible(true);
					//SubstanceLookAndFeel.setSkin("org.pushingpixels.");
					//SubstanceAutumnLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.SubstanceAutumnLookAndFeel");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Home() {
		
		
		setTitle("Mi Tiendita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, d.width, d.height);
		principalPane = new JPanel();
		principalPane.setBackground(Color.DARK_GRAY);
		principalPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(principalPane);
		principalPane.setLayout(new BorderLayout(7, 0));
		
		JPanel panelMenu = new JPanel();
		panelMenu.setMinimumSize(new Dimension(10, 300));
		panelMenu.setBackground(new Color(0, 0, 0));
		principalPane.add(panelMenu, BorderLayout.NORTH);
		panelMenu.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
		
		JButton btnEmpleados = new JButton("EMPLEADOS");
		btnEmpleados.setBackground(new Color(51, 51, 51));
		btnEmpleados.setForeground(new Color(255, 255, 255));
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarContenedor();
				actionPanel=new ActionPanel(" EMPLEADOS ");
				
				panelContenido.add(actionPanel, BorderLayout.WEST);
				panelContenido.updateUI();
				
				btnRegistrar=actionPanel.getBtnRegistrar();
				btnRegistrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						limpiarContenedor();
						userPanel=new UserPanel("REGISTRAR EMPLEADOS");
						optionPanel=new OptionPanel();
						
						panelContenido.add(userPanel, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.EAST);
						panelContenido.updateUI();
						
					}
				});
				btnModificar=actionPanel.getBtnModificar();
				btnModificar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						userPanel=new UserPanel("MODIFICAR EMPLEADOS");
						panelContenido.add(userPanel, BorderLayout.CENTER);
						panelContenido.updateUI();
					}
				});

				
			}
		});
		btnEmpleados.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		panelMenu.add(btnEmpleados);
		
		JButton btnNewButton_4 = new JButton("PRODUCTOS");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarContenedor();
				actionPanel=new ActionPanel(" PRODUCTOS ");
				panelzquierdo.add(actionPanel, BorderLayout.CENTER);
				panelContenido.updateUI();
			

				btnRegistrar=actionPanel.getBtnRegistrar();
				btnRegistrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						limpiarContenedor();
						vistaRegistrarProducto=new VistaRegistrarProducto();
						optionPanel=new OptionPanel();
						
						panelContenido.add(vistaRegistrarProducto, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.SOUTH);
						panelContenido.updateUI();
					}
				});
				btnModificar=actionPanel.getBtnModificar();
				btnModificar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						limpiarContenedor();
						vistaModificarProducto=new VistaModificarProducto();
						optionPanel=new OptionPanel();
						
						panelContenido.add(vistaModificarProducto, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.SOUTH);
						panelContenido.updateUI();
					}
				});
				btnConsultar=actionPanel.getBtnConsultar();
				btnConsultar.addActionListener(new ActionListener() {
			
					public void actionPerformed(ActionEvent e) {
						limpiarContenedor();
						vistaConsultarProducto=new VistaConsultarProducto();
						optionPanel=new OptionPanel();
						
						panelContenido.add(vistaConsultarProducto, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.SOUTH);
						panelContenido.updateUI();
					}
				});
			}
		});
		btnNewButton_4.setBackground(new Color(51, 51, 51));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		panelMenu.add(btnNewButton_4);
		
		JButton btnVentas = new JButton("VENTAS");
		btnVentas.setBackground(new Color(51, 51, 51));
		btnVentas.setForeground(new Color(255, 255, 255));
		btnVentas.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		panelMenu.add(btnVentas);
		
		JButton btnResurtir = new JButton("RESURTIDOS");
		btnResurtir.setBackground(new Color(51, 51, 51));
		btnResurtir.setForeground(new Color(255, 255, 255));
		btnResurtir.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		panelMenu.add(btnResurtir);
		
		JButton btnPerdidas = new JButton("PERDIDAS");
		btnPerdidas.setBackground(new Color(51, 51, 51));
		btnPerdidas.setForeground(new Color(255, 255, 255));
		btnPerdidas.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		panelMenu.add(btnPerdidas);
		
		JButton btnProveedores = new JButton("PROVEEDORES");
		btnProveedores.setBackground(new Color(51, 51, 51));
		btnProveedores.setForeground(new Color(255, 255, 255));
		btnProveedores.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		panelMenu.add(btnProveedores);
		
		panelContenido = new JPanel();
		panelContenido.setBackground(Color.DARK_GRAY);
		principalPane.add(panelContenido, BorderLayout.CENTER);
		panelContenido.setLayout(new BorderLayout(10, 0));
		
		panelzquierdo = new JPanel();
		panelzquierdo.setBackground(Color.ORANGE);
		principalPane.add(panelzquierdo, BorderLayout.WEST);
		panelzquierdo.setLayout(new GridLayout(1, 1, 0, 20));
	}
	
	public void limpiarContenedor() {
		panelContenido.removeAll();
	}

}
