package br.com.alura.mvc.mudi.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseRepository {
	@PersistenceContext
	public EntityManager em;
}
