/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina;

/**
 *
 * @author Jesus
 */
public final class Bicicleta extends MaquinaMecanica{
    //Atributos privados
    private double radioRueda; //se mide en cms 
    private double totalKilometros;
    
    // constantes de clase 
    private static final double DEFAULT_RADIO_RUEDA  = 33.0; // (valor por defecto para el radio)
    private static final double MIN_RADIO_RUEDA = 17.75; // (valor mínimo para el radio)
    private static final double MAX_RADIO_RUEDA = 36.85; //(valor máximo para el radio)
    private static final double MAX_DESPLAZAMIENTO = 200.0; //(número máximo de kilómetros 
                                                             //que se puede desplazar una bicicleta sin hacer paradas

//Crea un constructor con todos los parámetros: marca, modelo, radioRueda (Se establede Fuerza.Animal con valor necesesario)

    /**
     * Constructor completo de la clase Bicicleta
     * @param marca String para asignar la Marca
     * @param modelo String para asignar el Modelo
     * @param radioRueda Double para asignar el radio de la rueda
     */
    public Bicicleta(String marca, 
                     String modelo,
                     double radioRueda){
        
        super(marca, modelo, Fuerza.ANIMAL);
        this.radioRueda = radioRueda;
    }
    
    /**
     * Constructor de la clase Bicicleta sin el parámetro "radioRueda"
     * @param marca String para asignar la Marca
     * @param modelo String para asignar el Modelo
     */
    public Bicicleta(String marca, 
                     String modelo){
        
        super(marca, modelo);
    }

    /**
     * Metodo para obtener el radio de la rueda.
     * @return Double con el tamaño del radio de la rueda
     */
    public double getRadioRueda() {
        return radioRueda;
    }

    /**
     * Metodo para obtener el total de kilometros
     * @return Double con el total de kilometros 
     */
    public double getTotalKilometros() {
        return totalKilometros;
    }

    
    /**
     * Metodo para obtener una cadena de texto con los datos de la clase 
     * Bicicleta
     * @return String de tipo ToString con los datos de la Clase más los datos
     * de la clase del Padre.
     */
    @Override
    public String toString() {
        String salida = super.toString();
        salida = salida.substring(0, (salida.length() - 1) );
        
        return salida + String.format(" Radio: %4.2f; Kilómetros: %4.2f }", radioRueda, totalKilometros);
    }   
}