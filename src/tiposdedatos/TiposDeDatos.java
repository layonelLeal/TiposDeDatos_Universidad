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

    public static void main(String[] args) {
        final int INT_SIZE = Integer.SIZE;
        final int BOOLEAN_SIZE = 1;
        final int CHARACTER_SIZE = Character.SIZE;
        final int BYTE_SIZE = Byte.SIZE;
        final int LONG_SIZE = Long.SIZE;
        final int SHORT_SIZE = Short.SIZE;
        final int FLOAT_SIZE = Float.SIZE;
        final int DOUBLE_SIZE = Double.SIZE;

        String input;
        
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un boleano: ");
        boolean user_boleano = Boolean.parseBoolean(sc.next()); //Aca estoy cambiando de valor un string a un valor boleano.
        System.out.println("El Boleano Igresado es: " + user_boleano + " y ocupa un espacio de: " + BOOLEAN_SIZE + " bits");
        
        System.out.println("Ingresa un caracter: ");
        char user_caracter = sc.next().charAt(0);
        
        System.out.println("El Caracter Igresado es: " + user_caracter + " y ocupa un espacio de: " + CHARACTER_SIZE + " bits");
        System.out.println("Ingresa un byte: ");
        byte user_byte = sc.nextByte();
        System.out.println("El Caracter Igresado es: " + user_byte + " y ocupa un espacio de: " + BYTE_SIZE + " bits");
        
        System.out.println("Ingresa un numero entero: ");
        int user_entero = sc.nextInt();
        System.out.println("El numero entero ingresado es: " + user_entero + " y ocupa un espacio de: "+ INT_SIZE + " bits");
        
    }

}
