package sakilajpa.console.actor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sakilajpa.dao.ActorDAO;
import sakilajpa.model.Actor;

public class ActorPrinter {
	
	private final static Logger logger = LoggerFactory.getLogger(ActorDAO.class);
	
	public static void main(String[] args) {
		ActorDAO dao = new ActorDAO();
		List<Actor> l = dao.list();
		
		for(Actor a : l){
			logger.info(a.toString());
		}
	}
}
