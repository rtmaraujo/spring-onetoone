package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.model.MensagemCorpo;

public interface IMensagemCorpoRepository extends JpaRepository<MensagemCorpo, Long>{

}
