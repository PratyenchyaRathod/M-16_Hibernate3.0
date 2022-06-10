package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.ICertificateServiceImpl;
import com.cg.service.ICollegeService;
import com.cg.service.ICollegeServiceImpl;
import com.cg.service.ICertificateService;
import com.cg.service.IPlacementService;
import com.cg.service.IStudentService;
import com.cg.service.IPlacementServiceImpl;
import com.cg.service.IStudentServiceImpl;
import com.cg.service.IUserService;
import com.cg.service.IUserServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
			Student student = new Student();
			IStudentService service = new IStudentServiceImpl();
			
			
		   /*
		    //create
		    student.setId(19);
			student.setName("vaishu");
			student.setCollege("Pune university");
			student.setRoll(18);
			student.setQualification("BE");
			student.setCourse("ME");
			student.setYear(2020);
			student.setHallTicketNo(1010);
			service.addStudent(student);
			
			//retrieve
			service.searchStudentById(10);
			System.out.println("Id is "+student.getId());
			System.out.println("Name is "+student.getName());
			System.out.println("Roll is "+student.getRoll());
			
			//update
			service.searchStudentById(12);
			student.setName("Isha");
			student.setCollege("RTMNU");
			student.setCourse("C++");
			student.setId(22);
			student.setQualification("MCA");
			student.setRoll(32);
			student.setYear(2023);
			student.setHallTicketNo(2435);
			service.addStudent(student);
			System.out.println("Update is sucessful");
			
			
			//Delete
			service.searchStudentById(11);
			service.deleteStudent(student);
			System.out.println("Delete is sucessful");
			
			
			
			Certificate c=new Certificate();
			c.setId(11);
			c.setYear(2021);
			College col=new College();
			col.setId(12);
			col.setCollegeName("Y.C.C.E");
			col.setLocation("Nagpur");
			
			/*User u=new User();
			u.setId(601);
			u.setName("Ankita");
			u.setPassword("Ankita@123");
			IUserService user=new UserServiceImpl();
			user.addNewUser(u);
			
			
			col.setCollegeAdmin(u);
			ICollegeService college=new CollegeServiceImpl();
			college.addCollege(col);
			c.setCollege(col);
			ICertificateService certificate=new CertificateServiceImpl();
			certificate.addCertificate(c);
	        student.setCollege(col);
			student.setRoll(785);
			student.setQualification("BE");
			student.setCourse("CSE");
		    student.setCertificate(c);
			student.setHallTicketNo(701);
			
			Admin a=new Admin();
			a.setId(301);
			a.setName("Umesh Nayak");
			a.setPassword("Umesh@123");
		    IAdminService ad=new IAdminServiceImpl();
		    ad.addNewAdmin(a);
			
			

			Placement p=new Placement();
			p.setId(901);
			LocalDate date=LocalDate.now();
			p.setDate(date);
			p.setQualification("BE");
			p.setCollege(col);
			p.setName("placement creaters group");
			p.setYear(2022);
			IPlacementService placement =new IPlacementServiceImpl();
			placement.addPlacement(p);
			service.addStudent(student);
		
		
		
			
			System.out.println("data is inserted");
			
			
		   	student = service.searchStudentById(101);
			System.out.println("Id is: "+student.getId());
			System.out.println("Roll is: "+student.getRoll());
			System.out.println("college is: "+student.getCollege());
			
			student = service.searchStudentById(101);
			student.setCollege(col);
			service.updateStudent(student);
			System.out.println("Updated successfully");
		}*/
}
}
