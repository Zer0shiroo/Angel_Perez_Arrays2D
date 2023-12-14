/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son igual a cero.
 * 
 * @author Ángel Pérez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Dime el número de columnas que desee en la matriz");
        int columna = Integer.parseInt(System.console().readLine());
        System.out.println("Dime el número de filas que desee en la matriz");
        int fila = Integer.parseInt(System.console().readLine());
        int debajocero = 0;// Variables para alacenar la cantidad de valores que sean iguales, superiores o
                           // inferiores a 0
        int encimacero = 0;
        int cero = 0;

        int[][] matriz = new int[columna][fila];
        for (columna = 0; columna < matriz.length; columna++) {// Dos bucles for para ir cambiando de posición en el
                                                               // array

            for (int i = 0; i < matriz.length; i++) {
                System.out.println("Dime el valor de la posición " + columna + "," + i); // El usuario dice el valor, se
                                                                                         // inserta en la posición
                                                                                         // correspondiente y mira si es
                                                                                         // menor mayor o igual a 0
                int valor = Integer.parseInt(System.console().readLine());
                if (valor < 0) {

                    debajocero++;

                }
                if (valor > 0) {
                    encimacero++;
                }
                if (valor == 0) {
                    cero++;
                }
                matriz[columna][i] = valor;

            }

        }

        System.out.println("Valores de las matrices:");
        for (columna = 0; columna < matriz.length; columna++) {// Hacemos un bucle for para recorrer todo el array
                                                               // mostrando al usuario los valores que puso

            for (int i = 0; i < fila; i++) {
                System.out.print("Valor de la posición " + columna + "," + i + ": ");

                System.out.println(matriz[columna][i]);
            }
        }
        System.out.println();
        System.out.println("Valores por encima de cero:" + encimacero);// Se muestran los valores de por encima, debajo
                                                                       // e iguales a cero
        System.out.println("Valores por debajo de cero:" + debajocero);
        System.out.println("Valores iguales a cero:" + cero);
    }
}
