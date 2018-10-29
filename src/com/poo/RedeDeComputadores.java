package com.poo;

import java.time.LocalDate;
import java.util.Arrays;

public class RedeDeComputadores {

	/*
	 * A classe RedeDeComputadores possui os seguintes atributos: ip:String,
	 * listaComputadores:Computadores[ ]. Essa classe deve possuir no mínimo dois
	 * construtores, os métodos gets e sets, o método toString, e os métodos de
	 * comportamento listados abaixo (o array de Computadores pode ter um tamanho
	 * fixo de 50):
	 * 
	 * void adicionaComputadorNaLista(Computador c) void
	 * listaComputadoresPorMarca(String marca) void
	 * listaComputadoresPorModelo(String modelo) Computador[]
	 * ordenaComputadoresPorDataAquisição() Int
	 * qtdComputadoresAdquiridosAposData(LocaDate data)
	 * 
	 */
	private String ip;
	private Computador[] listaComputadores;

	public RedeDeComputadores(String ip, Computador[] listaComputadores) {
		this.ip = ip;
		this.listaComputadores = listaComputadores;
	}

	public RedeDeComputadores() {
		this.ip = "";
		this.listaComputadores = new Computador[10];
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Computador[] getListaComputadores() {
		return listaComputadores;
	}

	public void setListaComputadores(Computador[] listaComputadores) {
		this.listaComputadores = listaComputadores;
	}

	public String toString() {
		return "RedeDeComputadores [ip=" + ip + ", listaComputadores=" + Arrays.toString(listaComputadores) + "]";
	}

	public void adicionaComputadorNaLista(Computador c) {
		for (int i = 0; i <= getListaComputadores().length; i++) {
			if (listaComputadores[i]==null) {
				listaComputadores[i]= c;
				break;
			}
			System.out.println(listaComputadores[i]);
		}
	}

	public void listaComputadoresPorMarca(String marca) {
		for (Computador c : getListaComputadores()) {
			if (c.getMarca().equalsIgnoreCase(marca)) {
				System.out.println(c.toString());
			}
		}
	}

	public void listaComputadoresPorModelo(String modelo) {

		for (Computador c : getListaComputadores()) {
			if (c.getModelo().equalsIgnoreCase(modelo)) {
				System.out.println(c.toString());
			}
		}
	}

	public Computador[] ordenaComputadoresPorDataAquisicao() {
		Computador[] c = new Computador[10];
		Arrays.sort(c, 0, 10);
		return c;
	}

	public int qtdComputadoresAdquiridosAposData(LocalDate data) {
		int i = 0;
		for (Computador c : getListaComputadores()) {
			if (c.getDataAquisicao().isAfter(data)) {
				i++;
			}
		}
		return i;
	}

	private LocalDate compararDatas(LocalDate data1, LocalDate data2) {
		LocalDate d = null;
		if (data1.compareTo(data2) > 0) {
			d = data1;
		} else {
			d = data2;
		}
		return d;
	}

}
