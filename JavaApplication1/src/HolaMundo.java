
import java.util.Scanner;


//Mi clase en Java
public class HolaMundo {
    public static void main(String args[]){

        System.out.println("Hola Mundo");
        String nombre;
        int id;
        Float precio;
        String envio;
        var consola = new Scanner(System.in);
        
        System.out.println("Proporciona el Nombre: ");
        nombre = consola.nextLine();
        System.out.println("Proporciona el ID: ");
        id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el Precio: ");
        precio = Float.parseFloat(consola.nextLine());
        System.out.println("Proporciona el Envio Gratuito(S/N): ");
        envio = consola.nextLine();
        
        }
    }
