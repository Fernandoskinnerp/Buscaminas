/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Estudiantes
 */
public class Sembrador {
    
    void sembrarMina(Celda lasCeldas[][],int cantidad){
        
        for(Celda[] lafila:lasCeldas){
        for (Celda laCelda:lafila ){
            Mina unamina=new Mina();
            laCelda.setmimina(unamina);
            
            
        }
        
    }
        
        
        
        
    }
    
    
    
    
}
