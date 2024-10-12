import java.util.Scanner;
public class tp1ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correcta = "Contraseña";
        int n = 0;

        while (n != 3) {
            System.out.println("Ingrese la contraseña: ");
            String contra = sc.nextLine();
            if (contra.equals (correcta)) {
                System.out.println("Ingreso con exito");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                n++;
            }
        }
    }
}
