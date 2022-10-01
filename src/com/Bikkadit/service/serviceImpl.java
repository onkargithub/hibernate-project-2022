package com.Bikkadit.service;

import com.Hibernate.database.HibernateUtil;
import com.model.*;

import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public  class serviceImpl implements serviceI {
	
	Student stu= new Student();
	Scanner sc=new Scanner(System.in);
	
	
	
     public void save() {
    	
        System.out.println("how many student you want to add: ");
        int count=sc.nextInt();
      
          for(int i=0;i<count; i++) {
    	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	  Session session=sessionFactory.openSession();
    	  
    	  System.out.println("enter a student id: ");
    	  int sid=sc.nextInt();
    	  stu.setId(sid);
    	  session.beginTransaction();
    	  session.save(stu);
          session.getTransaction().commit();
    	  
    	  System.out.println("enter a student name: ");
    	  String sname=sc.next();
    	  stu.setName(sname);
    	  session.beginTransaction();
    	  session.save(stu);
    	  session.getTransaction().commit();
    	  
    	  
    	  System.out.println("enter a student address: ");
    	  String saddress=sc.next();
    	  stu.setAddress(saddress);
    	  session.beginTransaction();
    	  session.save(stu);
    	  session.getTransaction().commit();
    	  
    	  System.out.println("data inserted successfully: ");
          }}
     

    public void showAll() {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session Session=sessionFactory.openSession();
    	
    	String hql= "from Student";
    			
    			Query query=Session.createQuery(hql);
    			List <Student> list=query.getResultList();
    			for(Student stu:list){
    				System.out.println(stu);
    			}}
    
       public void update() {
	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
      System.out.println("how many student you want to update: ");
	  int count=sc.nextInt();
	  
	      for(int i=0; i<count; i++) {
		  Session session= sessionFactory.openSession();
		 System.out.println("enter id you want to update: ");
		 int id=sc.nextInt();
	   Student student = session.get(Student.class, id);
		
		
		boolean flag=true;
		
		while(true) {
			
			System.out.println("prees 1 for change in name: ");
			System.out.println("press 2 for change in address: ");
		
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1: System.out.println("set name you want to update: ");
			        String name=sc.next();
			        student.setName(name);
			        session.beginTransaction();
			        session.update(student);
			        session.getTransaction().commit();
			        System.out.println("name update successfullyy: ");
			        break;
			        
			case 2:
				System.out.println("set address you want to update: ");
		        String address1=sc.next();
		        student.setName(address1);
		        session.beginTransaction();
		        session.update(student);
		        session.getTransaction().commit();
		        System.out.println("address1 update successfullyy: "); break;
		        
			
			default:System.out.println("invalied case");
			break;
		        
			}
		}
		
	}
}    public void delete() {
	SessionFactory sessionFactory = HibernateUtil. getSessionFactory();
	Session session=sessionFactory.openSession();
	  
	  System.out.println("enter id for delete the ");
	  
	  int id=sc.nextInt();
	  stu.setId(id);
	  session.beginTransaction();
	  session.delete(stu);
	  session.getTransaction().commit();
	  }
}
	

