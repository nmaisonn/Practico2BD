/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Data.RolData;

/**
 *
 * @author nmais
 */
public class Rol {
    public int Id;
    public String Nombre;
    
    Rol(String pNombre) {
        this.Nombre= pNombre;
    }
    
    public static int getId(String pTipo)
    {
        //Ir a la base y buscar el id del objeto asociado a ese tipo
        return 0;
    }
    
    public static Rol getRol(String pNombre)
    {
        //Ir a la bd y buscar el rol asociado a ese nombre
        Rol xRetorno = RolData.getRol(pNombre);
        return xRetorno;
    }
}
