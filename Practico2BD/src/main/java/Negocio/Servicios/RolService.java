/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.RolDAO;
import Data.Modelos.RolModel;
import Negocio.DTOS.RolDTO;

/**
 *
 * @author nmais
 */
public class RolService {
    public static int getId(String pTipo)
    {
        //Ir a la base y buscar el id del objeto asociado a ese tipo
        return 0;
    }
    
    public static RolDTO getRol(String pNombre)
    {
        //Ir a la bd y buscar el rol asociado a ese nombre
        RolModel xRol = RolDAO.getRol(pNombre);
        if(xRol != null)
        {
            RolDTO xRetorno = new RolDTO(xRol.Nombre);
            return xRetorno;
        }
        return null;
    }
}
