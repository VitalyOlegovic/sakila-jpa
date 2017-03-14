package sakilajpa.console.actor;

import java.util.Scanner;

import sakilajpa.dao.ActorDAO;
import sakilajpa.model.Actor;

public class ActorSaver {
	public static void main(String[] args) {
		Actor a = getActorData();
		ActorDAO dao = new ActorDAO();
		dao.save(a);
		
		
		System.exit(0);
	}
	
	public static Actor getActorData(){
		Scanner scanner = new Scanner(System.in);
		Actor bean = new Actor();
		System.out.println("Inserire il nome dell'attore: ");
		String firstName = scanner.next();
		bean.setFirstName(firstName);
		System.out.println("Inserire il cognome dell'attore: ");
		String lastName = scanner.next();
		bean.setLastName(lastName);
		scanner.close();
		return bean;
	}
}
