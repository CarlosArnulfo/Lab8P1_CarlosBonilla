/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;
/**
 *
 * @author lospe
 */
public class Lab8P1_CarlosBonilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu=0;
        System.out.println("BIENVENIDO A MINECRAFT");
        System.out.println("0. Jugar");
        System.out.println("1. Salir");
        Scanner lector = new Scanner(System.in);
        menu=lector.nextInt();
        do{
        switch (menu){
            case 0:
                Mynecraft mynecraft= new Mynecraft();
                mynecraft.play();
            case 1:
                System.out.println("saliendo del juego");
        }
        } while(menu!=1);
    }
    
}
