//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.19 at 07:21:12 PM EDT 
//


package seg.jUCMNav.importexport.z151.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConcreteURNspec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConcreteURNspec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="urnVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcreteURNspec", propOrder = {
    "description",
    "author",
    "created",
    "modified",
    "specVersion",
    "urnVersion"
})
public class ConcreteURNspec {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected String created;
    @XmlElement(required = true)
    protected String modified;
    @XmlElement(required = true)
    protected String specVersion;
    @XmlElement(required = true)
    protected String urnVersion;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Gets the value of the specVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecVersion() {
        return specVersion;
    }

    /**
     * Sets the value of the specVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecVersion(String value) {
        this.specVersion = value;
    }

    /**
     * Gets the value of the urnVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrnVersion() {
        return urnVersion;
    }

    /**
     * Sets the value of the urnVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrnVersion(String value) {
        this.urnVersion = value;
    }

}
