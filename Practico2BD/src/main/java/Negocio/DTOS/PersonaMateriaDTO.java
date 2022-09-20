/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;


/**
 *
 * @author nmais
 */
public class PersonaMateriaDTO {
    public int Id;
    public MateriaDTO Materia;
    public int Asistencias;
    public int Inasistencias;
    
    public PersonaMateriaDTO(MateriaDTO pMateria, int pAsistenica, int pInasistencia)
    {
        this.Materia = pMateria;
        this.Asistencias= pAsistenica;
        this.Inasistencias = pInasistencia;
    }   
}
