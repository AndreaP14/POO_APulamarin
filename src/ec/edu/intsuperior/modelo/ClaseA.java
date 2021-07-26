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
public class ClaseA {
    //METODOS//
    //metodo de la clase de salida//
    public static void datos(){
        System.out.println("Hola... Bienvenido soy el metodo datos");
       
    }
    //metodo de clase de retorno//
    public static String retornarDatos (){
        
            String x;
            x="Hola";
            return x;
             
        }

    //metodo instacia de salida//
    public void comer (){
        System.out.println("Hoy nos vamos a comer pizza");
    }
    
    //metodo de instacia de retorno//
    public boolean estudiar(){
        return 5==6; //false
        
    }


}
