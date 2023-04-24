package view;

import java.util.Random;

import controller.FatorialController;

public class main {
	public static void main(String[] args) {
		Random gerador = new Random();
		int valor = gerador.nextInt(13);
		FatorialController f = new FatorialController();
		System.out.println("Fatorial desejado: " + valor);
		valor=f.Calculafatorial(valor);
		System.out.println("Resultado:"+valor);
	}
}
