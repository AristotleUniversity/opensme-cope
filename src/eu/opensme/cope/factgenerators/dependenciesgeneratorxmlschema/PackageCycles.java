//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.24 at 11:34:47 πμ EET 
//


package eu.opensme.cope.factgenerators.dependenciesgeneratorxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}packageCycle"/>
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
    "packageCycle"
})
@XmlRootElement(name = "packageCycles")
public class PackageCycles {

    @XmlElement(required = true)
    protected PackageCycle packageCycle;

    /**
     * Gets the value of the packageCycle property.
     * 
     * @return
     *     possible object is
     *     {@link PackageCycle }
     *     
     */
    public PackageCycle getPackageCycle() {
        return packageCycle;
    }

    /**
     * Sets the value of the packageCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageCycle }
     *     
     */
    public void setPackageCycle(PackageCycle value) {
        this.packageCycle = value;
    }

}