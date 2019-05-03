package com.proyecto.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.proyecto.views.productos.VistaConsultarProducto;
import com.proyecto.views.productos.VistaEliminarProducto;
import com.proyecto.views.productos.VistaListarProducto;
import com.proyecto.views.productos.VistaModificarProducto;
import com.proyecto.views.productos.VistaRegistrarProducto;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Home extends JFrame {

	private JPanel contenPane;
	
	private PanelAcciones actionPanel;
	private OptionPanel optionPanel;
	
	private UserPanel userPanel;
	
	
	/*private VistaRegistrarProducto vistaRegistrarProducto;
	private VistaModificarProducto vistaModificarProducto;
	private VistaConsultarProducto vistaConsultarProducto;*/
	
	private JButton btnGuardar;
	private JButton btnLimpiar;
	private JButton btnSalir;
	
	private JButton btnRegistrar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JPanel panelContenido;
	private JPanel panelzquierdo;
	private JButton btnEmpleados;
	private JButton btnProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(false);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					Home frame = new Home();
					frame.setVisible(true);
					//SubstanceLookAndFeel.setSkin("org.pushingpixels.");
					//SubstanceAutumnLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.SubstanceAutumnLookAndFeel");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		
		setResizable(false);
		setTitle("Mi Tiendita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, d.width, d.height);
		contenPane = new JPanel();
		contenPane.setBackground(Color.BLACK);
		contenPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenPane);
		contenPane.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setForeground(new Color(128, 128, 128));
		panelMenu.setBounds(5, 5, 1355, 73);
		panelMenu.setMinimumSize(new Dimension(10, 300));
		panelMenu.setBackground(Color.DARK_GRAY);
		contenPane.add(panelMenu);
		
		btnEmpleados = new JButton();
		btnEmpleados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEmpleados.setForeground(Color.green);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnEmpleados.setForeground(Color.white);
			}
		});
		btnEmpleados.setContentAreaFilled(false);
		btnEmpleados.setBounds(5, 11, 149, 48);
		btnEmpleados.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnEmpleados.setIcon(new ImageIcon(Home.class.getResource("/com/proyecto/images/usuario-32.png")));
		btnEmpleados.setText("EMPLEADOS");
		btnEmpleados.setBackground(new Color(0, 128, 128));
		btnEmpleados.setForeground(new Color(255, 255, 255));
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarContenedor();
				actionPanel=new PanelAcciones(" EMPLEADOS ");
				
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
						
						btnGuardar=optionPanel.getBtnGuardar();
						btnGuardar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								JOptionPane.showMessageDialog(null, "Guardar");
							}
						});
						
						btnLimpiar=optionPanel.getBtnLimpiar();
						btnLimpiar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								JOptionPane.showMessageDialog(null, "Limpiar");
							}
						});
						
						btnSalir=optionPanel.getBtnSalir();
						btnSalir.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								JOptionPane.showMessageDialog(null, "Limpiar");
							}
						});
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
		panelMenu.setLayout(null);
		btnEmpleados.setFont(new Font("Shruti", Font.PLAIN, 15));
		panelMenu.add(btnEmpleados);
		
		btnProductos = new JButton("PRODUCTOS");
		btnProductos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProductos.setFont(new Font("Shruti", Font.BOLD, 15));
				btnProductos.setForeground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnProductos.setFont(new Font("Shruti", Font.PLAIN, 15));
				btnProductos.setForeground(Color.white);
			}
		});
		btnProductos.setContentAreaFilled(false);
		btnProductos.setIcon(new ImageIcon(Home.class.getResource("/com/proyecto/images/productos-32.png")));
		btnProductos.setBounds(154, 11, 163, 48);
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarContenedor();
				actionPanel=new PanelAcciones(" PRODUCTOS ");
				panelzquierdo.add(actionPanel, BorderLayout.CENTER);
				panelContenido.updateUI();
			

				btnRegistrar=actionPanel.getBtnRegistrar();
				btnRegistrar.addActionListener(new ActionListener() {
					
					private VistaRegistrarProducto vistaRegistrarProducto;

					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						limpiarContenedor();
						vistaRegistrarProducto=new VistaRegistrarProducto();
						optionPanel=new OptionPanel();
						
						panelContenido.add(vistaRegistrarProducto, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.SOUTH);
						
						btnGuardar=optionPanel.getBtnGuardar();
						btnGuardar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								//JOptionPane.showMessageDialog(null, "Guardar");
								vistaRegistrarProducto.registrarProducto();
							}
						});
						
						btnLimpiar=optionPanel.getBtnLimpiar();
						btnLimpiar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								vistaRegistrarProducto.limpiarEntradas();
							}
						});
						
						btnSalir=optionPanel.getBtnSalir();
						btnSalir.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								JOptionPane.showMessageDialog(null, "Salir");
							}
						});
						
						panelContenido.updateUI();
					}
				});
				btnModificar=actionPanel.getBtnModificar();
				btnModificar.addActionListener(new ActionListener() {
					
					private VistaModificarProducto vistaModificarProducto;

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
			
					private VistaConsultarProducto vistaConsultarProducto;

					public void actionPerformed(ActionEvent e) {
						limpiarContenedor();
						vistaConsultarProducto=new VistaConsultarProducto();
						optionPanel=new OptionPanel();
						
						panelContenido.add(vistaConsultarProducto, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.SOUTH);
						panelContenido.updateUI();
					}
				});
				btnEliminar=actionPanel.getBtnEliminar();
				btnEliminar.addActionListener(new ActionListener() {
			
					private VistaEliminarProducto vistaEliminarProducto;

					public void actionPerformed(ActionEvent e) {
						limpiarContenedor();
						vistaEliminarProducto=new VistaEliminarProducto();
						optionPanel=new OptionPanel();
						
						panelContenido.add(vistaEliminarProducto, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.SOUTH);
						panelContenido.updateUI();
						
						btnGuardar=optionPanel.getBtnGuardar();
						btnGuardar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								JOptionPane.showMessageDialog(null, "Guardar");
								//vistaRegistrarProducto.registrarProducto();
							}
						});
						btnGuardar.setText("Eliminar");
						
						btnLimpiar=optionPanel.getBtnLimpiar();
						btnLimpiar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								//vistaRegistrarProducto.limpiarEntradas();
								//JOptionPane.showMessageDialog(null, "lIMPIAR");
								vistaEliminarProducto.limpiarEntradas();

							}
						});
						
						btnSalir=optionPanel.getBtnSalir();
						btnSalir.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								JOptionPane.showMessageDialog(null, "Salir");
							}
						});
						
						
					}
				});
				btnListar=actionPanel.getBtnListar();
				btnListar.addActionListener(new ActionListener() {
			
					private VistaListarProducto vistaListarProducto;

					public void actionPerformed(ActionEvent e) {
						limpiarContenedor();
						vistaListarProducto=new VistaListarProducto();
						optionPanel=new OptionPanel();
						
						panelContenido.add(vistaListarProducto, BorderLayout.CENTER);
						panelContenido.add(optionPanel,BorderLayout.SOUTH);
						panelContenido.updateUI();
					}
				});
			}
		});
		btnProductos.setBackground(new Color(0, 128, 128));
		btnProductos.setForeground(new Color(255, 255, 255));
		btnProductos.setFont(new Font("Shruti", Font.PLAIN, 15));
		panelMenu.add(btnProductos);
		
		JButton btnVentas = new JButton("VENTAS");
		btnVentas.setContentAreaFilled(false);
		btnVentas.setBounds(317, 11, 136, 48);
		btnVentas.setBackground(new Color(0, 128, 128));
		btnVentas.setForeground(new Color(255, 255, 255));
		btnVentas.setFont(new Font("Shruti", Font.PLAIN, 15));
		panelMenu.add(btnVentas);
		
		JButton btnResurtir = new JButton("RESURTIDOS");
		btnResurtir.setContentAreaFilled(false);
		btnResurtir.setBounds(453, 11, 136, 48);
		btnResurtir.setBackground(new Color(0, 128, 128));
		btnResurtir.setForeground(new Color(255, 255, 255));
		btnResurtir.setFont(new Font("Shruti", Font.PLAIN, 15));
		panelMenu.add(btnResurtir);
		
		JButton btnPerdidas = new JButton("PERDIDAS");
		btnPerdidas.setContentAreaFilled(false);
		btnPerdidas.setBounds(589, 11, 122, 48);
		btnPerdidas.setBackground(new Color(0, 128, 128));
		btnPerdidas.setForeground(new Color(255, 255, 255));
		btnPerdidas.setFont(new Font("Shruti", Font.PLAIN, 15));
		panelMenu.add(btnPerdidas);
		
		JButton btnProveedores = new JButton("PROVEEDORES");
		btnProveedores.setContentAreaFilled(false);
		btnProveedores.setBounds(710, 11, 150, 48);
		btnProveedores.setBackground(new Color(0, 128, 128));
		btnProveedores.setForeground(new Color(255, 255, 255));
		btnProveedores.setFont(new Font("Shruti", Font.PLAIN, 15));
		panelMenu.add(btnProveedores);
		
		panelContenido = new JPanel();
		panelContenido.setBounds(191, 77, 1169, 662);
		panelContenido.setBackground(Color.WHITE);
		contenPane.add(panelContenido);
		panelContenido.setLayout(new BorderLayout(10, 0));
		
		panelzquierdo = new JPanel();
		panelzquierdo.setBounds(5, 77, 187, 662);
		panelzquierdo.setBackground(Color.LIGHT_GRAY);
		contenPane.add(panelzquierdo);
		panelzquierdo.setLayout(null);
	}
	
	public void limpiarContenedor() {
		panelContenido.removeAll();
	}

}
