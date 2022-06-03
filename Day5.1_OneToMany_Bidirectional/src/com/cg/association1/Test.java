package com.cg.association1;

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
				em.persist(emp);
				
				//creat an employee1
				Employee emp1 = new Employee();
				emp1.setName("Sakshi");
				em.persist(emp1);
				
				//creat an employee1
				Department mg = new Department();
			    mg.setDeptId(11);
				mg.setDeptName("IT");
				em.persist(mg);
				
				em.getTransaction().commit();
				System.out.println("Added Employees and Manager Successfully");
				em.close();
				factory.close();
				
			}
}

