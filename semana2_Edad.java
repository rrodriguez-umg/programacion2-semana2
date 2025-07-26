import java.util.Scanner;

public class semana2_Edad {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);

        System.out.println("HOLA,CUAL ES TU NOMBRE:");
        String NOMBRE =scanner.nextLine();

        System.out.println("CUAL ES TU AÑO DE NACIMIENTO:");
        int EDAD =scanner.nextInt();
        int total=2025;
        int aproximado=EDAD- total;

        System.out.println("Hola " +NOMBRE + " tu edad aproximada es de" + aproximado + "años");

        scanner.close();
    }
}
