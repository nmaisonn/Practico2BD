/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Negocio.Persona;

/**
 *
 * @author nmais
 */
public class PersonaData {
    
    /*Este metodo tiene que retonrar personas que unicamente tengan 
      ci,nombre y rol
    */
    public static Persona[] getPersonas()
    {
        //Aca es donde se va hasta PersonaMateria y Materia a buscar la info
        /*Crear la conexion
            Hacer la query
            Almacenar los resultados
            Cierro conexion
        */
        return null;
    }
    
    public static Persona getPersona(String pCi)
    {
        //Aca es donde se va hasta PersonaMateria y Materia a buscar la info
        /*  Crear la conexion
            Hacer la query
            Almacenar los resultados
            Cierro conexion
        */
        return null;
    }
    
    //Retornar unicamente la CI
    public static String[] getPersonasByRol(String pRol)
    {
        /*Crear la conexion
            Hacer la query
            Almacenar los resultados
            Cierro conexion
        */
        return null;
    }
    
    public static void actualizarPersona(String pCi,String pRol)
    {
        /*
            Actualizar rol 
        */
    }
    
    public static void deletePersona(String pCi)
    {
        /*
            Eliminar persona con esa CI
        */
    }
}
