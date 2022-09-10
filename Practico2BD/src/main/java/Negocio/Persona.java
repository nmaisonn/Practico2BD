/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Data.PersonaData;
import java.util.LinkedList;

/**
 *
 * @author nmais
 */
public class Persona {

    public int Id;
    public String Nombre;
    public String Apellido;
    public String Ci;
    public String FechaNacimiento;
    public String Telefono;
    public String Email;
    public LinkedList<Rol> Tipos = new LinkedList();
    public LinkedList<PersonaMateria> MateriaCursando = new LinkedList();
    public LinkedList<PersonaMateria> MateriaDictando = new LinkedList();

    public Persona(String pNombre, String pApellido, String pCi, String pFechaNacimiento, String pTelefono, String pEmail, LinkedList<Rol> pTipos, LinkedList<PersonaMateria> pMateriaCursando, LinkedList<PersonaMateria> pMateriaDictando) {
        this.Nombre = pNombre;
        this.Apellido = pApellido;
        this.Ci = pCi;
        this.FechaNacimiento = pFechaNacimiento;
        this.Telefono = pTelefono;
        this.Email = pEmail;
        if (pTipos.isEmpty()) {
            Rol xRol = new Rol("Alumno");
            this.Tipos.add(xRol);
        } else {
            this.Tipos = pTipos;
        }
        this.MateriaCursando = pMateriaCursando;
        this.MateriaDictando = pMateriaDictando;
    }

    //Retorna CI, Nombre, Rol
    public static Persona[] getPersonas() {
        Persona[] personas = PersonaData.getPersonas();
        if (personas.length > 0) {
            return personas;
        }
        return null;
    }

    //Retornar CI
    public static String[] getPersonasByRol(String pRol) {
        String[] xRetorno = PersonaData.getPersonasByRol(pRol);
        return xRetorno;
    }

    //Retorna la persona a partir de una CI
    public static Persona getPersonaByCi(String pCi) {
        Persona xRetorno = PersonaData.getPersona(pCi);
        return xRetorno;
    }

    public static void actualizarPersona(String pCi,String pRol) {
        //Si se realizo la modificacion, se retorna true, sino flase.
        PersonaData.actualizarPersona(pCi,pRol);
    }

    public static void deletePersona(String pCi) {
        //Se listan todas las personas que hay en el sistema.
        //Se retorna true si se realizo la eliminacion de la persona con cedula
        PersonaData.deletePersona(pCi);
    }
    

}
