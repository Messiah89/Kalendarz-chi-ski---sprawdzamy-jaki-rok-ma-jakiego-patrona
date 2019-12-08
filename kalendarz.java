import java.util.Scanner;

public class kalendarz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wpisz rok: ");
        int rok = input.nextInt();

        switch (rok % 12) {
            case 0:
                System.out.println("Małpy");
                break;
            case 1:
                System.out.println("Koguta");
                break;
            case 2:
                System.out.println("Psa");
                break;
            case 3:
                System.out.println("Świni");
                break;
            case 4:
                System.out.println("Szczóra");
                break;
            case 5:
                System.out.println("Bawoła");
                break;
            case 6:
                System.out.println("Tygrysa");
                break;
            case 7:
                System.out.println("Zająca");
                break;
            case 8:
                System.out.println("Smoka");
                break;
            case 9:
                System.out.println("Węża");
                break;
            case 10:
                System.out.println("Konia");
                break;
            case 11:
                System.out.println("Owcy");
                break;
        }
    }
}