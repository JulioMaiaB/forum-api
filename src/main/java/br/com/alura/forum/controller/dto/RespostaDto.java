package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Resposta;
import lombok.Getter;

@Getter
public class RespostaDto {
	
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String autor;
	
	public RespostaDto(Resposta resposta) {
		id = resposta.getId();
		mensagem = resposta.getMensagem();
		dataCriacao = resposta.getDataCriacao();
		autor = resposta.getAutor().getNome();
	}
	
}
