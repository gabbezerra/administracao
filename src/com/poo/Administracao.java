package com.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Administracao {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RedeDeComputadores rc = new RedeDeComputadores();

		char continuar = 's';

		while (continuar == 's') {

			Computador c1 = new Computador();
			c1.setIp(sc.nextLine());
			c1.setModelo(sc.nextLine());
			c1.setMarca(sc.nextLine());
			// continuar = sc.nextLine();
			c1.setDataAquisicao(LocalDate.now());
			System.out.println(c1.toString());
			
		}
		

		/*
		 * Computador rcc = new Computador("192.168.0.2", "Dell", "Windows",
		 * LocalDate.now()); rc.setIp("192.168.0.1"); rc.adicionaComputadorNaLista(rcc);
		 * rc.adicionaComputadorNaLista(new Computador("192.168.0.2", "apple", "macOs",
		 * LocalDate.now())); //System.out.println(rc);
		 * rc.listaComputadoresPorMarca("Dell");
		 */

	}
}
