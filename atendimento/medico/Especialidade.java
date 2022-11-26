package atendimento.medico;

public class Especialidade {

	private String descricao;

	public String getEspecialidade() {
		return descricao;
	}

	public void setEspecialidade(String especialidade) {
		this.descricao = especialidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
}
