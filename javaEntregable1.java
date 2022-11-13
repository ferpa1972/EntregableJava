import java.util.Scanner;

public class javaEntregable1 {
    public static void main(String[] args){
        String nombre;
        String apellido;
        int edad;

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        System.out.println("Escriba su apellido");
        apellido = ingreso.nextLine();
        System.out.println("ingrese su edad");
        edad = ingreso.nextInt();
        if(edad >= 18){
            System.out.println(nombre +" "+apellido+ " usted es mayor de edad, por lo tanto, puede entrar a la fiesta");
        }else{
            System.out.println(nombre +" "+apellido+ " usted es menor de edad, por lo tanto,no puede entrar a la fiesta. Devuelvase a su casa");
        }
       
    }   
}
