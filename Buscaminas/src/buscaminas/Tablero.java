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
public class Tablero {

    Celda micelda[][];
    Cronometro micronometro;
    Contador micontador;
    Emoji miemoji;

    Tablero(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Celda[][] getMicelda() {
        return micelda;
    }

    public void setMicelda(Celda[][] micelda) {
        this.micelda = micelda;
    }

    public Cronometro getMicronometro() {
        return micronometro;
    }

    public void setMicronometro(Cronometro micronometro) {
        this.micronometro = micronometro;
    }

    public Contador getMicontador() {
        return micontador;
    }

    public void setMicontador(Contador micontador) {
        this.micontador = micontador;
    }

    public Emoji getMiemoji() {
        return miemoji;
    }

    public void setMiemoji(Emoji miemoji) {
        this.miemoji = miemoji;
    }

    public Sembrador getMisembrador() {
        return misembrador;
    }

    public void setMisembrador(Sembrador misembrador) {
        this.misembrador = misembrador;
    }
    
    

    public Tablero(int ancho, int largo, Celda[][] misCeldas) {

        misCeldas=new Celda[ancho][largo];

        int fila;
        int columna;
        
        for(fila=0;fila<largo;fila++){
            for(columna=0;columna<ancho;columna++){
                misCeldas[fila][columna]=new Celda();
            }
        }

    }
    
    Sembrador misembrador=new Sembrador();{
         
               
                         
    misembrador.sembrarMina(misCeldas,50)
            
}
}



    


