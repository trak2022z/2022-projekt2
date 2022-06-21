import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int liczba;

        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj dodatnią liczbę: ");
        liczba = klaw.nextInt();

        if (liczba < 0) {
            System.out.println("Musisz podać dodatnią liczbę.");
        } else {

            System.out.print("Liczba binarnie to: ");
          int x;

        if (liczba <= 1) {
            System.out.print(liczba);
            return;
        }

        x = liczba % 2;
        printBinaryform(liczba >> 1);
        System.out.print(x);
        }
    }

    private static void printBinaryform(int liczba) {
        int x;

        if (liczba <= 1) {
            System.out.print(liczba);
            return;
        }

        x = liczba % 2;
        printBinaryform(liczba >> 1);
        System.out.print(x);
    }
}