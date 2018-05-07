package Listas2;

import java.util.Comparator;

public class NombreYEdadadComparator implements Comparator<Persona> {

	@Override

	public int compare(Persona per1, Persona per2) {

		if (per1.getNombre() == per2.getNombre()) {

			return per1.getId() - per2.getId();

		} else {
			return per1.getNombre().compareTo(per2.getNombre());
		}

	}

}
