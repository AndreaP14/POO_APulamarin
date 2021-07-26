/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author user
 */
public class ClaseB {
    
    //METODOS//
    //metodo de la clase de salida//
    public static void ingreso(){
        System.out.println("Hola... Bienvenido");
       
    }
    //metodo de clase de retorno//
    public static String retornarDatos (){
        
            String x;
            x="Como esta";
            return x;
             
        }

    //metodo instacia de salida//
    public void salir (){
        System.out.println("Hoy nos vamos la piscina");
    }
    
    //metodo de instacia de retorno//
    public boolean correr(){
        return 5==7; //false
        
    }


}
