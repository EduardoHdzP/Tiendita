package com.proyecto.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ProductPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ProductPanel(String titulo) {
		setBackground(new Color(102, 102, 102));
		setForeground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelDeUsuarios = new JLabel(titulo);
		lblPanelDeUsuarios.setForeground(new Color(255, 255, 255));
		lblPanelDeUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanelDeUsuarios.setFont(new Font("Cambria", Font.BOLD, 25));
		add(lblPanelDeUsuarios, BorderLayout.NORTH);
		

	}

}
