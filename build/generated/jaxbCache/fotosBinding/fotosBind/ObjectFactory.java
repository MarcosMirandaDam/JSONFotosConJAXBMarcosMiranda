//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.14 a las 11:13:45 PM CEST 
//


package fotosBind;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fotosBind package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fotosBind
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlbumesFotos }
     * 
     */
    public AlbumesFotos createAlbumesFotos() {
        return new AlbumesFotos();
    }

    /**
     * Create an instance of {@link AlbumesFotos.AlbumFotos }
     * 
     */
    public AlbumesFotos.AlbumFotos createAlbumesFotosAlbumFotos() {
        return new AlbumesFotos.AlbumFotos();
    }

    /**
     * Create an instance of {@link AutorType }
     * 
     */
    public AutorType createAutorType() {
        return new AutorType();
    }

    /**
     * Create an instance of {@link FotoType }
     * 
     */
    public FotoType createFotoType() {
        return new FotoType();
    }

}
