package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota del examen (0-10): ");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida. Debe estar entre 0 y 10.");
        } else switch (nota) {
            case 10:
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 8:
            case 7:
                System.out.println("Notable");
                break;
            case 6:
            case 5:
                System.out.println("Bien");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            default:
        }
    }

                scanner.close();
        }
 }
