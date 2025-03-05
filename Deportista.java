/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Deportista {
    //subclase Deportista

    private final String deporte;
    private final String calzado;
    private final int medallas;
    private final int horasEntrenamiento;

    public Deportista(String deporte, String calzado, int medallas, int horasEntrenamiento) {
        this.deporte = deporte;
        this.calzado = calzado;
        this.medallas = medallas;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public void mostrarInformacion() {
        System.out.println("Deporte: " + deporte);
        System.out.println("Calzado: " + calzado);
        System.out.println("Medallas ganadas: " + medallas);
        System.out.println("Horas de entrenamiento por dia : " + horasEntrenamiento);
    }

    public void entrenar() {
        System.out.println("El deportista está entrenando.");
     
    }

    public void competir() {
        System.out.println("El deportista está compitiendo.");
    }

    public void ganarMedalla() {
        System.out.println("¡El deportista ha ganado una medalla!");
      
    }

    public void descansar() {
        System.out.println("El deportista está descansando.");
    }
}
    

