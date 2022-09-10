/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author nmais
 */
public class PersonaMateria {
    
    public int Id;
    public Materia Materia;
    public int Asistencias;
    public int Inasistencias;
    
    public PersonaMateria(Materia pMateria, int pAsistenica, int pInasistencia)
    {
        this.Materia = pMateria;
        this.Asistencias=pAsistenica;
        this.Inasistencias = pInasistencia;
    }   
}
