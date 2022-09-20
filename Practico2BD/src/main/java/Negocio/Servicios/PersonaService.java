/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaDAO;
import Data.Modelos.PersonaModel;
import Negocio.DTOS.PersonaDTO;
import java.util.LinkedList;

/**
 *
 * @author nmais
 */
public class PersonaService {
     //Retorna CI, Nombre, Rol
    public static LinkedList<PersonaDTO> getPersonas() {
        PersonaModel[] personas = PersonaDAO.getPersonas();
        if (personas.length > 0) {
            LinkedList<PersonaDTO> xRetorno = new LinkedList<>();
            for(PersonaModel p:personas)
            {
                PersonaDTO pers = new PersonaDTO(p.Nombre,null,p.Ci,null,null,null,p.Tipos,null,null);
                xRetorno.add(pers);
            }
            return xRetorno;
        }
        return null;
    }

    //Retornar CI
    public static LinkedList<PersonaDTO> getPersonasByRol(String pRol) {
        PersonaModel[] personas = PersonaDAO.getPersonasByRol(pRol);
        if (personas.length > 0) {
            LinkedList<PersonaDTO> xRetorno = new LinkedList<>();
            for(PersonaModel p:personas)
            {
                PersonaDTO pers = new PersonaDTO(null,null,p.Ci,null,null,null,null,null,null);
                xRetorno.add(pers);
            }
            return xRetorno;
        }
        return null;
    }

    //Retorna la persona a partir de una CI
    public static PersonaDTO getPersonaByCi(String pCi) {
        PersonaModel p = PersonaDAO.getPersona(pCi);
        if(p!= null)
        {
            PersonaDTO xRetorno = new PersonaDTO(p.Nombre,p.Apellido,p.Ci,p.FechaNacimiento,p.Telefono,p.Email,p.Tipos,p.MateriaCursando,p.MateriaDictando);
            return xRetorno;
        }
        return null;
    }

    public static void actualizarPersona(String pCi,String pRol) {
        //Si se realizo la modificacion, se retorna true, sino flase.
        PersonaDAO.actualizarPersona(pCi,pRol);
    }

    public static void deletePersona(String pCi) {
        //Se listan todas las personas que hay en el sistema.
        //Se retorna true si se realizo la eliminacion de la persona con cedula
        PersonaDAO.deletePersona(pCi);
    }
}
