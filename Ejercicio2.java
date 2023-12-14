/**
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las
 * tablas de
 * multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz
 * por pantalla
 * 
 * @author Ángel Pérez
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int fila = 1;// Creamos una variable para las fila y columnas del array
        int columna = 0;
        int[][] matriz = new int[10][10];
        for (columna = 0; columna < matriz.length; columna++) {// Hacemos un bucle for para ir cambiando de columnas
            System.out.println("Tabla del " + (columna + 1)); 
            for (int i = 0; i < 10; i++) {// Hacemos un contador (i) para que vaya poniendo los valores de fila hasta que alcance el valor máximo del array y tras eso sale del bucle

                matriz[columna][i] = fila*(columna+1) ; //Aquí hacemos que múltiplique por la tabla que toque de multiplicar y la posición del número, es decir, si es la columna 2 y la posición 9 multiplicará 2*9
                                        
                System.out.println(matriz[columna][i]);
                fila++;//Va avanzando la posición de la fila
            }
            fila=1;//Se reinician las filas para luego volver a multiplicar en el segundo for por las columnas
        }

    }
}
