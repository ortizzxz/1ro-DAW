/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina;

/**
 *
 * @author Jesus
 */
public abstract class MaquinaMecanica extends Maquina{
    //Atributo protegido de objeto
    protected Fuerza fuerzaMotriz;
    //Constante pública de clase
    public static final Fuerza DEFAULT_FUERZA_MOTRIZ = Fuerza.ANIMAL;
    

    //Crea un constructor con los parámetros marca, modelo, fuerzaMotriz

    /**
     * Constructor de la clase MaquinaMecanica con todos los parametros necesarios
     * @param marca String para asignar la Marca
     * @param modelo String para asignar el Modelo
     * @param fuerzaMotriz Fuerza para asignar el tipo de fuerza motriz
     */
    public MaquinaMecanica(String marca, 
                           String modelo, 
                           Fuerza fuerzaMotriz){
        super(marca, modelo);
        this.fuerzaMotriz = fuerzaMotriz;
    }
    
    //Crea otro constructor con sólo los parámetros marca y modelo. Se asignará la fuerzaMotriz por defecto.

    /**
     *Constructor de la clase MaquinaMecanica con la fuerzaMotriz por defecto
     * @param marca String para asignar la Marca
     * @param modelo String para asignar el Modelo
     */
    public MaquinaMecanica(String marca,
                           String modelo){
        super(marca, modelo);
        this.fuerzaMotriz = MaquinaMecanica.DEFAULT_FUERZA_MOTRIZ;
    }

    /**
     * Metodo para obtener la Fuerza de la maquina
     * @return Fuerza con la fuerzaMotriz de la maquina
     */
    public Fuerza getFuerzaMotriz() {
        return fuerzaMotriz;
    }

    /**
     * Metodo para obtener una cadena de texto con los datos de la clase 
     * MaquinaMecanica
     * @return String de tipo ToString con los datos de la Clase más los datos
     * de la clase del Padre.
     */
    @Override
    public String toString() {
        String salida = super.toString();
        salida = salida.substring(0, (salida.length() - 1));
        
        return salida + String.format(" Fuerza Motriz: %10s }", fuerzaMotriz);
    }   
}