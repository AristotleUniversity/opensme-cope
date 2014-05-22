//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.24 at 11:34:47 πμ EET 
//


package eu.opensme.cope.factgenerators.dependenciesgeneratorxmlschema;

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
 *       &lt;choice>
 *         &lt;element ref="{}classRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{}class" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="numberOfExternalClasses" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classRef",
    "clazz"
})
@XmlRootElement(name = "classes")
public class Classes {

    protected List<ClassRef> classRef;
    @XmlElement(name = "class")
    protected List<ClassycleClass> clazz;
    @XmlAttribute
    protected BigInteger numberOfExternalClasses;

    /**
     * Gets the value of the classRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassRef }
     * 
     * 
     */
    public List<ClassRef> getClassRef() {
        if (classRef == null) {
            classRef = new ArrayList<ClassRef>();
        }
        return this.classRef;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassycleClass }
     * 
     * 
     */
    public List<ClassycleClass> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<ClassycleClass>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the numberOfExternalClasses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfExternalClasses() {
        return numberOfExternalClasses;
    }

    /**
     * Sets the value of the numberOfExternalClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfExternalClasses(BigInteger value) {
        this.numberOfExternalClasses = value;
    }

}
