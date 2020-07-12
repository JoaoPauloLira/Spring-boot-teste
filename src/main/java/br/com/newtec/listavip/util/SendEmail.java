package br.com.newtec.listavip.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {
	public void enviar(String assunto, String enviarParaQuem, String mensagem) {

		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("newtec.testes.jp@gmail.com", "*********"));
			email.setSSLOnConnect(true);

			email.setFrom("newtec.testes.jp@gmail.com");
			email.setSubject(assunto);
			email.setMsg(mensagem);
			email.addTo(enviarParaQuem);
			email.send();

		} catch (EmailException e) {
			e.printStackTrace();
		}

	}
}
