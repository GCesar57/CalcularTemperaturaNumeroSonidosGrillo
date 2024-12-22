package com.estructurasSelectivas.com.ejercicio2;

import java.util.Scanner;

public class CalcularTemperaturaNumeroSonidosGrillo {

	public static void main(String[] args) {
		//Escribe un algoritmo que calcule la temperatura de acuerdo con el número
		//de sonidos emitidos por un grillo.
		Scanner entrada = new Scanner(System.in);
		double numero, temperatura;
		System.out.println("Ingrese el numero de sonidos emitidos por el grillo: ");
		numero = entrada.nextDouble();
		if(numero>0) {
			temperatura = (numero/4)+40;
			System.out.println("La temperatura es: "+temperatura);
		}//
		entrada.close();
	}
	//87

}
