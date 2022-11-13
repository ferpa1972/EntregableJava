import java.util.Scanner;

public class javaEntregable2 {
    public static void main(String[] args){
        String nombre;
        String apellido;
        int opcion;
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("**********Video Club************");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Ingrese su nombre");        
        nombre = ingreso.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = ingreso.nextLine();
        System.out.println("Bienvendo "+ nombre+" "+ apellido) ;
        System.out.println("Que tipo de peliculas te podemos ofrecer");
        System.out.println("1. Accion");
        System.out.println("2. Comedia");
        System.out.println("3. Infantiles");
        opcion = ingreso.nextInt();
        if (opcion == 1){
            System.out.println("Accion");
            System.out.println("1. Samaritan");
            System.out.println("2. Tren Bala");
            System.out.println("3. Top Gun");
            opcion = ingreso.nextInt();
            if( opcion == 1){
                System.out.println("Eligio Samaritan, que la disfrute");
            }else if (opcion == 2){
                System.out.println("Eligio Tren Bala, que la disfrute");
            }else if(opcion == 3){
                System.out.println("Eligio Top Gun, que la disfrute");
            }
        }else if(opcion == 2){
            System.out.println("Comedia");
            System.out.println("1. Casate conmigo");
            System.out.println("2. La ciudad perdida");
            System.out.println("3. Una rubia muy legal 3");
            opcion = ingreso.nextInt();
            if( opcion == 1){
                System.out.println("Eligio Casate conmigo, que la disfrute");
            }else if (opcion == 2){
                System.out.println("Eligio la Ciudad perdida, que la disfrute");
            }else if(opcion == 3){
                System.out.println("Eligio Una rubia muy legal 3, que la disfrute");
            }
        }else if(opcion == 3){
            System.out.println("Infantiles");
            System.out.println("1. Pinocho");
            System.out.println("2. Minions");
            System.out.println("3. Hotel Transilvania");
            opcion = ingreso.nextInt();
            if( opcion == 1){
                System.out.println("Eligio Pinocho, que la disfrute");
            }else if (opcion == 2){
                System.out.println("Eligio Minions, que la disfrute");
            }else if(opcion == 3){
                System.out.println("Eligio Hotel Transilvania, que la disfrute");
            }
            System.out.println("Gracias por preferirnos "+nombre);
        }
    }
}
