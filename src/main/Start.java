package main;

import java.util.ArrayList;

import ficheros.FicheroReader;

public class Start {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> c = FicheroReader.procesarDatos(".//datos.txt");
		System.out.println(c);
		
	}
}
