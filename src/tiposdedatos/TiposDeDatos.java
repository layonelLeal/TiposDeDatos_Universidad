/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdedatos;
import java.util.Scanner;

/**
 *
 * @author layonel Camilo Leal Diaz
 * El siguiente código se encarga de pedir por consola
 * cada uno de los tipos de datos primitivos. Mostrando lo que ingresó el
 * usuario y que peso tiene en memoria.
 */ 
public class TiposDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int INT_SIZE = Integer.SIZE;
        final int BOOLEAN_SIZE = 1;
        final int CHARACTER_SIZE = Character.SIZE;
        final int BYTE_SIZE = Byte.SIZE;
        String input;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un boleano: ");
        //boolean user_boleano = Boolean.parseBoolean();
        input = sc.next();
        
        if (input.contains("true") || input.contains("false") || input.contains("0") || input.contains("1")){
            System.out.println("Si es un booleano");
        }else{
            System.out.println("No es un booleano, por favor ingrese nuevamente el valor.");
        }
        
        boolean isBolean = Boolean.parseBoolean(input);
        if (!isBolean){
            System.out.println("No es un booleano");
        }
        
        //System.out.println("El Boleano Igresado es: " + user_boleano + " y ocupa un espacio de: " + BOOLEAN_SIZE + " bits");
        
        System.out.println("Ingresa un caracter: ");
        char user_caracter = sc.next().charAt(0);
        System.out.println("El Caracter Igresado es: " + user_caracter + " y ocupa un espacio de: " + CHARACTER_SIZE + " bits");
        System.out.println("Ingresa un byte: ");
        byte user_byte = Byte.parseByte(sc.next());
        System.out.println("El Caracter Igresado es: " + user_byte + " y ocupa un espacio de: " + BYTE_SIZE + " bits");
        
    }

}
