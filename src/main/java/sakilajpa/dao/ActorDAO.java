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
		TypedQuery<Actor> q = em.createNamedQuery("Actor.findAll", Actor.class);
		List<Actor> l = q.getResultList();
		return l;
	}
	
	public void delete(int id){
		EntityTransaction t = em.getTransaction(); 
		t.begin();
		Actor a = em.find(Actor.class, id);
		em.remove(a);
		t.commit();
	}
	
	public void update(Actor a){
		Actor a1 = em.find(Actor.class, a.getActorId());
		a1.setFirstName(a.getFirstName());
		a1.setLastName(a.getLastName());
		EntityTransaction t = em.getTransaction(); 
		t.begin();
		em.persist(a1);
		t.commit();
	}

	public void save(Actor a) {
		EntityTransaction t = em.getTransaction(); 
		t.begin();
		em.persist(a);
		t.commit();
	}
	
}
