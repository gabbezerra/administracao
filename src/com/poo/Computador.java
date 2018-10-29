package com.poo;
import java.time.LocalDate;

public class Computador {

	private String ip;
	private String marca;
	private String modelo;
	private LocalDate dataAquisicao;
	
	public Computador(String ip, String marca, String modelo, LocalDate dataAquisicao) {
		this.ip = ip;
		this.marca = marca;
		this.modelo = modelo;
		this.dataAquisicao = dataAquisicao;
	}
	public Computador() {
		this.ip = "";
		this.marca = "";
		this.modelo = "";
		this.dataAquisicao = null;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public String toString() {
		return "Computador [ip=" + ip + ", marca=" + marca + ", modelo=" + modelo + ", dataAquisicao=" + dataAquisicao
				+ "]";
	}
	
}


