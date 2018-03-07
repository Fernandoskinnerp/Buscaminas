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
    
    void cantidadmina(int matriz[][]){
       int fila = 0,columna = 0,contador;
       contador=0;
       for(int x=-1;x<2;x++){
        for(int y=-1;y<2;y++){
            if(Celdas[fila+x][columna+y].getMina()!=null)
                
                contador++;

          
                
            }
        }
       }
    }


  

             

       
    
    
    
    
    

       
    
