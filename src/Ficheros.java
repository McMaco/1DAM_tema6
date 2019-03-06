/***PROGRAMA DE FICEHROS
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 28/02/2019
 * CURSO: DM1B
 */

import java.io.*;

public class Ficheros {
	
	public static void main(String [] args) {
		//NOMBRE Y APELLIDOS, DIRECCION, C.P, LOCALIDAD, PROVINCIA, TELEFONO, EDAD
		
		FileOutputStream f=null;
		String nom = "David";
		String ap = "McConnell Vicente";
		String dir = "Poeta Jesús Rasueros, 21, 5ºA";
		String cod = "37006";
		String loca = "Salamanca";
		String prov = "Salamanca";
		String tel = "637626879";
		String edad = "19";
		char c = 0;
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<nom.length(); i++) {
				c = nom.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<ap.length(); i++) {
				c = ap.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<dir.length(); i++) {
				c = dir.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<cod.length(); i++) {
				c = cod.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<loca.length(); i++) {
				c = loca.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<prov.length(); i++) {
				c = prov.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<tel.length(); i++) {
				c = tel.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			f = new FileOutputStream("datos.txt");
			for(int i=0; i<edad.length(); i++) {
				c = edad.charAt(i);
				f.write((byte)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				f.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
