/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;


import comm.studentdetails.StudentRegistartionRq;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST Web Service
 *
 * @author sowmya
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @RequestMapping("/student")
    public StudentRegistartionRq getXml() throws JAXBException {
        //TODO return proper representation object
        //File output = new File("/home/sowmya/Desktop/StudentRegistered.xml");
        JAXBContext jaxb= JAXBContext.newInstance("comm.studentdetails");
         Marshaller jaxbMarshaller = jaxb.createMarshaller();
         Long l = new Long(8220568318L);
            StudentRegistartionRq stReq = new StudentRegistartionRq();
            StudentRegistartionRq.Students.Student student = new StudentRegistartionRq.Students.Student();
            List<StudentRegistartionRq.Students.Student.Address> addList = new ArrayList<StudentRegistartionRq.Students.Student.Address>();
            StudentRegistartionRq.Students.Student.Address address1 = new StudentRegistartionRq.Students.Student.Address();
            address1.setCity("Visakhapatnam");
            address1.setHNo("3 Ekata");
            address1.setPincode(BigInteger.valueOf(Long.valueOf("530014")));
            address1.setState("Andhra Pradesh");
            address1.setStreet("Navala Base");
            addList.add(address1);
            StudentRegistartionRq.Students.Student.Address address2 = new StudentRegistartionRq.Students.Student.Address();
            address2.setCity("Visakhapatnam");
            address2.setHNo("2G");
            address2.setPincode(BigInteger.valueOf(Long.valueOf("530013")));
            address2.setState("Andhra Pradesh");
            address2.setStreet("Seethammadhara");
            addList.add(address1);
            addList.add(address2);
            student.setId(new BigInteger("15"));
            student.setAddress(address2);
            student.setAge(BigInteger.valueOf(26));
            student.setName("SowmiSri");
            student.setMobilenumber(BigInteger.valueOf(l));
            StudentRegistartionRq.Students ss = new StudentRegistartionRq.Students();
            ss.getStudent().add(student);
            stReq.setStudents(ss);
         //jaxbMarshaller.marshal(stReq, output);
          jaxbMarshaller.marshal(stReq, System.out);
        return stReq;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
   
   
}
