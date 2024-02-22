/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina;

/**
 *
 * @author Jesus
 */
public final class Molino extends MaquinaMecanica{
    //atributo 
    private TipoMolino tipoDeMolino;
    
    /**
     * Constructor de la clase Molino
     * @param marca String para asignar la Marca
     * @param modelo String para asignar el Modelo
     * @param fuerzaMotriz Fuerza para asignar el tipo de fuerza motriz
     */
    public Molino(String marca, 
                  String modelo, 
                  Fuerza fuerzaMotriz) {
        super(marca, modelo, fuerzaMotriz);
        
        //swtich para asignar tipo de molino dependiendo de la fuerzamotriz 
        switch(fuerzaMotriz){
            case ANIMAL: 
                this.tipoDeMolino = TipoMolino.FUERZA_ANIMAL;
                break;
            case ELECTRICIDAD: 
                this.tipoDeMolino = TipoMolino.ELECTRICO;
                break;
            case COMBUSTIBLE: 
                this.tipoDeMolino = TipoMolino.A_MOTOR_COMBUSTION;
                break;
            case VIENTO: 
                this.tipoDeMolino = TipoMolino.DE_VIENTO;
                break;
            case CORRIENTE_AGUA: 
                this.tipoDeMolino = TipoMolino.DE_AGUA;
                break;
            default:
                break;
        }
    }

    /**
     * Metodo para obtener el tipo de molino
     * @return TipoDeMolino con el tipo de molino de este molino
     */
    public TipoMolino getTipoDeMolino() {
        return tipoDeMolino;
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
        
        return salida + String.format(" Molino de: %18s }", tipoDeMolino);
    }
}
