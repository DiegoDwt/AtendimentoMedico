package atendimento.medico;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Pessoa {
	
    private Date dataNascimento;
	private String nome;

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcularIdade(Date dataNascimento) {
		Date hj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int anoAtual = Integer.parseInt(sdf.format(hj));
		int anoNasc = Integer.parseInt(sdf.format(dataNascimento)) ;
		int idade = anoAtual - anoNasc;
		return idade;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Nome=");
		builder.append(nome);
		builder.append(", DataNascimento=");
		builder.append(sdf.format(dataNascimento));
		builder.append("]");
		return builder.toString();
	}


}
