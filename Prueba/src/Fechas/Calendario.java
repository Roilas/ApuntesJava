package Fechas;

import java.util.Calendar;
import java.util.Locale;


public class Calendario {
	
	public static void main (String[]args) {
	 
		Calendar cal = Calendar.getInstance();
		
		
		System.out.println("AÑO: " + cal.get(Calendar.YEAR));
		System.out.println("MES: " + cal.get(Calendar.MONTH));
		System.out.println("DIA: " + cal.get(Calendar.DATE));
		
	System.out.println();
	System.out.println(Locale.getDefault().getCountry());
	System.out.println(Locale.getDefault().getLanguage());
		
		
	}

}
