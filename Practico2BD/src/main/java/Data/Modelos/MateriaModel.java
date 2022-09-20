/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Modelos;

/**
 *
 * @author nmais
 */
public class MateriaModel {
    public int Id;
    public String Nombre;
    public int Creditos;
    public int CantidadClases;
    
    public MateriaModel(String pNombre, int pCreditos, int pCantidadClases)
    {
        this.Nombre=pNombre;
        this.Creditos=pCreditos;
        this.CantidadClases=pCantidadClases;
    }
}
