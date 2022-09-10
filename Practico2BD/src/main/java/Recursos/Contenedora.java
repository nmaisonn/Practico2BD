/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import Negocio.Persona;
import Negocio.Rol;

/**
 *
 * @author nmais
 */
public class Contenedora {

    private static Contenedora instance;
    
    private Persona personaDetalles;
    private Rol rolListado;

    private Contenedora() {        
    }

    public static Contenedora GetInstance() {
        if (instance == null) {
            instance = new Contenedora();
        }
        return instance;
    }
    
    public Persona getPersonaDetalle()
    {
        return this.personaDetalles;
    }
    public void setPersona(Persona p){
        this.personaDetalles = p;
    }
    
    public void setRolListado(Rol pRol)
    {
        this.rolListado = pRol;
    }
    
    public Rol getRolListado()
    {
       return this.rolListado;
    }
}
