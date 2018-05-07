
package Fechas;

import java.util.Date;

public class Principal {
	
	public static void main(String []args ) {
		
		Date fecha = new Date("2017/11/26 15:30:28:10");
		
		System.out.println(fecha.getDate());
		System.out.println(fecha.toLocaleString());
		System.out.println(fecha.getYear());
		System.out.println(fecha.getMonth());
		System.out.println(fecha.getDay());
		

	}

}

