package com.cg.inheritance3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest 
{
		public static void main(String[] args)
		{
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			
			//creat an employee1
			Employee emp = new Employee();
			emp.setName("Pratyenchya");
			emp.setSalary(35000);
			
			//creat an employee1
			Employee emp1 = new Employee();
			emp1.setName("Vaishu");
			emp1.setSalary(35000);
			
			//creat an employee1
			Manager mg = new Manager();
			mg.setName("Vipul");
			mg.setSalary(45000);
			mg.setDeptName("Information Technology");
			em.persist(mg);
			
			em.getTransaction().commit();
			System.out.println("Added Employees and Manager Successfully");
			em.close();
			factory.close();
			
		}

	}


