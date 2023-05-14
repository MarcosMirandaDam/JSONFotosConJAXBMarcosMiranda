//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.14 a las 11:13:45 PM CEST 
//


package fotosBind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para fotoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fotoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaCaptura" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="horaCaptura" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="camara" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ISO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1600"/&gt;
 *               &lt;enumeration value="800"/&gt;
 *               &lt;enumeration value="400"/&gt;
 *               &lt;enumeration value="200"/&gt;
 *               &lt;enumeration value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tiempoExposicion" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="datos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="favorito"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fotoType", propOrder = {
    "nombre",
    "titulo",
    "fechaCaptura",
    "horaCaptura",
    "camara",
    "iso",
    "tiempoExposicion",
    "datos",
    "favorito"
})
public class FotoType {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCaptura;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaCaptura;
    @XmlElement(required = true)
    protected String camara;
    @XmlElement(name = "ISO", required = true)
    protected String iso;
    protected float tiempoExposicion;
    @XmlElement(required = true)
    protected String datos;
    protected boolean favorito;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCaptura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCaptura() {
        return fechaCaptura;
    }

    /**
     * Define el valor de la propiedad fechaCaptura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCaptura(XMLGregorianCalendar value) {
        this.fechaCaptura = value;
    }

    /**
     * Obtiene el valor de la propiedad horaCaptura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraCaptura() {
        return horaCaptura;
    }

    /**
     * Define el valor de la propiedad horaCaptura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraCaptura(XMLGregorianCalendar value) {
        this.horaCaptura = value;
    }

    /**
     * Obtiene el valor de la propiedad camara.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamara() {
        return camara;
    }

    /**
     * Define el valor de la propiedad camara.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamara(String value) {
        this.camara = value;
    }

    /**
     * Obtiene el valor de la propiedad iso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISO() {
        return iso;
    }

    /**
     * Define el valor de la propiedad iso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISO(String value) {
        this.iso = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoExposicion.
     * 
     */
    public float getTiempoExposicion() {
        return tiempoExposicion;
    }

    /**
     * Define el valor de la propiedad tiempoExposicion.
     * 
     */
    public void setTiempoExposicion(float value) {
        this.tiempoExposicion = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatos(String value) {
        this.datos = value;
    }

    /**
     * Obtiene el valor de la propiedad favorito.
     * 
     */
    public boolean isFavorito() {
        return favorito;
    }

    /**
     * Define el valor de la propiedad favorito.
     * 
     */
    public void setFavorito(boolean value) {
        this.favorito = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
