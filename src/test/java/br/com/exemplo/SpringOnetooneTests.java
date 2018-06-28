package br.com.exemplo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.exemplo.model.Mensagem;
import br.com.exemplo.repository.IMensagemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringOnetooneTests {

	
	@Autowired
	private IMensagemRepository iMensagemRepository;
	
	@Test
	public void contextLoads() {
		Mensagem mensagem = iMensagemRepository.findOne(1L);
		Assert.assertEquals("Teste", mensagem.getAssunto());
		Assert.assertEquals("corpo do teste", mensagem.getMensagemCorpo().getDescricao());
	}

}
