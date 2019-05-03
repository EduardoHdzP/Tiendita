package com.proyecto.views.productos;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Producto;
import com.proyecto.services.ProductoService;
import com.proyecto.views.OptionPanel;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class VistaEliminarProducto extends JPanel {
	
	private JTextField txtNombre;
	
	DefaultListModel<String> modelOriginal = new DefaultListModel(); 
	private JList listaResultados;
	
	ArrayList<Producto> productos;
	private JLabel datoNombre;
	private JLabel datoMarca;
	private JLabel datoCambio;
	private JLabel datoPresentacion;
	private JLabel datoUtilidad;
	private JLabel datoContenido;
	private JLabel datouMedida;
	private JLabel datoTipo;

	/**
	 * Create the panel.
	 */
	public VistaEliminarProducto() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblRegistroDeProductos = new JLabel("ELIMINAR PRODUCTO  ");
		lblRegistroDeProductos.setForeground(new Color(255, 255, 255));
		lblRegistroDeProductos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRegistroDeProductos.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblRegistroDeProductos, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(179, 187, 76, 32);
		panel.add(lblNombre);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(179, 275, 76, 32);
		panel.add(lblMarca);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(179, 358, 76, 32);
		panel.add(lblCambio);
		
		JLabel lblPresentacion = new JLabel("Presentacion");
		lblPresentacion.setBounds(179, 448, 76, 32);
		panel.add(lblPresentacion);
		
		JLabel lblUtilidad = new JLabel("Utilidad (%)");
		lblUtilidad.setBounds(615, 190, 76, 32);
		panel.add(lblUtilidad);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(615, 278, 76, 32);
		panel.add(lblContenido);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setBounds(615, 361, 76, 32);
		panel.add(lblUnidadDeMedida);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(615, 451, 76, 32);
		panel.add(lblTipo);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtNombre.setText("");
			}
		});
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				modelOriginal.removeAllElements();
				for (Producto producto : productos) {
					if(producto.getNombre().contains(txtNombre.getText())){
						modelOriginal.addElement(producto.getClave()+" "+producto.getNombre());
					}
				}
				listaResultados.setVisible(true);
			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(179, 87, 772, 35);
		panel.add(txtNombre);
		
		JLabel lblNewLabel = new JLabel("INGRESE EL NOMBRE DEL PRODUCTO");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(179, 40, 772, 45);
		panel.add(lblNewLabel);
		
		datoNombre = new JLabel("Datos");
		datoNombre.setOpaque(true);
		datoNombre.setBackground(new Color(0, 128, 128));
		datoNombre.setBounds(265, 186, 248, 35);
		panel.add(datoNombre);
		
		datoMarca = new JLabel("Datos");
		datoMarca.setOpaque(true);
		datoMarca.setBackground(new Color(0, 128, 128));
		datoMarca.setBounds(265, 272, 248, 35);
		panel.add(datoMarca);
		
		datoCambio = new JLabel("Datos");
		datoCambio.setOpaque(true);
		datoCambio.setBackground(new Color(0, 128, 128));
		datoCambio.setBounds(265, 355, 248, 35);
		panel.add(datoCambio);
		
		datoPresentacion = new JLabel("Datos");
		datoPresentacion.setOpaque(true);
		datoPresentacion.setBackground(new Color(0, 128, 128));
		datoPresentacion.setBounds(265, 445, 248, 35);
		panel.add(datoPresentacion);
		
		datoUtilidad = new JLabel("Datos");
		datoUtilidad.setOpaque(true);
		datoUtilidad.setBackground(new Color(0, 128, 128));
		datoUtilidad.setBounds(703, 184, 248, 35);
		panel.add(datoUtilidad);
		
		datoContenido = new JLabel("Datos");
		datoContenido.setOpaque(true);
		datoContenido.setBackground(new Color(0, 128, 128));
		datoContenido.setBounds(703, 272, 248, 35);
		panel.add(datoContenido);
		
		datouMedida = new JLabel("Datos");
		datouMedida.setOpaque(true);
		datouMedida.setBackground(new Color(0, 128, 128));
		datouMedida.setBounds(703, 355, 248, 35);
		panel.add(datouMedida);
		
		datoTipo = new JLabel("Datos");
		datoTipo.setOpaque(true);
		datoTipo.setBackground(new Color(0, 128, 128));
		datoTipo.setBounds(703, 445, 248, 35);
		panel.add(datoTipo);
		
		
		
		listaResultados = new JList();
		listaResultados.setBackground(new Color(230, 230, 250));
		listaResultados.setVisible(false);
		listaResultados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				listaResultados.setVisible(false);
				txtNombre.setText(String.valueOf(listaResultados.getSelectedValue()));
				String vals[]=txtNombre.getText().split(" ");
				int id=Integer.parseInt(vals[0]);
				
				for (Producto producto : productos) {
					if(producto.getClave()==id) {
						datoNombre.setText(producto.getNombre());
						datoMarca.setText(producto.getMarca());
						datoCambio.setText(producto.getCambio());
						datoPresentacion.setText(producto.getPresentacion());
						datoUtilidad.setText(String.valueOf(producto.getUtilidad()));
						datoContenido.setText(String.valueOf(producto.getContenido()));
						datouMedida.setText(producto.getuMedida());
						datoTipo.setText(producto.getTipo());
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
	
	public void limpiarEntradas(){
		txtNombre.setText("");
		datoNombre.setText("");
		datoMarca.setText("");
		datoUtilidad.setText("");
		datoContenido.setText("");
		datouMedida.setText("");
		datoTipo.setText("");
		datoCambio.setText("");
		datoPresentacion.setText("");
	}
	
	public boolean eliminarProducto(){
		
		return true;
	}
	
}
