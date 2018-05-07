package Ejemplospoo;

public class coche {
	
	/****************************************************/
	
	protected int Ruedas = 4;
	protected String Motor;
	String asientoCopiloto;
	private String mp3;
	
	/****************************************************/
	
	/*
	 * public coche(String p_Motor,String p_asientoCopiloto,String mp3) {
	 * 
	 * Motor = p_Motor;
	 * asientoCopiloto = p_asientoCopiloto
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	

	/*********************************************/

	public int getRuedas() {

		return Ruedas;

	}
	
	public String getMotor() {
		if (Motor == null) {
			Motor = "Sin Motor";
		}
		return Motor;
	}

	
	public String getAsientoCopiloto() {
		return asientoCopiloto;
	}
	/*************************************/


}
