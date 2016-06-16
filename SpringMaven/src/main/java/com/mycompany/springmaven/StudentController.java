/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmaven;


import java.awt.PageAttributes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sowmya
 */
@RestController
public class StudentController {
    
     
    
    @RequestMapping(value = "/rest/student", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public @ResponseBody StudentRegistration getStudentDetails() {
        
        List<Address> listAd = new ArrayList<Address>();
        Address address1 = new Address();
        Address address2 = new Address();
        address1.setCity("Visakhapatnam");
        address1.setHno(3);
        address1.setPinCode(530014);
        address1.setState("Andhra Pradesh");
        address1.setStreet("Navala Base");
        address2.setCity("Visakhapatnam");
        address2.setHno(2);
        address2.setPinCode(530013);
        address2.setState("Andhra Pradesh");
        address2.setStreet("Seethammadhara");
        listAd.add(address1);
        listAd.add(address2);
        
        StudentRegistration st = new StudentRegistration();
        st.setAddress(listAd);
        st.setStudentEmail("dsrisowmya@gmail.com");
        st.setStudentId(1);
        st.setStudentMobileNo("4567891234");
        st.setStudentage(26);
        
        return st;
    }
    
}
