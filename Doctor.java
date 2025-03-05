/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Doctor extends Persona 
{
    private String especialidad;
    private int eAños;
    
    public Doctor(String especialidad, int eAños) 
    {
        this.especialidad = especialidad;
        this.eAños = eAños;
    }
    public void diag() 
    {
       System.out.println("El doctor esta dandole un diagnostico a un paciente");
    }
    public void rec() 
    {
            System.out.println("El doctor está recetando un tratamiento.");
    }
    
    public void mostrarInformacion() {
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de experiencia: " + eAños);
    }
}
