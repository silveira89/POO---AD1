
public class ServidorEmails {
	CaixaPostal[] servidor = new CaixaPostal[4];
	int i = 0;
	
	public ServidorEmails() {
		
	}

	public void adicionaCaixa(CaixaPostal nome) {
		servidor[i] = nome;
		i++;
		
	}

	public void enviaEmail(Email email) {
		for (int j = 0; j < servidor.length; j++) {
			for (int k = 0; k < email.destinatarios.length; k++) {
				if (servidor[j].nome == email.destinatarios[k]) {
					servidor[j].remetente = email.remetente;
					servidor[j].destinatarios = email.destinatarios;
					servidor[j].titulo = email.titulo;
					servidor[j].mensagem = email.mensagem;
				}
			}
		}
	}

	public void encaminhaEmail(Email email, String destinatario) {
		for (int j = 0; j < servidor.length; j++) {
			if (servidor[j].nome == destinatario) {
				servidor[j].remetente = email.remetente;
				servidor[j].destinatarios = email.destinatarios;
				servidor[j].titulo = email.titulo;
				servidor[j].mensagem = email.mensagem;
			}
		}
	}
}
