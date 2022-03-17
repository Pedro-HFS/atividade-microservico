package br.fiap.atividade.atividade.model;

public class Moto {
	private double peso;
	private String modelo;
	private String fabricante;
	private int ano;
	private int cilindradas;
	private double preco;
	
	
	public Moto() {
		super();
	}


	public Moto(double peso, String modelo, String fabricante, int ano, int cilindradas, double preco) {
		super();
		this.peso = peso;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.cilindradas = cilindradas;
		this.preco = preco;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getCilindradas() {
		return cilindradas;
	}


	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
