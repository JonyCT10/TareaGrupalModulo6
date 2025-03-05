/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Persona {
    public int pies=2;
    public int manos=2;
    public int ojos=2;
    public String colorPelo;
    
    public void partesCuerpo(){
        System.out.println("Una persona normal tiene: "+pies+" pies "+manos+" manos "+ojos+" ojos");   
    }
    
    public void colorPelo(String color){
        this.colorPelo=color;
        System.out.println("Su color de cabello es: "+color);
    }
    
    public void caminar(){
        System.out.println("El esta caminando");
    }
    
    public void comer(){
        System.out.println("El esta comiendo");
    }
      
    public void estudiar(){
        System.out.println("El esta estudiando");
    }
 
    public void trabajar(){
        System.out.println("El esta trabajando");
    }
}

//subclase Deportista
 class Deportista extends Persona {
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