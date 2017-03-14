package sakilajpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManager getEntityManager(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sakila");
		return emf.createEntityManager();
	}
	
}
