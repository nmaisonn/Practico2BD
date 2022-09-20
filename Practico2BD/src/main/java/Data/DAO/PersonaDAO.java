
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Recursos.Conexion;
import Data.Modelos.PersonaModel;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

public class PersonaDAO {

    private static final Conexion con = Conexion.GetInstance();
    private static final MongoCollection<Document> tabla = con.db.getCollection("personas_N_Maisonnave");

    /*Este metodo tiene que retonrar personas que unic
    private MongoCollection<Document> tabla = database.getCoamente tengan 
      ci,nombre y rol
     */
    public static PersonaModel[] getPersonas() {
        //Aca es donde se va hasta PersonaMateria y Materia a buscar la info
        /*Crear la conexion
            Hacer la query
            Almacenar los resultados
            Cierro conexion
         */
        return null;
    }

    public static PersonaModel getPersona(String pCi) {
        //Aca es donde se va hasta PersonaMateria y Materia a buscar la info
        /*  Crear la conexion
            Hacer la query
            Almacenar los resultados
            Cierro conexion
         */
        return null;
    }

    //Retornar unicamente la CI
    public static PersonaModel[] getPersonasByRol(String pRol) {
        BasicDBObject query = new BasicDBObject();
        query.put("tipo", pRol);
        MongoCursor<Document> cursor = tabla.find(query).iterator();
        while (cursor.hasNext()) {
            Document doc = cursor.next();
            
        }
        /*Crear la conexion
            Hacer la query
            Almacenar los resultados
            Cierro conexion
         */
        return null;
    }

    public static void actualizarPersona(String pCi, String pRol) {
        /*
            Actualizar rol 
         */
    }

    public static void deletePersona(String pCi) {
        /*
            Eliminar persona con esa CI
         */
    }
}
