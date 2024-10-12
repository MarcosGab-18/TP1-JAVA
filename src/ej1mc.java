import java.util.Scanner;
public class ej1mc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = 0;

        while (true) {
            System.out.print("Ingrese la dimensión de la matriz (número impar entre 3 y 15): ");
            try {
                dimension = Integer.parseInt(scanner.nextLine());

                if (dimension >= 3 && dimension <= 15 && dimension % 2 != 0) {
                    break;
                } else {
                    System.out.println("Error: Debe ser un número impar entre 3 y 15. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número.");
            }
        }
        System.out.println("La dimensión válida de la matriz es: " + dimension);
        scanner.close();
    }
}