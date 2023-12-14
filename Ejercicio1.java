/**
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
 * del 1 al 25 y luego muestre la matriz por pantalla.
 * 
 * @author Ángel Pérez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int fila = 1;//Creamos una variable para las fila y columnas del array
        int columna = 0;
        int[][] matriz = new int[5][5];
        for (columna = 0; columna < matriz.length; columna++) {//Hacemos un bucle for para ir cambiando de columnas

            for (int i=0 ; i < 5; i++) {
                
                matriz[columna][i] = fila;//Hacemos un contador (i) para que vaya poniendo los valores de fila hasta que alcance el valor máximo del array y tras eso sale del bucle
                System.out.println(matriz[columna][i]);
                fila++;
            }
        }
    }

}
