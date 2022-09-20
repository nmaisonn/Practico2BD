/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import Negocio.DTOS.PersonaDTO;
import Negocio.DTOS.RolDTO;


/**
 *
 * @author nmais
 */
public class Contenedora {

    private static Contenedora instance;
    
    private PersonaDTO personaDetalles;
    private RolDTO rolListado;

    private Contenedora() {        
    }

    public static Contenedora GetInstance() {
        if (instance == null) {
            instance = new Contenedora();
        }
        return instance;
    }
    
    public PersonaDTO getPersonaDetalle()
    {
        return this.personaDetalles;
    }
    public void setPersona(PersonaDTO p){
        this.personaDetalles = p;
    }
    
    public void setRolListado(RolDTO pRol)
    {
        this.rolListado = pRol;
    }
    
    public RolDTO getRolListado()
    {
       return this.rolListado;
    }
}
