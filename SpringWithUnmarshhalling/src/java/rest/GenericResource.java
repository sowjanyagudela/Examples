/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.sun.jmx.remote.internal.Unmarshal;
import com.sun.xml.bind.unmarshaller.UnmarshallableObject;
import comm.studentdetails.StudentRegistartionRq;
import comm.studentdetails.StudentRegistartionRs;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Web Service
 *
 * @author sowmya
 */
@RestController
@RequestMapping("/rest")
public class GenericResource {

    /**
     * Retrieves representation of an instance of rest.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @Produces(MediaType.APPLICATION_XML)
    @RequestMapping(value = "/student")
    public StudentRegistartionRq getXml() throws JAXBException {
        //TODO return proper representation object
        File output = new File("/home/sowmya/Desktop/StudentRegistered.xml");
        JAXBContext jaxb = JAXBContext.newInstance("comm.studentdetails");
        Marshaller jaxbMarshaller = jaxb.createMarshaller();
        Long l = new Long(8220748318L);
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
        student.setId(new BigInteger("26"));
        student.setAddress(address2);
        student.setAge(BigInteger.valueOf(26));
        student.setName("SowmiSri");
        student.setMobilenumber(BigInteger.valueOf(l));
        StudentRegistartionRq.Students ss = new StudentRegistartionRq.Students();
        ss.getStudent().add(student);
        stReq.setStudents(ss);
        jaxbMarshaller.marshal(stReq, output);
        jaxbMarshaller.marshal(stReq, System.out);
        return stReq;
    }

    
    @RequestMapping(value = "/response")
    public String setStudentResponse(String respose) throws JAXBException {
        StudentRegistartionRq request = null;
        JAXBContext jaxb = JAXBContext.newInstance("comm.studentdetails");
        File output = new File("/home/sowmya/Desktop/StudentRegistered.xml");
        Unmarshaller unmarshal = jaxb.createUnmarshaller();
        request = (StudentRegistartionRq) unmarshal.unmarshal(output);
        BigInteger studentId = BigInteger.ZERO;
        String studentName = null;
        int stAge = 0;
        String stCity = null;
        String stHNo = null;
        String stState = null;
        String stStreet = null;
        int stPinCode = 0;
        Long mNo;
        String email = null;
         StringBuffer sb = new StringBuffer();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/StudentDb", "root", "123456");
            for (StudentRegistartionRq.Students.Student st : request.getStudents().getStudent()) {
                studentId = st.getId();
                studentName = st.getName();
                stAge = st.getAge().intValue();
                stCity = st.getAddress().getCity();
                stHNo = st.getAddress().getHNo();
                stState = st.getAddress().getState();
                stStreet = st.getAddress().getStreet();
                stPinCode = st.getAddress().getPincode().intValue();
                mNo = st.getMobilenumber().longValue();
               
                sb.append(studentId+","+studentName+","+stAge+","+stHNo + "," + stStreet + "," + stCity + "," + stState + "," + stPinCode);

                System.out.println("StudentID :: " + studentId + "StudentName:: " + studentName + "Student Age:: " + stAge + "StudentCity :: " + stCity
                        + "StudentHno ::" + stHNo + "Student State :: " + stState + " Student Street :: " + stStreet + "StudentPincode ::" + stPinCode);
                
                 String query = ("INSERT INTO `StudentDb`.`studentdetails` (`sno`, `sname`, `sage`, `smobileno`, `saddress`) VALUES (?,?,?,?,?)");

                BigDecimal bd = new BigDecimal(mNo);
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setInt(1, studentId.intValue());
                preparedStmt.setString(2, studentName);
                preparedStmt.setInt(3, stAge);
                preparedStmt.setLong(4, mNo);
                preparedStmt.setString(5, sb.toString());

                // execute the preparedstatement
                preparedStmt.execute();

            }
            }
         catch (SQLException ex) {
            Logger.getLogger(GenericResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        return sb.toString();
    }

}
