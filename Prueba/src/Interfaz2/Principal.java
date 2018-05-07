package Interfaz2;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Principal {
	
	public static void main (String[] args) {
		
		//Abajo hacemos un objeto JPanel de 300x300 rojo
		JPanel PanelRojo = new JPanel();
		PanelRojo.setBackground(Color.RED);
		PanelRojo.setSize(300,300);
		
		JLabel Etiqueta1 = new JLabel("Hola mundo");
		
		JFrame Marco1 = new JFrame("HolaMundoSwing");
		Marco1.setSize(300,400);
		
		
		
		Marco1.getContentPane().add(Etiqueta1);
		
		Marco1.getContentPane().add(PanelRojo);
		
		Marco1.pack();
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Marco1.addWindowListener(new java.awt.event.WindowAdapter() {
		
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		}
		);
		
		Marco1.pack();
		Marco1.setVisible(true);
		
		
	}

}
