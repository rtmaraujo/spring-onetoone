package br.com.exemplo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mensagem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String assunto;
	@Temporal(TemporalType.DATE)
	@Column(name="dataenvio")
	private Date dataEnvio;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mensagemcorpo_id")
	private MensagemCorpo mensagemCorpo;

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MensagemCorpo getMensagemCorpo() {
		return mensagemCorpo;
	}

	public void setMensagemCorpo(MensagemCorpo mensagemCorpo) {
		this.mensagemCorpo = mensagemCorpo;
	}

}
