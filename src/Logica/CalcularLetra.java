package Logica;

import java.util.ArrayList;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
	ArrayList <Character> letras;
	private String dni="";
	private int dni_numero=0;
	private char letra=' ';
	
	//El constructor recibe el DNI en formato String
	public CalcularLetra(String dni) {
		letras = new ArrayList <Character>();
		this.dni=dni;
		letras.add('T');
		letras.add('R');
		letras.add('W');
		letras.add('A');
		letras.add('G');
		letras.add('M');
		letras.add('Y');
		letras.add('F');
		letras.add('P');
		letras.add('D');
		letras.add('X');
		letras.add('B');
		letras.add('N');
		letras.add('J');
		letras.add('Z');
		letras.add('S');
		letras.add('Q');
		letras.add('V');
		letras.add('H');
		letras.add('L');
		letras.add('C');
		letras.add('K');
		letras.add('E');	
	}
	
	//Realiza el calculo
	public char devolverLetra(){
		try{
			int dniAInt = Integer.parseInt(dni);
			int resto = dniAInt%23;
			
			letra =letras.get(resto);
			
			}catch (Exception e) {
		letra = '1';
		}
		return this.letra;
	}

}
