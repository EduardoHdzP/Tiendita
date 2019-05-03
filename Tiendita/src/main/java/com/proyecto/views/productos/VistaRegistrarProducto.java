package com.proyecto.views.productos;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VistaRegistrarProducto extends JPanel {
	private JTextField txtNombre;
	private JTextField txtMarca;
	
	private OptionPanel optionPanel;
	private JComboBox cbUtilidad;
	private JComboBox cbContenido;
	private JComboBox cbUmedida;
	private JComboBox cbTipo;
	private JComboBox cbCambio;
	private JComboBox cbPresentacion;

	/**
	 * Create the panel.
	 */
	public VistaRegistrarProducto() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblRegistroDeProductos = new JLabel("REGISTRO DE PRODUCTOS  ");
		lblRegistroDeProductos.setBackground(Color.WHITE);
		lblRegistroDeProductos.setForeground(Color.BLACK);
		lblRegistroDeProductos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRegistroDeProductos.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblRegistroDeProductos, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(179, 106, 76, 32);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
				ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
				if(!txtNombre.getText().isEmpty()){
					if(ps.existe(txtNombre.getText())) {
						JOptionPane.showMessageDialog(null, "El producto ya existe");
						txtNombre.setText("");
						txtNombre.requestFocus();
					}
				}
			}
		});
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				txtNombre.setText(txtNombre.getText().toUpperCase());
			}
		});
		txtNombre.setBounds(265, 103, 250, 35);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(179, 194, 76, 32);
		panel.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtMarca.setText(txtMarca.getText().toUpperCase());
			}
		});
		txtMarca.setColumns(10);
		txtMarca.setBounds(265, 191, 250, 35);
		panel.add(txtMarca);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(179, 277, 76, 32);
		panel.add(lblCambio);
		
		JLabel lblPresentacion = new JLabel("Presentacion");
		lblPresentacion.setBounds(179, 367, 76, 32);
		panel.add(lblPresentacion);
		
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
		
		cbUtilidad = new JComboBox();
		cbUtilidad.setModel(new DefaultComboBoxModel(new String[] {"5", "6", "7", "8", "9", "10", "11"}));
		cbUtilidad.setBounds(701, 103, 250, 35);
		panel.add(cbUtilidad);
		
		cbContenido = new JComboBox();
		cbContenido.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cbContenido.setBounds(701, 191, 250, 35);
		panel.add(cbContenido);
		
		cbUmedida = new JComboBox();
		cbUmedida.setModel(new DefaultComboBoxModel(new String[] {"L", "MLTs", "LTs", "GRs"}));
		cbUmedida.setBounds(701, 274, 250, 35);
		panel.add(cbUmedida);
		
		cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"BEBIDA", "PAN FRIO", "ENLATADO"}));
		cbTipo.setBounds(701, 364, 250, 35);
		panel.add(cbTipo);
		
		cbCambio = new JComboBox();
		cbCambio.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
		cbCambio.setBounds(265, 276, 250, 35);
		panel.add(cbCambio);
		
		cbPresentacion = new JComboBox();
		cbPresentacion.setModel(new DefaultComboBoxModel(new String[] {"BOTELLA", "BOTELLA RETORNABLE", "BOLSA", "LATA"}));
		cbPresentacion.setBounds(265, 364, 250, 35);
		panel.add(cbPresentacion);
	}
	
	public void limpiarEntradas(){
		txtNombre.setText("");
		txtMarca.setText("");
		cbUtilidad.setSelectedIndex(0);
		cbContenido.setSelectedIndex(0);
		cbUmedida.setSelectedIndex(0);
		cbTipo.setSelectedIndex(0);
		cbCambio.setSelectedIndex(0);
		cbPresentacion.setSelectedIndex(0);
	}
	private boolean entradasValidas(){
		return !txtNombre.getText().isEmpty() && !txtMarca.getText().isEmpty();
	}
	
	public void registrarProducto(){
		if (entradasValidas()) {
			ApplicationContext appContext=new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
			ProductoService ps=(ProductoService) appContext.getBean("productoServiceImpl");
			
			Producto p=new Producto();
			p.setClave(100);
			p.setNombre(txtNombre.getText());
			p.setMarca(txtMarca.getText());
			p.setCambio(String.valueOf(cbCambio.getSelectedItem()));
			p.setPresentacion(String.valueOf(cbPresentacion.getSelectedItem()));
			p.setUtilidad(Float.valueOf(String.valueOf(cbUtilidad.getSelectedItem())));
			p.setContenido(Float.valueOf(String.valueOf(cbContenido.getSelectedItem())));
			p.setuMedida(String.valueOf(cbUmedida.getSelectedItem()));
			p.setTipo(String.valueOf(cbTipo.getSelectedItem()));
			
			
			try {
				System.out.println("Resultado:"+ps.registrar(p));
				limpiarEntradas();
				
			} catch (Exception e) {
				System.out.println("Error: "+e.toString());
				JOptionPane.showMessageDialog(null, "Ha ocurrido un error");

			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Llene todos los campos");
		}
		
	}
}
