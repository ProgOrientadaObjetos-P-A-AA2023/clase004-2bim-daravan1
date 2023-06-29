/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
public class TransporteTransvia {
    private String cooperativaTrans;
    private double tarifa;
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTrans = n;
    }
    
    public void establecerTarifa(){
        tarifa = 20.00 + 0.10;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativaTrans;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
}
