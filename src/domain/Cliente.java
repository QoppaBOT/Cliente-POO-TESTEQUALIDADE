package domain;

//. Sobre os contratos, s�o necess�rias as informa��es: n�mero do

//contrato (gerado automaticamente pelo sistema), CPF, nome e endere�o do cliente, lista
//de ve�culos locados naquele contrato, quantidade de dias de loca��o e valor total do
//contrato. 

public class Cliente {

	private String nome;
	private String endereco;
	private String cpf;

	public Cliente(String nome, String endereco, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
