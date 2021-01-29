package mz.co.pensao.entidade;

public class Pensao {
	private String nomeDoEstudante;
	private int numeroCelular;
	private int numeroDoQuarto;
	private String email;
	public String getNomeDoEstudante() {
		return nomeDoEstudante;
	}
	public void setNomeDoEstudante(String nomeDoEstudante) {
		this.nomeDoEstudante = nomeDoEstudante;
	}
	public int getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}
	public void setNumeroDoQuarto(int numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Pensao [nomeDoEstudante=" + nomeDoEstudante + ", numeroCelular=" + numeroCelular + ", numeroDoQuarto="
				+ numeroDoQuarto + ", email=" + email + "]";
	}
	public Pensao(String nomeDoEstudante, int numeroCelular, int numeroDoQuarto, String email) {
		
		this.nomeDoEstudante = nomeDoEstudante;
		this.numeroCelular = numeroCelular;
		this.numeroDoQuarto = numeroDoQuarto;
		this.email = email;
	}

}
