/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmaven;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sowmya
 */
@RestController
@RequestMapping("/rest")
public class StudentController {

    @RequestMapping(value = "/student/{studentId}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public StudentRegistration getStudentDetails(@PathVariable int studentId) {
        StringWriter writer = new StringWriter();

        StudentRegistration st = new StudentRegistration();

        if (studentId == 1) {
            try {
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
                st.setStudentName("Sowmi");
                st.setAddress(listAd);
                st.setStudentEmail("dsrisowmya@gmail.com");
                st.setStudentId(studentId);
                st.setStudentMobileNo("4567891234");
                st.setStudentage(26);
                writer.write(st.getStudentName()
                        + st.getStudentMobileNo() + st.getStudentEmail() + st.getStudentage());
            } catch (Exception ex) {
                st.setStudentId(studentId);
                writer.write(st.getStudentId());
            }
        } else {
            System.out.println("Student Id not found");

        }

        return st;

    }
}
