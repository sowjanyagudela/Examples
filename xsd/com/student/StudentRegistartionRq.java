//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.07 at 12:45:52 PM IST 
//


package com.student;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Students">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="student" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="address">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="h.no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mobilenumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "students"
})
@XmlRootElement(name = "StudentRegistartionRq")
public class StudentRegistartionRq
    implements Serializable
{

    private final static long serialVersionUID = 20070801L;
    @XmlElement(name = "Students", required = true)
    protected StudentRegistartionRq.Students students;

    /**
     * Gets the value of the students property.
     * 
     * @return
     *     possible object is
     *     {@link StudentRegistartionRq.Students }
     *     
     */
    public StudentRegistartionRq.Students getStudents() {
        return students;
    }

    /**
     * Sets the value of the students property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentRegistartionRq.Students }
     *     
     */
    public void setStudents(StudentRegistartionRq.Students value) {
        this.students = value;
    }

    public boolean isSetStudents() {
        return (this.students!= null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="student" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="address">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="h.no" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mobilenumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "student"
    })
    public static class Students
        implements Serializable
    {

        private final static long serialVersionUID = 20070801L;
        @XmlElement(required = true)
        protected List<StudentRegistartionRq.Students.Student> student;

        /**
         * Gets the value of the student property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the student property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStudent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StudentRegistartionRq.Students.Student }
         * 
         * 
         */
        public List<StudentRegistartionRq.Students.Student> getStudent() {
            if (student == null) {
                student = new ArrayList<StudentRegistartionRq.Students.Student>();
            }
            return this.student;
        }

        public boolean isSetStudent() {
            return ((this.student!= null)&&(!this.student.isEmpty()));
        }

        public void unsetStudent() {
            this.student = null;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="address">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="h.no" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mobilenumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "age",
            "address",
            "mobilenumber"
        })
        public static class Student
            implements Serializable
        {

            private final static long serialVersionUID = 20070801L;
            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected BigInteger age;
            @XmlElement(required = true)
            protected StudentRegistartionRq.Students.Student.Address address;
            @XmlElement(required = true)
            protected BigInteger mobilenumber;
            @XmlAttribute(name = "id", required = true)
            protected BigInteger id;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            public boolean isSetName() {
                return (this.name!= null);
            }

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAge(BigInteger value) {
                this.age = value;
            }

            public boolean isSetAge() {
                return (this.age!= null);
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link StudentRegistartionRq.Students.Student.Address }
             *     
             */
            public StudentRegistartionRq.Students.Student.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link StudentRegistartionRq.Students.Student.Address }
             *     
             */
            public void setAddress(StudentRegistartionRq.Students.Student.Address value) {
                this.address = value;
            }

            public boolean isSetAddress() {
                return (this.address!= null);
            }

            /**
             * Gets the value of the mobilenumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMobilenumber() {
                return mobilenumber;
            }

            /**
             * Sets the value of the mobilenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMobilenumber(BigInteger value) {
                this.mobilenumber = value;
            }

            public boolean isSetMobilenumber() {
                return (this.mobilenumber!= null);
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            public boolean isSetId() {
                return (this.id!= null);
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="h.no" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "hNo",
                "street",
                "city",
                "state",
                "pincode"
            })
            public static class Address
                implements Serializable
            {

                private final static long serialVersionUID = 20070801L;
                @XmlElement(name = "h.no", required = true)
                protected String hNo;
                @XmlElement(required = true)
                protected String street;
                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String state;
                @XmlElement(required = true)
                protected BigInteger pincode;

                /**
                 * Gets the value of the hNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHNo() {
                    return hNo;
                }

                /**
                 * Sets the value of the hNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHNo(String value) {
                    this.hNo = value;
                }

                public boolean isSetHNo() {
                    return (this.hNo!= null);
                }

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStreet(String value) {
                    this.street = value;
                }

                public boolean isSetStreet() {
                    return (this.street!= null);
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                public boolean isSetCity() {
                    return (this.city!= null);
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                public boolean isSetState() {
                    return (this.state!= null);
                }

                /**
                 * Gets the value of the pincode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPincode() {
                    return pincode;
                }

                /**
                 * Sets the value of the pincode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPincode(BigInteger value) {
                    this.pincode = value;
                }

                public boolean isSetPincode() {
                    return (this.pincode!= null);
                }

            }

        }

    }

}
