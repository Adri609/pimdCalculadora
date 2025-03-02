/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pimdcalculadora;

/**
 *
 * @author Bogdan Adrián Tucaciuc
 */
public class Logica {
    
    // Metodo para sumar
    public double sumar(double a, double b) {
        return a+b;
    }
    
    // Metodo para restar
    public double restar (double a, double b){
        return a-b;
    }
    
    // Metodo para multiplicar
    public double multiplicar (double a, double b) {
        return a*b;
    }
    
    // Método para dividir con una excepción en caso de que se intente dividir por 0
    public double dividir (double a, double b) {
        if(a == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a/b;
    }
}
