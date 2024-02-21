/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina;

/**
 *
 * @author Jesus
 */
public abstract class Maquina {
    //Atributos protegidos de objeto
    protected String marca;
    protected String modelo;
    protected int numeroDeSerie;
    
    //Atributos públicos de clase
    public int cantidadDeMaquinasFabricadas = 0;
    
    //Crea un constructor con los parámetros marca y modelo (numeroDeSerie será igual al número total de máquinas fabricadas)
    Maquina(String marca,
            String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeSerie = cantidadDeMaquinasFabricadas;
        cantidadDeMaquinasFabricadas++;
    }

    /**
     * Metodo para obtener la marca de la maquina 
     * @return String con la marca de la maquina indicada
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo para obtener el modelo de la maquina 
     * @return String con el modelo de la maquina indicada
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo para obtener el numero de serie de la maquina
     * @return Entero con el numero de serie de la maquina
     */
    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    /**
     * Metodo para obtener la cantidad de maquinas fabricadas
     * @return Entero con la cantidad de maquinas fabricadas
     */
    public int getCantidadDeMaquinasFabricadas() {
        return cantidadDeMaquinasFabricadas;
    }

    /**
     * Metodo para obtener una cadena de texto con los datos de la clase Maquina
     * @return String de tipo ToString con los datos de la Clase
     */
    @Override
    public String toString() {
        return String.format("{ Marca: %10s; Modelo %10s; NS: %4d; }" ,marca,  modelo , numeroDeSerie);
    }
    
}
