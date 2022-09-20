/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author nmais
 */
public class MateriaDTO {
    public int Id;
    public String Nombre;
    public int Creditos;
    public int CantidadClases;
    
    public MateriaDTO(String pNombre, int pCreditos, int pCantidadClases)
    {
        this.Nombre=pNombre;
        this.Creditos=pCreditos;
        this.CantidadClases=pCantidadClases;
    }
}
