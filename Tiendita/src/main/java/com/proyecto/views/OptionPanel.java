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

	/**
	 * Create the panel.
	 */
	public OptionPanel() {
		setBackground(Color.ORANGE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setHorizontalTextPosition(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 20));
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setFont(new Font("Sylfaen", Font.BOLD, 20));
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD, 20));
		add(btnNewButton_2);
		
		
	}

}
