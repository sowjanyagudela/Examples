//package com.mycompany.springmaven;
//
//import org.springframework.web.client.RestTemplate;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author sowmya
// */
//public class TestClass {
//    
//    private void testStudentDetails() {
//		RestTemplate restTemplate = new RestTemplate();
//		StudentRegistration st = restTemplate.getForObject("http://localhost:8080/SpringMaven/rest/student", StudentRegistration.class);
//		printEmpData(st);
//	}
//	
//	public static void printEmpData(StudentRegistration str){
//		System.out.println("ID="+str.getStudentId()+",Name="+str.getStudentage());
//	}
//}
