package com.proyecto.views.productos;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Producto;
import com.proyecto.services.ProductoService;
import com.proyecto.views.OptionPanel;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class VistaModificarProducto extends JPanel {
	private JTextField txtNombre;
	private JTextField txtMarca;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private OptionPanel optionPanel;
	private JTextField txtBuscar;
	
	DefaultListModel<String> modelOriginal = new DefaultListModel(); 
	private JList listaResultados;
	
	ArrayList<Producto> productos;
	private JComboBox cbUtilidad;
	private JComboBox cbContenido;
	private JComboBox cbUmedida;
	private JComboBox cbTipo;
	private JComboBox cbCambio;
	private JComboBox cbPresentacion;

	/**
	 * Create the panel.
	 */
	public VistaModificarProducto() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblRegistroDeProductos = new JLabel("MODIFICAR UN PRODUCTO");
		lblRegistroDeProductos.setForeground(new Color(255, 255, 255));
		lblRegistroDeProductos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRegistroDeProductos.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblRegistroDeProductos, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(179, 192, 76, 32);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("");
		txtNombre.setBounds(265, 189, 250, 35);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(179, 280, 76, 32);
		panel.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(265, 277, 250, 35);
		panel.add(txtMarca);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(179, 363, 76, 32);
		panel.add(lblCambio);
		
		cbCambio = new JComboBox();
		cbCambio.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
		cbCambio.setBounds(265, 360, 250, 35);
		panel.add(cbCambio);
		
		JLabel lblPresentacion = new JLabel("Presentacion");
		lblPresentacion.setBounds(179, 453, 76, 32);
		panel.add(lblPresentacion);
		
		cbPresentacion = new JComboBox();
		cbPresentacion.setModel(new DefaultComboBoxModel(new String[] {"BOTELLA", "BOTELLA RETORNABLE", "BOLSA", "LATA"}));
		cbPresentacion.setBounds(265, 450, 250, 35);
		panel.add(cbPresentacion);
		
		JLabel lblUtilidad = new JLabel("Utilidad (%)");
		lblUtilidad.setBounds(615, 195, 76, 32);
		panel.add(lblUtilidad);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(615, 283, 76, 32);
		panel.add(lblContenido);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setBounds(615, 366, 76, 32);
		panel.add(lblUnidadDeMedida);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(615, 456, 76, 32);
		panel.add(lblTipo);
		
		cbUtilidad = new JComboBox();
		cbUtilidad.setModel(new DefaultComboBoxModel(new String[] {"5", "6", "7", "8", "9", "10", "11"}));
		cbUtilidad.setBounds(701, 189, 250, 35);
		panel.add(cbUtilidad);
		
		cbContenido = new JComboBox();
		cbContenido.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cbContenido.setBounds(701, 277, 250, 35);
		panel.add(cbContenido);
		
		cbUmedida = new JComboBox();
		cbUmedida.setModel(new DefaultComboBoxModel(new String[] {"L", "MLTs", "LTs", "GRs"}));
		cbUmedida.setBounds(701, 360, 250, 35);
		panel.add(cbUmedida);
		
		cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"BEBIDA", "PAN FRIO", "ENLATADO"}));
		cbTipo.setBounds(701, 450, 250, 35);
		panel.add(cbTipo);
		
		txtBuscar = new JTextField();
		txtBuscar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtBuscar.setText("");
			}
		});
		txtBuscar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				modelOriginal.removeAllElements();
				for (Producto producto : productos) {
					if(producto.getNombre().contains(txtBuscar.getText())){
						modelOriginal.addElement(producto.getClave()+" "+producto.getNombre());
					}
				}
				listaResultados.setVisible(true);
			}
		});
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(179, 87, 772, 35);
		panel.add(txtBuscar);
		
		JLabel lblNewLabel = new JLabel("INGRESE EL NOMBRE A BUSCAR");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(179, 40, 772, 45);
		panel.add(lblNewLabel);
		
		
		listaResultados = new JList();
		listaResultados.setVisible(false);
		listaResultados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				listaResultados.setVisible(false);
				txtBuscar.setText(String.valueOf(listaResultados.getSelectedValue()));
				String vals[]=txtBuscar.getText().split(" ");
				int id=Integer.parseInt(vals[0]);
				
				for (Producto producto : productos) {
					if(producto.getClave()==id) {
						txtNombre.setText(producto.getNombre());
						txtMarca.setText(producto.getMarca());
						cbCambio.setSelectedItem(producto.getCambio());
						cbPresentacion.setSelectedItem(producto.getPresentacion());
						cbUtilidad.setSelectedItem(String.valueOf(producto.getUtilidad()));
						cbContenido.setSelectedItem(String.valueOf(producto.getContenido()));
						cbUmedida.setSelectedItem(producto.getuMedida());
						cbTipo.setSelectedItem(producto.getTipo());
					}
				}
			}
		});
		listaResultados.setVisibleRowCount(2);
		listaResultados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaResultados.setBounds(179, 121, 772, 56);
		listaResultados.setModel(modelOriginal);
		panel.add(listaResultados);
		
		cargarTodosLosDatos();
	}
	private void cargarTodosLosDatos(){
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
		
		productos=(ArrayList<Producto>) ps.listarTodos();
	}
}
