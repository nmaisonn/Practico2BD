/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.RolModel;
import Recursos.Conexion;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author nmais
 */
public class RolDAO {
    private final Conexion con = Conexion.GetInstance();
    private final MongoCollection<Document> tabla = con.db.getCollection("roles_grupo_2");
    
    public static RolModel getRol(String pRol) {
        /*Crear la conexion
            Hacer la query
            Almacenar los resultados
            Cierro conexion
        */
        return null;
    }
}
