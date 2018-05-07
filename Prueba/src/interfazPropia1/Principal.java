package interfazPropia1;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String [] args) {
		

		
		JOptionPane.showMessageDialog(null, "bienvenido");
		JOptionPane.showMessageDialog(null, "Arrancando el mejor programa del mundo...","Titulo", JOptionPane.INFORMATION_MESSAGE);
		/*
		Iconos por defecto:
		 INFORMATION_MESSAGE
		 WARNING_MESSAGE
		 QUESTION_MESSAGE
		 PLAIN_MESSAGE
		 ERROR_MESSAGE
		 */
		Usuario UsuarioActual = new Usuario();
		
		String RespuestaUsuario;
		int ValorRespuesta;
		
		RespuestaUsuario = JOptionPane.showInputDialog(null, "¿Como te llamas?", "Inicializando...", JOptionPane.QUESTION_MESSAGE);
		UsuarioActual.setNombre(RespuestaUsuario);
		ValorRespuesta = (RespuestaUsuario.compareTo(""));
	
		
while(ValorRespuesta == 0) {
	JOptionPane.showMessageDialog(null, "No has introducido ningun nombre","Titulo", JOptionPane.ERROR_MESSAGE);
	RespuestaUsuario = JOptionPane.showInputDialog(null, "¿Como te llamas?", "Inicializando...", JOptionPane.QUESTION_MESSAGE);
	
	UsuarioActual.setNombre(RespuestaUsuario);
	ValorRespuesta = (RespuestaUsuario.compareTo(""));
}
		
		
		switch(RespuestaUsuario) {
		
		case "":
			
			JOptionPane.showMessageDialog(null, "No has introducido ningun nombre","Titulo", JOptionPane.ERROR_MESSAGE);
			RespuestaUsuario = JOptionPane.showInputDialog(null, "¿Como te llamas?", "Inicializando...", JOptionPane.QUESTION_MESSAGE);
			
			UsuarioActual.setNombre(RespuestaUsuario);
			

			break;
			
		case "Saul":
			
			JOptionPane.showMessageDialog(null, "Bienvenido amo y señor de este programa");
			break;
		default:
			
			JOptionPane.showMessageDialog(null, "Bienvenido usuario estandar: " + UsuarioActual.getNombre());
			break;
		}
		
		
		String [] OpcionesPrincipales = {
				"Cuentame un chiste",
				"Haz una suma",
				"Ponme un bucle infinito",
				"Cierra el programa"
		};
		
	while(true) {
		while(true) {
		
RespuestaUsuario = (String) JOptionPane.showInputDialog(null, "¿Que te apetece hacer hoy?", "Opciones", JOptionPane.DEFAULT_OPTION, null, OpcionesPrincipales, OpcionesPrincipales[0]);
		
		JOptionPane.showMessageDialog(null, "Tu respuesta fue " + RespuestaUsuario);
		switch(RespuestaUsuario) {
		case "Cuentame un chiste":
			
			
			JOptionPane.showMessageDialog(null, "Chiste");
			
			
			break;
		case "Haz una suma":
			
			
			break;
		case "Ponme un bucle infinito":
			
			ValorRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
			JOptionPane.showMessageDialog(null, "Tu respuesta fue " + ValorRespuesta);
			switch(ValorRespuesta) {
			case 0:
				while(true) {
					JOptionPane.showMessageDialog(null, "Bucle infiniiiiiitooooooo");
				}
			case 1:
				
				break;
			}
			break;
			
		case "Cierra el programa":
			
			
			JOptionPane.showMessageDialog(null, "Adeu","Titulo", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			break;
		}
			
	}
		
		
		
		}
		
		
	}
	}

