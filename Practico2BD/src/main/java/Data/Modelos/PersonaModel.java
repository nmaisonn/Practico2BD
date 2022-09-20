/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Modelos;

import Negocio.DTOS.PersonaMateriaDTO;
import Negocio.DTOS.RolDTO;
import java.util.LinkedList;

/**
 *
 * @author nmais
 */
public class PersonaModel {
    public int Id;
    public String Nombre;
    public String Apellido;
    public String Ci;
    public String FechaNacimiento;
    public String Telefono;
    public String Email;
    public LinkedList<RolDTO> Tipos = new LinkedList();
    public LinkedList<PersonaMateriaDTO> MateriaCursando = new LinkedList();
    public LinkedList<PersonaMateriaDTO> MateriaDictando = new LinkedList();

    public PersonaModel(String pNombre, String pApellido, String pCi, String pFechaNacimiento, String pTelefono, String pEmail, LinkedList<RolDTO> pTipos, LinkedList<PersonaMateriaDTO> pMateriaCursando, LinkedList<PersonaMateriaDTO> pMateriaDictando) {
        this.Nombre = pNombre;
        this.Apellido = pApellido;
        this.Ci = pCi;
        this.FechaNacimiento = pFechaNacimiento;
        this.Telefono = pTelefono;
        this.Email = pEmail;
        if (pTipos.isEmpty()) {
            RolDTO xRol = new RolDTO("Alumno");
            this.Tipos.add(xRol);
        } else {
            this.Tipos = pTipos;
        }
        this.MateriaCursando = pMateriaCursando;
        this.MateriaDictando = pMateriaDictando;
    }
}
