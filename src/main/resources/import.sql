insert into mensagemcorpo (id, descricao) values (null, 'corpo do teste');
insert into mensagem (id, assunto, dataenvio, mensagemcorpo_id) values (null, 'Teste', current_date(), 1L);