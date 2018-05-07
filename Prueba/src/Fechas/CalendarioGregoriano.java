package Fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


public class CalendarioGregoriano {
	
	public static void main (String [] args) {
		
		Calendar calendario = new GregorianCalendar();
		
		System.out.println(calendario.getTime());
		
		
	}
}
