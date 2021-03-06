//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.24 at 11:34:47 πμ EET 
//


package eu.opensme.cope.factgenerators.dependenciesgeneratorxmlschema;


import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}packages"/>
 *         &lt;element ref="{}centerPackages"/>
 *         &lt;element ref="{}bestFragmenters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bestFragmentSize" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="diameter" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="girth" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="longestWalk" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="radius" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packages",
    "centerPackages",
    "bestFragmenters"
})
@XmlRootElement(name = "packageCycle")
public class PackageCycle {

    @XmlElement(required = true)
    protected ClassyclePackages packages;
    @XmlElement(required = true)
    protected CenterPackages centerPackages;
    @XmlElement(required = true)
    protected BestFragmenters bestFragmenters;
    @XmlAttribute(required = true)
    protected BigInteger bestFragmentSize;
    @XmlAttribute(required = true)
    protected BigInteger diameter;
    @XmlAttribute(required = true)
    protected BigInteger girth;
    @XmlAttribute(required = true)
    protected BigInteger longestWalk;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(required = true)
    protected BigInteger radius;
    @XmlAttribute(required = true)
    protected BigInteger size;

    /**
     * Gets the value of the packages property.
     * 
     * @return
     *     possible object is
     *     {@link ClassyclePackages }
     *     
     */
    public ClassyclePackages getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassyclePackages }
     *     
     */
    public void setPackages(ClassyclePackages value) {
        this.packages = value;
    }

    /**
     * Gets the value of the centerPackages property.
     * 
     * @return
     *     possible object is
     *     {@link CenterPackages }
     *     
     */
    public CenterPackages getCenterPackages() {
        return centerPackages;
    }

    /**
     * Sets the value of the centerPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CenterPackages }
     *     
     */
    public void setCenterPackages(CenterPackages value) {
        this.centerPackages = value;
    }

    /**
     * Gets the value of the bestFragmenters property.
     * 
     * @return
     *     possible object is
     *     {@link BestFragmenters }
     *     
     */
    public BestFragmenters getBestFragmenters() {
        return bestFragmenters;
    }

    /**
     * Sets the value of the bestFragmenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestFragmenters }
     *     
     */
    public void setBestFragmenters(BestFragmenters value) {
        this.bestFragmenters = value;
    }

    /**
     * Gets the value of the bestFragmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBestFragmentSize() {
        return bestFragmentSize;
    }

    /**
     * Sets the value of the bestFragmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBestFragmentSize(BigInteger value) {
        this.bestFragmentSize = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiameter(BigInteger value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the girth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGirth() {
        return girth;
    }

    /**
     * Sets the value of the girth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGirth(BigInteger value) {
        this.girth = value;
    }

    /**
     * Gets the value of the longestWalk property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLongestWalk() {
        return longestWalk;
    }

    /**
     * Sets the value of the longestWalk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLongestWalk(BigInteger value) {
        this.longestWalk = value;
    }

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

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

}
