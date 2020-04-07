
package services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movies1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="movies1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moiveid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="moviegenre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movierating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moviereleasedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movietitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movies1", propOrder = {
    "moiveid",
    "moviegenre",
    "movierating",
    "moviereleasedate",
    "movietitle"
})
public class Movies1 {

    protected BigDecimal moiveid;
    protected String moviegenre;
    protected Double movierating;
    protected String moviereleasedate;
    protected String movietitle;

    /**
     * Gets the value of the moiveid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoiveid() {
        return moiveid;
    }

    /**
     * Sets the value of the moiveid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoiveid(BigDecimal value) {
        this.moiveid = value;
    }

    /**
     * Gets the value of the moviegenre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoviegenre() {
        return moviegenre;
    }

    /**
     * Sets the value of the moviegenre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoviegenre(String value) {
        this.moviegenre = value;
    }

    /**
     * Gets the value of the movierating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMovierating() {
        return movierating;
    }

    /**
     * Sets the value of the movierating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMovierating(Double value) {
        this.movierating = value;
    }

    /**
     * Gets the value of the moviereleasedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoviereleasedate() {
        return moviereleasedate;
    }

    /**
     * Sets the value of the moviereleasedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoviereleasedate(String value) {
        this.moviereleasedate = value;
    }

    /**
     * Gets the value of the movietitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovietitle() {
        return movietitle;
    }

    /**
     * Sets the value of the movietitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovietitle(String value) {
        this.movietitle = value;
    }

}
