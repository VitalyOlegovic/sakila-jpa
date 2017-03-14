package sakilajpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sakilajpa.model.Actor;
import sakilajpa.util.JPAUtil;

public class ActorDAO {

	private final static Logger logger = LoggerFactory.getLogger(ActorDAO.class);
	
	private EntityManager em;
	
	public ActorDAO(){
		em = JPAUtil.getEntityManager();
	}
	
	public List<Actor> list(){
		EntityTransaction t = em.getTransaction(); 
		t.begin();
		TypedQuery<Actor> q = em.createNamedQuery("Actor.findAll", Actor.class);
		List<Actor> l = q.getResultList();
		t.commit();
		return l;
	}
	
}
