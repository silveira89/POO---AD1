
public class Email {

	int j = 0;
	public String remetente;
	public String[] destinatarios;
	public String titulo;
	public String mensagem;

	public Email(String remetente, String[] destinatarios, String titulo, String mensagem) {
		this.remetente = remetente;
		this.destinatarios = new String[destinatarios.length];
		for (int i = 0; i < destinatarios.length; i++) {
			this.destinatarios[i] = destinatarios[i];
		}
		this.titulo = titulo;
		this.mensagem = mensagem;
	}
}
