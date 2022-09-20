/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Modelos;


/**
 *
 * @author nmais
 */
public class PersonaMateriaModel {
    public int Id;
    public MateriaModel Materia;
    public int Asistencias;
    public int Inasistencias;
    
    public PersonaMateriaModel(MateriaModel pMateria, int pAsistenica, int pInasistencia)
    {
        this.Materia = pMateria;
        this.Asistencias= pAsistenica;
        this.Inasistencias = pInasistencia;
    }   
}
