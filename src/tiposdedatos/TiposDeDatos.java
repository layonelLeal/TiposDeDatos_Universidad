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
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("|------ BIENVENIDO ------|");
        System.out.println("Ejercicio Practico de los tipos de datos.");
        
        System.out.println("Ingresa un boleano: ");
        boolean user_boleano = Boolean.parseBoolean(sc.next()); 
        System.out.println("El Boleano Igresado es: " + user_boleano + " y ocupa un espacio de: " + BOOLEAN_SIZE + " bits");
        
        System.out.println("Ingresa un caracter: ");
        char user_character = sc.next().charAt(0);
        System.out.println("El Caracter Igresado es: " + user_character + " y ocupa un espacio de: " + CHARACTER_SIZE + " bits");
        
        System.out.println("Ingresa un byte: ");
        byte user_byte = sc.nextByte();
        System.out.println("El Byte Igresado es: " + user_byte + " y ocupa un espacio de: " + BYTE_SIZE + " bits");
        
        System.out.println("Ingresa un numero del tipo Short: ");
        short user_short = sc.nextShort();
        System.out.println("El numero Short ingresado es: " + user_short + " y ocupa un espacio de: "+ SHORT_SIZE + " bits");
        
        System.out.println("Ingresa un numero del tipo Int: ");
        int user_int = sc.nextInt();
        System.out.println("El numero Int ingresado es: " + user_int + " y ocupa un espacio de: "+ INT_SIZE + " bits");
        
        System.out.println("Ingresa un numero del tipo Long: ");
        long user_long = sc.nextLong();
        System.out.println("El numero Long ingresado es: " + user_long + " y ocupa un espacio de: "+ LONG_SIZE + " bits");
        
        System.out.println("Ingresa un numero del tipo Float: ");
        float user_float = sc.nextFloat();
        System.out.println("El numero Long ingresado es: " + user_float + " y ocupa un espacio de: "+ FLOAT_SIZE + " bits");
        
        System.out.println("Ingresa un numero del tipo Double: ");
        double user_double = sc.nextDouble();
        System.out.println("El numero Double ingresado es: " + user_double + " y ocupa un espacio de: "+ DOUBLE_SIZE + " bits");
        
        sc.close();
    }

}
