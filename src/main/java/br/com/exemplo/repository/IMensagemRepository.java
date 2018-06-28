package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.model.Mensagem;

public interface IMensagemRepository extends JpaRepository<Mensagem, Long>{

}
