package UF02Programacion;
import java.util.Scanner;
// Importo que pueda utilizar scanner, ya que no es una clase fundamental.
public class Operaciones {
    public static void main(String[] args){
        System.out.println("Bienvenido al calculador de operaciones!!");
        Operaciones objeto = new Operaciones();
        //Para llamar a los métodos que quiera crear, antes, necesito tener un objeto de la clase
        double[] datos = objeto.leerDatos();
        //Como leerDatos devuelve un array de int,
    }
    public double[] leerDatos() {
        // Se define un método público llamado 'leerDatos' que devuelve un array de double (double[]).
        // Este método no recibe parámetros.
        Scanner scanner = new Scanner(System.in);
        // Se crea un objeto 'Scanner' para leer datos desde la entrada estándar (normalmente el teclado).
        System.out.println("Por favor, introduce el primer número:");
        // Se solicita al usuario que introduzca el primer numero
        double primero = scanner.nextDouble();
        // Se lee el valor introducido por el usuario y se guarda en la variable 'primero'.
        System.out.println("Por favor, introduce el segundo número:");
        // Se solicita al usuario que introduzca el segundo número
        double segundo = scanner.nextDouble();
        // Se lee el valor introducido por el usuario y se guarda en la variable 'segundo'.
        scanner.close();

        return new double[]{primero, segundo};
         /* Se devuelve un array de enteros que contiene los valores de 'primer' y 'segundo'.
            El new en la línea return new,
            se utiliza porque estás creando una nueva instancia de un array de enteros en ese mismo momento*/
    }
    public void Suma(double[]datos){
        double numero1 = datos[0]; // El primer número del array
        double numero2 = datos[1]; // El segundo número del array
        double ResultadoSuma= numero1 + numero2;
    }
    public void Resta(double[]datos){



    }

}
