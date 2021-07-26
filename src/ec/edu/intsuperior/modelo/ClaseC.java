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
public class ClaseC {
    
    //METODOS//
    //metodo de la clase de salida//
    public static void Oficina(){
        System.out.println("Bienvenidos a la oficia administrativa");
       
    }
    //metodo de clase de retorno//
    public static String retornarDatos (){
        
            String x;
            x="Ingresar su nombre";
            return x;
             
        }

    //metodo instacia de salida//
    public void comer (){
        System.out.println("Hoy nos vamos almorzar en La Mirage");
    }
    
    //metodo de instacia de retorno//
    public boolean est(){
        return 7==6; //false
        
    }


}
