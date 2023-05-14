package Controlador;

import Modelo.OperacionesFotos;
import fotosBind.AlbumesFotos;
import fotosBind.AutorType;
import fotosBind.ObjectFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.JsonObject;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;


/**
 *
 * @author Marcos Miranda
 */
public class MainFotos {

    public static void main(String[] args) throws IOException {

        try {
            OperacionesFotos operador = new OperacionesFotos();

            //archivo de entrada
            File ficheroXML = new File("fotos.xml");
            // archivo de salida
            File ficheroXMLsalida = new File("fotosSalida.xml");

            JAXBElement jaxbElement = operador.unmarshalizar(ficheroXML);

            //root es albumesFotos
            ObjectFactory fabrica = new ObjectFactory();
            AlbumesFotos raizAlbumes = fabrica.createAlbumesFotos();
            raizAlbumes = (AlbumesFotos) jaxbElement.getValue();
            
             
            
            //Crear un autor
            JsonObject crearAutor = operador.crearAutor("Marcos", "Miranda", "Bartolome", "636146896", "985695638", "sssocram@gmail.com");
            
            
            //lista de albumes
            List<AlbumesFotos.AlbumFotos> listaAlbumFotos = raizAlbumes.getAlbumFotos();
            //creamos el objejo Json
            JsonObject crearAlbum = operador.crearAlbum((AlbumesFotos.AlbumFotos) listaAlbumFotos);
            //se lo pasamos como parámetro tal y como creamos en el método, junto con el nombre de archivo deseado
            operador.escribirArchivoJson(crearAlbum, "pruebasFotos.json", (AutorType) crearAutor);
                       
            //creamos archivo salida JSon
            operador.escribirArchivoJson(crearAlbum, "salidaJson.json",(AutorType) crearAutor);
            
            
            
            //marshalizar
            operador.marshalizar(jaxbElement, ficheroXMLsalida);

        } catch (JAXBException ex) {
            Logger.getLogger(MainFotos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
