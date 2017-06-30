package org.sakila.jpa.console.actor;

import java.util.Scanner;

import org.sakila.jpa.dao.ActorDAO;
import org.sakila.jpa.model.Actor;


public class ActorUpdater {
	public static void main(String[] args) {
		Actor a = getUpdateData();
		ActorDAO dao = new ActorDAO();
		dao.update(a);
		
		System.exit(0);
	}
	
	private static Actor getUpdateData(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire l'identificativo dell'attore da aggiornare: ");
		int id = scanner.nextInt();
		Actor bean = ActorSaver.getActorData();
		scanner.close();
		bean.setActorId(id);
		return bean;
	}
}
