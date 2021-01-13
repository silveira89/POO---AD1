import java.util.Arrays;

public class CaixaPostal {

	public String nome;
	public String remetente;
	public String[] destinatarios = new String[4];
	public String titulo;
	public String mensagem;

	public CaixaPostal(String nome) {
		this.nome = nome;
		this.remetente = "";
		for (int i = 0; i < destinatarios.length; i++) {
			this.destinatarios[i] = "";
		}
		this.titulo = "";
		this.mensagem = "";
	}

	@Override
	public String toString() {
		String saida = ">>> Caixa Postal de " + nome + " <<<";
		if (remetente != "") {
			saida += "\nDe: " + remetente + "\nPara: " + Arrays.toString(destinatarios) + "\n" + titulo + "\n" + mensagem + "\n";
		} else {
			saida += "\n\n";
		}
		
		return saida;
	}
}
