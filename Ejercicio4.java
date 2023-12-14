public class Ejercicio4 {
    public static void main(String[] args) {
        float[][] calAlumnos = new float[4][5];
        int columna = 0;// Creamos la variable columna y las notas máximas, mínimas y medias
        float notaMin = 0;
        float notaMax = 0;
        float notaMed = 0;
        for (columna = 0; columna < calAlumnos.length; columna++) {// Hacemos un bucle for para ir cambiando de columnas

            for (int i = 0; i < 5; i++) {
                System.out.println("Dime la nota " + (i + 1) + " del alumno " + (columna + 1));//El usuario introduce las notas y el programa determina si es mayor o menor
                float valor = Float.parseFloat(System.console().readLine());
                calAlumnos[columna][i] = valor;
                if (notaMax == 0) {
                    notaMax = valor;
                    notaMin = valor;
                }
                if (notaMax < valor) {
                    notaMax = valor;
                }
                if (notaMin > valor) {
                    notaMin = valor;
                }
                notaMed = notaMed + valor; //Todas las notas se suman en una variable y despúes se les hace la media

            }
            notaMed = notaMed / 5;

            System.out.println("Nota máxima:" + notaMax);//Se imprimen las notas y se reinician
            System.out.println("Nota mínima:" + notaMin);
            System.out.printf("Nota media:" + "%.2f", notaMed);
            System.out.println("");
            notaMed = 0;
            notaMax = 0;
            notaMin = 0;

        }

    }
}
