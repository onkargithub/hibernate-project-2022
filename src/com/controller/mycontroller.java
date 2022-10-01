package com.controller;

import java.util.Scanner;
import com.Bikkadit.service.serviceImpl;

public class mycontroller {
	
	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
		       serviceImpl serviceimpl=new serviceImpl();
		int choice;
		
		boolean flag=true;
		while(true) {
		System.out.println("pree 1: for save:");
		System.out.println("prees 2: for show:");
		System.out.println("press 3: for update: ");
		System.out.println("press 4:for delete: ");
		
		
	     choice=sc.nextInt();
		switch(choice) {
		
		
		case 1: serviceimpl.save();
		break;
		
		case 2: serviceimpl.showAll();
			break;
		
		case 3: serviceimpl.update();
			break;
			
		case 4: serviceimpl.delete();
			break;
			
		default:System.out.println("invalied case: ");
		break;
	

}}}}
