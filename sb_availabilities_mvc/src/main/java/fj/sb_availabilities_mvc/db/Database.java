package fj.sb_availabilities_mvc.db;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import fj.sb_availabilities_mvc.model.Address;
import fj.sb_availabilities_mvc.model.Availabilities;
import fj.sb_availabilities_mvc.model.Person;

public class Database {
	
	private SessionFactory sessionFactory;
	
	public Database() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}
	
	public List<Person> getPersons() {
		List<Person> personList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query q = session.createQuery("SELECT pl FROM Person pl");
		personList = q.getResultList();
				
		transaction.commit();
		session.close();
		
		return personList;
	}
	
	public List<Address> getAddresses() {
		List<Address> addressList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
				
		Query q = session.createQuery("SELECT al FROM Address al");
		addressList = q.getResultList();
				
		transaction.commit();
		session.close();
		
		return addressList;
	}
	
	public List<Availabilities> getAvailabilities() {
		List<Availabilities> availableList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
				
		Query q = session.createQuery("SELECT al FROM Availabilities al");
		availableList = q.getResultList();
				
		transaction.commit();
		session.close();
		
		return availableList;
	}
	
	
	public void closeDb() {
		sessionFactory.close();
	}

	

	





	
	
}
