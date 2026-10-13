/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n, op;
        Libro libros =null;
       
        do{
            System.out.println("MENU");
            System.out.println("1.Ingresar informacion del libro ");
            System.out.println("2. Prestar");
            System.out.println("3. Devolver");
            System.out.println("4. Mostrar informacion");
            System.out.println("5. Salir");
            System.out.println("Escoja una opcion: ");
            op = sc.nextInt();
            
            switch (op){
                case 1:
                    System.out.println("Numero de libros a ingresar");
                    n = sc.nextInt();
                    for (int i = 1; i < n; i++) {
                        System.out.println("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.println("Autor: ");
                        String autor = sc.nextLine();
                        System.out.println("Numero de paginas: ");
                        int paginas = sc.nextInt();
                        System.out.println("Estado: ");
                        String estado = sc.nextLine();
                        
                       
                    }
                    break;
                    
                case 2: 
                    
            }
        }while (op != 5);
    }
    
}
