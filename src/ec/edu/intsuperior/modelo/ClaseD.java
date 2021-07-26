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
public class ClaseD {
 
    //METODOS//
    //metodo de la clase de salida//
    public static void vacaciones(){
        System.out.println("Hola... iremos de vacaciones a Montañita");
       
    }
    //metodo de clase de retorno//
    public static String retornarDatos (){
        
            String x;
            x="Nos hospedaremos en el hotel Acoma";
            return x;
             
        }

    //metodo instacia de salida//
    public void caminar (){
        System.out.println("Hoy nos vamos a caminar por el muelle");
    }
    
    //metodo de instacia de retorno//
    public boolean estu(){
        return 9==3; //false
        
    }


}
