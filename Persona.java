/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Persona {
    private final int pies=2;
    private final int manos=2;
    private final int ojos=2;
    private String colorPelo;
    
    public void partesCuerpo(){
        System.out.println("Una persona normal tiene: "+pies+" pies "+manos+" manos "+ojos+" ojos");   
    }
    
    public void colorPelo(String colorp){
        this.colorPelo=colorp;
        System.out.println("Su color de cabello es: "+colorPelo);
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
    
    public static void main(String[] args) {
        System.out.println("----Clase persona----");
        Persona persona1=new Persona();
        persona1.partesCuerpo();
        persona1.colorPelo("Negro");
        persona1.caminar();
        persona1.comer();
        persona1.estudiar();
        persona1.trabajar();
    
        System.out.println("\n----Subclase Deportista----");
        //Creando un objeto Deportista del tipo Persona
        Persona deportista1=new Deportista("Tennis","Nike",4,6);
        
        //Uso de polimorfismo,sobreescribiendo un metodo de la clase padre
        deportista1.caminar();
       
        Deportista depor1=new Deportista("Futbol","Tacos",1,4);
        depor1.mostrarInformacion();
        depor1.mostrarInformacion();
        depor1.entrenar();
        depor1.competir();
        depor1.ganarMedalla();
        depor1.descansar();

        System.out.println("\n----Subclase Doctor----");
        //Creando un objeto Doctor del tipo Persona
        Persona doctor1=new Doctor("Cirujano",10);

        //Uso de polimorfismo,sobreescribiendo un metodo de la clase padre
        doctor1.trabajar();
        doctor1.estudiar();

        Doctor doc1=new Doctor("Pediatra",5);
        doc1.diag();
        doc1.rec();
        doc1.mostrarInformacion();
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
    
    public void caminar(){
        System.out.println("El esta caminando con su calzado: "+calzado);
    }
}

class Doctor extends Persona {
    private final String especialidad;
    private final int eAños;
    
    public Doctor(String especialidad, int eAños) {
        this.especialidad = especialidad;
        this.eAños = eAños;
    }
    
    public void diag() {
       System.out.println("El doctor esta dandole un diagnostico a un paciente");
    }
    
    public void rec() {
       System.out.println("El doctor está recetando un tratamiento.");
    }
    
    public void mostrarInformacion() {
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de experiencia: " + eAños);
    }
    
    public void trabajar(){
        System.out.println("El esta trabajando de: "+ especialidad );
    }
    
    public void estudiar(){
        System.out.println("El esta sacando su maestria de: "+ especialidad );
    }
}
