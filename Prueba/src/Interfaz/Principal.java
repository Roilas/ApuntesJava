package Interfaz;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;


public class Principal {
	
	public static void main (String []args) {
	
	//Se crea una ventana de 300x300
	JFrame Marco=new JFrame("Prueba en rojo");
	Marco.setLocation(100, 100);
	Marco.setSize(300,300);
	Marco.setVisible(true);
	
	// Creamos un contenedor y lo metemos en nuestra "Ventana"
	Container PanelContenedor = Marco.getContentPane();
	Marco.getContentPane().setLayout(new BorderLayout(0, 0));
	}

}
