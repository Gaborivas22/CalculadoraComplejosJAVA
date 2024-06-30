package Complejos;
import java.util.*;

public class Main extends Complejo {
	private static Scanner teclado = new Scanner (System.in);
    public static int Menu(){
        int opcion;
        System.out.println();
        System.out.println("calculadora de numeros complejos");
        System.out.println();
        System.out.println("1)SUMAR");
        System.out.println("2)RESTAR");
        System.out.println("3)MULTIPLICAR");
        System.out.println("4)DIVIDIR");
        System.out.println("5)SALIR");
        System.out.println();
        System.out.print(" OPCION: ");
        opcion = teclado.nextInt();
        return opcion;
    }
    public static void main(String args[]){        
        Complejo calculadora,complejo1,complejo2,resultado;
        Process p;
        calculadora = new Complejo();
        double real, imag;
        int opcion;
        do{
            opcion = Menu();
            
            switch(opcion){
                case 1: 
                    System.out.print("Escribe el primer real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = teclado.nextDouble();                    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = teclado.nextDouble();                    
                    complejo2 = new Complejo (real, imag);                    
                    resultado = complejo1.suma(complejo2);
                    if (resultado.getImaginario() < 0.0)
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + resultado.getImaginario()+"i");
                    else
                       System.out.println("El resultado es: " + 
                       resultado.getReal() + resultado.getImaginario()+"i");
                    break;
                case 2:
                    System.out.print("Escribe el primer real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = teclado.nextDouble();    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = teclado.nextDouble();
                    complejo2 = new Complejo (real, imag);
                    resultado = complejo1.resta(complejo2);                    
                    if (resultado.getImaginario() <0.0)
                      System.out.println("El resultadoultado es: " + 
                      resultado.getReal() + resultado.getImaginario()+"+ i");
                    else
                      System.out.println("El resultadoultado es: " + 
                      resultado.getReal() + resultado.getImaginario()+"+ i");
                    break;
                case 3:
                    System.out.print("Escribe el primer real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = teclado.nextDouble();    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = teclado.nextDouble();
                    complejo2 = new Complejo (real, imag);
                    resultado = complejo1.resta(complejo2);
                    resultado = complejo1.multiplicacion(complejo2);
                    if (resultado.getImaginario() <0.0)
                      System.out.println("El resultadoultado es: " + 
                      resultado.getReal() + resultado.getImaginario()+"+ i");
                    else
                      System.out.println("El resultadoultado es: " + 
                      resultado.getReal() + resultado.getImaginario()+"+ i");
                    break;
                case 4:
                    System.out.print("Escribe el primer real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = teclado.nextDouble();    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = teclado.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = teclado.nextDouble();
                    complejo2 = new Complejo (real, imag);
                    resultado = complejo1.resta(complejo2);
                    resultado = complejo1.division(complejo2);
                    if (resultado.getImaginario() <0.0)
                      System.out.println("El resultado es: "+ 
                      resultado.getReal() + resultado.getImaginario()+"+ i");
                    else
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + resultado.getImaginario()+"+ i");
                    break;
                case 5:
                    System.out.println("adios");
                    break;
                default: 
                    break;
            }
        }while(opcion!=5);
    }

}
