package br.com.controle.virtual.enumerador;

public enum Tipo {
	
	ADMINISTRADOR(1,"Administrador"),
	ALUNO(2,"Aluno");
	
	private final int codigo;
	private final String descricao;
	
	Tipo(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
