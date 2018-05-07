package AplicacionDeFechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// import android.util.TimeFormatException;


public class App {

	public static void main(String[] args) {
		App app = new App();

		try {
//			 app.verificar(7);
//			 app.verificar(8);
			
//			 app.medirTiempo(7);
//		 app.medirTiempo(8);
			 
//		 app.periodoEntreFechas(7);
//			 app.periodoEntreFechas(8); 
			 
//			 app.convertir(7);
//			 app.convertir(8);
			 
			 

//			 //De LOCALDATE a DATE. Forma 1 (Solo fecha, hora no)
//			 LocalDate lo = LocalDate.now();
//			 Date date2 = java.sql.Date.valueOf(lo);
//			 System.out.println(date2);
			 
//			 
//			 //De LOCALDATE a DATE. Forma 2 (compleja) (Fecha "reseteada" al inicio del dia)
//			 LocalDate lo2 = LocalDate.now();
//			 Date date = Date.from(lo2.atStartOfDay(ZoneId.systemDefault()).toInstant());
//			 System.out.println(date);
//
//			 
//			 //De LOCALDATE a DATE. Forma 3 (compleja) (Con fecha y hora)
//			 LocalDateTime ldt2 = LocalDateTime.now();
//			 Date date3 = Date.from(ldt2.atZone(ZoneId.systemDefault()).toInstant());
//			 System.out.println(date3);			 
//
//			 
//			 //De DATE a LOCALDATETIME (Con fecha y hora)
//			 Date date4 = new Date();
//			 LocalDateTime ldt = Instant.ofEpochMilli(date4.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
//			 System.out.println(ldt);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verificar(int version) {
		
		if (version == 7) {
			//La "hora" de las 2 es la "hora" actual
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();
			
			fecha1.set(1991, 0, 21); //Enero
			System.out.println(fecha1.getTime().toLocaleString());
			System.out.println(fecha2.getTime().toLocaleString());
			
			System.out.println(fecha1.after(fecha2));
			System.out.println(fecha1.before(fecha2));
			System.out.println(fecha1.equals(fecha2));
			System.out.println(fecha1.compareTo(fecha2));
			
		} else if (version == 8) {
			LocalDate fecha1 = LocalDate.of(1991, 01, 21);
			LocalDate fecha2 = LocalDate.now();

			System.out.println("fecha1: " + fecha1);
			System.out.println("fecha2: " + fecha2);
			
			System.out.println("¿" + fecha1 + " isAfter " + fecha2 + "? " + fecha1.isAfter(fecha2));
			System.out.println("¿" + fecha1 + " isBefore " + fecha2 + "? " + fecha1.isBefore(fecha2));
//			System.out.println("¿" + fecha1 + " isEqual " + fecha2 + "? " + fecha1.isEqual(fecha2));

			/**********************************************/
			
			LocalTime tiempo1 = LocalTime.of(22, 30, 50);
			LocalTime tiempo2 = LocalTime.now();

			System.out.println("\ntiempo1: " + tiempo1);
			System.out.println("tiempo2: " + tiempo2);
			
			System.out.println("¿" + tiempo1 + " isAfter " + tiempo2 + "? " + tiempo1.isAfter(tiempo2));
			System.out.println("¿" + tiempo1 + " isBefore " + tiempo2 + "? " + tiempo1.isBefore(tiempo2));
			
			/**********************************************/
			
			LocalDateTime fechaTiempo1 = LocalDateTime.of(1991, 1, 21, 22, 30, 50);
			LocalDateTime fechaTiempo2 = LocalDateTime.now();

			System.out.println("\nfechaTiempo1: " + fechaTiempo1);
			System.out.println("fechaTiempo2: " + fechaTiempo2);
			
			System.out.println("¿" + fechaTiempo1 + " isAfter " + fechaTiempo2 + "? " + fechaTiempo1.isAfter(fechaTiempo2));
			System.out.println("¿" + fechaTiempo1 + " isBefore " + fechaTiempo2 + "? " + fechaTiempo1.isBefore(fechaTiempo2));
//			System.out.println("¿" + fechaTiempo1 + " isEqual " + fechaTiempo2 + "? " + fechaTiempo1.isEqual(fechaTiempo2));

		}
	}

	public void medirTiempo(int version) throws InterruptedException {
		
		if (version == 7) {
			long ini = System.currentTimeMillis(); //Se podria hacer tb con "System.nanoTime()"
			System.out.println("ini:" + ini);
			Thread.sleep(1000);
			long fin = System.currentTimeMillis();
			System.out.println(fin - ini);
			
		} else if (version == 8) {
			Instant ini = Instant.now();
			System.out.println("\nini:" + ini);
			System.out.println("ini.toEpochMilli():" + ini.toEpochMilli());
			Thread.sleep(1000);
			Instant fin = Instant.now();
			System.out.println(Duration.between(ini, fin).toMillis());
			
		}
	}

	public void periodoEntreFechas(int version) {
		if (version == 7) {
			
			//Sin usar DATE de forma intermedia.
			Calendar nacimiento = Calendar.getInstance();
			Calendar actual = Calendar.getInstance();
			
			//Prueba de que no es el mismo instante
//			System.out.println("Nacimiento: " + nacimiento.getTimeInMillis() + " <=> Actual: " + actual.getTimeInMillis());
			
//			nacimiento.set(1991, 0, 21);
//			actual.set(2017, 1, 04);
			nacimiento.set(2000, 0, 1);
			actual.set(2001, 0, 1);
			
//			System.out.println(nacimiento.getTime()); //En estas 2, la "hora" es la misma, pero los mmseg no
//			System.out.println(actual.getTime());
			
			int anios = 0;
			
			while (nacimiento.before(actual)) {
				
				nacimiento.add(Calendar.YEAR, 1);
//				System.out.println("T/F:" + nacimiento.getTime() + "<=>" + actual.getTime() + " = " + nacimiento.before(actual));				
				if (nacimiento.before(actual)) {
					anios++;
				}
			}
			System.out.println("ANYOS: " + anios);
			
		
			/************************/  System.out.println();

//			//FORMA 2 (CORRECTA): Con SETTIME y COMPARETO
//		    Calendar nacimiento = Calendar.getInstance(); 
//		    Calendar actual = Calendar.getInstance();
//
//			//Usando un DATE como objeto intermedio
//			int anyos = 0;
//			Date fechaNacimiento = new Date("2000/01/01");	
//			Date fechaactual = new Date("2001/01/01");
//			
//		    //Hay que usar estos "fechaNacimiento" y "fechaactual" pq son de tipo "Date"
//		    //y este tipo de datos no guarda milisegundos (no guarda la hora, si no se la ponemos), 
//		    //por lo tanto, no existirá el problema.
//		    nacimiento.setTime(fechaNacimiento);
//		    actual.setTime(fechaactual);		    
//		    
////		    System.out.println(nacimiento.getTime()); //En estas 2, la "hora" es 00:00:00
////		    System.out.println(actual.getTime());
//		    
//		    nacimiento.add(Calendar.YEAR, 1);
//			while (nacimiento.compareTo(actual) <= 0) {
////				System.out.println("Nacimiento: " + nacimiento.getTime() + " <=> Actual: " + actual.getTime() + " = " + nacimiento.compareTo(actual));
//				anyos++;
//				nacimiento.add(Calendar.YEAR, 1);
//			}
//			
//			System.out.println("ANYOS: " + anyos);
			
			
		} else if (version == 8) {
			LocalDate nacimiento = LocalDate.of(1994, 8, 31);
//			LocalDate actual = LocalDate.of(1994, 1, );
			LocalDate actual = LocalDate.now();

			Period periodo = Period.between(nacimiento, actual);
			System.out.println("Han transcurrido " + periodo.getYears() + " a�os y " + periodo.getMonths() + " meses y "
					+ periodo.getDays() + " dias, desde " + nacimiento + " hasta " + actual);
			
		}
	}

	public static Date setMidnight(Date date) {
//		fechaNacimiento = setMidnight(fechaNacimiento); 
//		fechaactual = setMidnight(fechaactual);
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.set(Calendar.HOUR_OF_DAY, 0);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);
	    return calendar.getTime();
	}

