/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P1_CarlosBonilla;

/**
 *
 * @author lospe
 */
public class Pico {
    String tipo;
    int vida; 
public Pico(String tipo,int vida){
    this.tipo=tipo;
}
public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    /*Metodos*/

       @Override
       
    public String toString() {
        return this.tipo;
    }
    public void changeTipo(String material){
    this.tipo=material;
}
    public void changeVida(int cambioVida){
    this.vida=cambioVida;
}
}
