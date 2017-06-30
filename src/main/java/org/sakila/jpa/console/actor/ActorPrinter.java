package org.sakila.jpa.console.actor;

import java.util.List;

import org.sakila.jpa.dao.ActorDAO;
import org.sakila.jpa.model.Actor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActorPrinter {
	
	private final static Logger logger = LoggerFactory.getLogger(ActorDAO.class);
	
	public static void main(String[] args) {
		ActorDAO dao = new ActorDAO();
		List<Actor> l = dao.list();
		
		for(Actor a : l){
			logger.info(a.toString());
		}
		
		
		System.exit(0);
	}
}
