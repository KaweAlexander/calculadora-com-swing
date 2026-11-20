/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author kaw3s
 */
public class Calculos {
    
    public Calculos(){      
    }
 
    public static double soma(double numero1, double numero2){        
        return numero1+numero2;
    }
    
    public static double menos(double numero1, double numero2){
        return numero1-numero2;
    }
    
    public static double multiplica(double numero1, double numero2){
        return numero1*numero2;
    }
    
    public static Double dividir(double numero1,double numero2){
        if(numero2 == 0){
          return null;
        }else{
            return numero1 / numero2;
        }
    }
    
    public static double porcentagem(double numero1){
        return numero1 / 100;
    }
}
    
    

