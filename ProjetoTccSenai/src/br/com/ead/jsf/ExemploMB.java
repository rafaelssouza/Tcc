package br.com.ead.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ExemploMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	public ExemploMB() {
		System.out.println("Criando uma instancia de ExemploMB");
	}
	
	public void setNome(String nome) {
		System.out.println("Alterando o nome para " + nome);
		this.nome = nome;
	}
	
	public String getNome() {
		System.out.println("Obtendo Nome: " + nome);
		return nome;
	}
	
	public void executar() {
		System.out.println("Invocando metodo executar() ...");
		System.out.println("Nome digitado: " + nome);
	}

}
