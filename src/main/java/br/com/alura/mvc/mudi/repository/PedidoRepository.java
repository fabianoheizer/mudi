package br.com.alura.mvc.mudi.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository extends BaseRepository{
	
	public List<Pedido> buscarTodosPedidos(){
		Query query = em.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
	}
}
