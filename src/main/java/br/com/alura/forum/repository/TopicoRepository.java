package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

//nas intrface não precisa usar nenhuma anotação
public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
