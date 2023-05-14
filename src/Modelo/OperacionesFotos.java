package Modelo;

import fotosBind.AlbumesFotos;
import fotosBind.AlbumesFotos.AlbumFotos;
import fotosBind.AutorType;
import fotosBind.FotoType;
import fotosBind.ObjectFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Marcos Miranda
 */
public class OperacionesFotos {

    ObjectFactory fabrica = new ObjectFactory();

    /**
     * metodo unmarshalizar
     *
     * @param ficheroXML
     * @return
     * @throws JAXBException
     */
    public JAXBElement unmarshalizar(File ficheroXML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("fotosBind");
        //Objeto unmarshall instanciado 
        Unmarshaller unmarshall = jaxbContext.createUnmarshaller();
        //
        JAXBElement jaxbElement = unmarshall.unmarshal(new StreamSource(ficheroXML), AutorType.class);
        return jaxbElement;
    }

    /**
     * metodo marshalizar
     */
    public void marshalizar(JAXBElement jaxbElement, File ficheroXMLsalida) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("fotosBind");  //<-----nombre del paquete creado
        Marshaller m = jaxbContext.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(jaxbElement, ficheroXMLsalida);
    }

     /**
     * metodo que devuelve un JsonObject de Autor creado por parametro
     * @param autor
     * @return 
     */
    public JsonObject crearAutor(String nombre,String apellido1,String apellido2,String telefono1,String telefono2,
            String email) {
        JsonObject autor = Json.createObjectBuilder()
                .add("nombre", nombre)
                .add("apellidos", Json.createArrayBuilder()
                        .add(apellido1)
                        .add(apellido2))
                .add("telefono", Json.createArrayBuilder()
                        .add(telefono1)
                        .add(telefono2))
                .add("email", email)
                .build();
        return autor;

    }
    
    /**
     * metodo que devuelve un JsonObject de Autor creado por parametro
     * @param autor
     * @return 
     */
    public JsonObject crearAutorObjeto(AutorType autor) {
        JsonObject autor1 = Json.createObjectBuilder()
                .add("nombre", autor.getNombre())
                .add("apellidos", Json.createArrayBuilder()
                        .add(autor.getApellidos().get(0))
                        .add(autor.getApellidos().get(1)))
                .add("telefono", Json.createArrayBuilder()
                        .add(autor.getTelefono().get(0))
                        .add(autor.getTelefono().get(1)))
                .add("email", autor.getEmail())
                .build();
        return autor1;

    }
    
     /**
     * metodo que crea un JsonObject tipo foto
     * @param foto
     * @return 
     */
    public JsonObject crearFoto(FotoType foto){
        JsonObject fotoJson = Json.createObjectBuilder()
                .add("nombre", foto.getNombre())
                .add("titulo", foto.getTitulo())
                .add("date", String.valueOf(foto.getFechaCaptura()))
                .add("time", String.valueOf(foto.getHoraCaptura()))
                .add("camara", foto.getCamara())
                .add("iso", foto.getISO())
                .add("tiempoExposicion", foto.getTiempoExposicion())
                .add("datos", foto.getDatos())
                .add("favorito", foto.isFavorito())
                .add("id", foto.getId())
                .build();
        return fotoJson;
            
    }
    
    /**
     * metodo privado que pasa un array de fotos a JsonArray 
     * @param fotos
     * @return 
     */
    private JsonArray JsonArrayFotos(List<FotoType> fotos){
        JsonArrayBuilder JsonArrayFotos = Json.createArrayBuilder();
        for (FotoType foto : fotos) {
            JsonArrayFotos.add(crearFoto(foto));
        }
        return JsonArrayFotos.build();
    }
    
    /**
     * metodo que crea un JsonObject album
     * @param albumFoto
     * @return 
     */   
    public JsonObject crearAlbum(AlbumFotos albumFoto){
        JsonObject jsonAlbum = Json.createObjectBuilder()
                .add("titulo", albumFoto.getTitulo())
                .add("autor", crearAutorObjeto(albumFoto.getAutor()))
                .add("foto", JsonArrayFotos(albumFoto.getFoto()))
                .build();
        return jsonAlbum;
                
    }
    

    /**
     * metodo para crear y actualizar un archivo Json, parametrizado
     *
     * @param jsonObject
     * @param nombreArchivoSalida
     * @return
     * @throws java.io.IOException
     */
    public boolean escribirArchivoJson(JsonObject jsonObject, String nombreArchivoSalida,AutorType autor) throws IOException {
        boolean creadoActualizado = false;
        FileWriter ficheroSalida = new FileWriter(nombreArchivoSalida);
        JsonWriter jsonWriter = Json.createWriter(ficheroSalida);
        jsonWriter.writeObject(jsonObject);                                     //escribimos el objeto completo
        ficheroSalida.flush();
        ficheroSalida.close();

        creadoActualizado = true;
        return creadoActualizado;
    }

    
    /**
     * lee un archivo json que recibe y devuelve un JsonArray
     *
     * @param nombreArchivo
     * @return JsonObject 
     * @throws FileNotFoundException
     */
    public JsonObject leerArchivoJson(String nombreArchivo) throws FileNotFoundException {
        FileReader fr = new FileReader(nombreArchivo);
        JsonReader jsonReader = Json.createReader(fr);
        JsonObject readObject = jsonReader.readObject();
        return readObject;
      
    }
    
    
    
    
    
    
}