	public void convertir(int version) throws ParseException {
		if (version == 7) {
			
			//De cadena a DATE:
			String fecha = "21--01--1991";
//			fecha = "01/21/1991";
			System.out.println("El String: " + fecha);
			
			DateFormat formateador = new SimpleDateFormat("dd--MM--yyyy");
//			DateFormat formateador = new SimpleDateFormat("MM/dd/yyyy");
			
			Date fechaConvertida = formateador.parse(fecha);
			System.out.println("La fechaConvertida: " + fechaConvertida.toLocaleString());
			//Si no ponemos "toLocaleString", sale en formato ENG.

			/********************/
			
			//De DATE a cadena:
			//Las 4 formas de conseguir la fecha-hora actual (realmente son solo las 2 primeras):
			//Forma 1
			Date fechaActual = Calendar.getInstance().getTime();
			
			//Forma 2
//			Date fechaActual = new Date();
			
			//Forma 3 (es la misma que la forma 1)
//			Calendar f = Calendar.getInstance();
//			Date fechaActual = f.getTime();
			
			//Forma 4: Pero esta no nos sirve. "format" necesita un DATE como parametro.
//			Calendar fechaActual = Calendar.getInstance();
			
			System.out.println("\nLa fechaActual: " + fechaActual.toLocaleString());
			
			formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy HH:mm:ss a");
//			formateador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS a");
			
			String fechaCadena = formateador.format(fechaActual);
			System.out.println("La fechaCadena: " + fechaCadena);
			
		} else if (version == 8) {
			
			//De cadena a LOCALDATE:
			String fecha = "21/01/1991";
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
			System.out.println(fechaLocal);
			
//			//A veces no es necesario el "formateador"
//			String fecha2 = "1991-01-21";
//			LocalDate fechaLocal2 = LocalDate.parse(fecha2);
//			System.out.println("Sin formateador: " + fechaLocal2);
//			System.out.println("Sin formateador: " + fechaLocal2.getDayOfMonth());
			
//			//De cadena a LOCALTIME:
//			String hora = "19:05:30";
//			DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");
//			LocalTime lt = LocalTime.parse(hora, formateadorHora);
//			System.out.println("lt: " + lt);

			
			/********************/
			
			//De LOCALDATE a cadena:
			LocalDate fechaLoc = LocalDate.now();
			DateTimeFormatter formateador2 = DateTimeFormatter.ofPattern("dd~MM~yyyy");
			String fechaCadena = formateador2.format(fechaLoc);
			System.out.println(fechaCadena);
			

//			//De LOCALDATETIME a cadena
//			LocalDateTime fe = LocalDateTime.now();
//			DateTimeFormatter formateador3 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy HH:mm:ss a");
//			System.out.println(formateador3.format(fe));
			
			
//			//De LOCALTIME a cadena:
//			LocalTime lt2 = LocalTime.now();
//			DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");
//			String cad = formateadorHora.format(lt2);
//			System.out.println("cad: " + cad);
		}
	}


}
