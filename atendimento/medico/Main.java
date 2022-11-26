package atendimento.medico;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Main {

	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa();
		p.setNome("João");
		String nasc = "12/09/1988";
		
		Date dataNasc = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			dataNasc = sdf.parse(nasc);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		p.setDataNascimento(dataNasc);
		
		System.out.println(p);
		System.out.println("Idade: " + p.calcularIdade(dataNasc) + " anos");
		
				
		Atendimento atendimento = new Atendimento();
		Atestado atestado = new Atestado();
		
		atestado.emitirAtestado(atendimento);
		
		
		}

}