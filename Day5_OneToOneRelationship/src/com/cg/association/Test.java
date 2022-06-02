package com.cg.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
		
			public static void main(String[] args)
			{
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
				EntityManager em = factory.createEntityManager();
				em.getTransaction().begin();
				
				//creat an employee1
				Employee emp = new Employee();
				emp.setName("Pratyenchya");
				emp.setAddress("Nagpur");
				em.persist(emp);
				
				//creat an employee1
				Employee emp1 = new Employee();
				emp1.setName("Sakshi");
				emp1.setAddress("Yavatmal");
				em.persist(emp1);
				
				//creat an employee1
				Address mg = new Address();
				mg.setAddressId(1);
				mg.setCity("Nagpur");
				mg.setStreet("Civil Line");
				mg.setZipcode(440036);
				mg.setState("Maharashtra");
				
				em.getTransaction();
				System.out.println("Added Employees and Manager Successfully");
				em.close();
				factory.close();
				
			}
}
