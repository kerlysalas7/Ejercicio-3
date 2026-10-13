/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author PC
 */
public class Libro {
    
    String titulo, autor, estado;
    int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, String estado, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = "disponible";
        this.paginas = paginas;
    }
    
    public void prestar()
    {
        if(estado.equalsIgnoreCase("disponible") ){
            estado = "prestado";
            System.out.println("El libro se puede prestar");
        }else {
            System.out.println("El libro no esta dis[ponible");
        }
            
    }
    public void devolver()
    {
        if(estado.equalsIgnoreCase("prestado")){
            estado = "disponible";
            System.out.println("El libro esta prestado");
        }else{
            System.out.println("El libro esta disponible");
        }
    }
    public void mostrarinfo()
    {
        System.out.println("INFORMACION DEL LIBRO");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+ titulo);
        System.out.println("Paginas: "+ paginas);
        System.out.println("Estado: "+ estado);
      
    }
    
}
