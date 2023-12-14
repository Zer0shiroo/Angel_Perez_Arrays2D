/**
 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de
 * una empresa y detectar si existe brecha salarial entre ambos. El programa
 * pedirá
 * por teclado la información de N personas distintas (valor también introducido
 * por teclado).
 * Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su
 * sueldo. Esta
 * información debe guardarse en una única matriz. Luego se mostrará por
 * pantalla el sueldo medio
 * de cada género.
 * 
 * @author Ángel Pérez
 * 
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Dime el número de pesonas que trabajan en la empresa");
        int personas = Integer.parseInt(System.console().readLine());
        int[][] infoPersona = new int[personas][2];//Se ccrean variables ara guardar el sueldo de cada género y contabilizar cuántos hombres o mujeres hay
        int columna = 0;
        int genero = 3;
        int sueldoMasc = 0;
        int personaMasc = 0;
        int personaFem = 0;
        int sueldoFem = 0;
        for (columna = 0; columna < infoPersona.length; columna++) {//En cada posición del array se rellena con una información dependiendo del género
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    System.out.println("¿Cuál es su género? Introduce 0 si eres hombre o introduce 1 si eres mujer");
                    genero = Integer.parseInt(System.console().readLine());
                    infoPersona[columna][i] = genero;
                }

                if (i == 1 && genero == 0) {//Según lo que elija el usuario  se almacenarán en unas variables u otras
                    personaMasc++;
                    System.out.println("¿Cuál es su sueldo?");
                    sueldoMasc = sueldoMasc + Integer.parseInt(System.console().readLine());

                }

                if (i == 1 && genero == 1) {
                    personaFem++;
                    System.out.println("¿Cuál es su sueldo?");
                    sueldoFem = sueldoFem + Integer.parseInt(System.console().readLine());

                }
            }

        }//Al final se imprimirán la media de los sueldos
        System.out.println("El sueldo medio de los hombres es: " + sueldoMasc / personaMasc);
        System.out.println("El sueldo medio de las mujeres es: " + sueldoFem / personaFem);
    }
}
