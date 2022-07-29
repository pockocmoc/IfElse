import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца(от 1 до 12): ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();


        String  season;

        if (month == 12 || month == 1 || month == 2)
            season = "зиме";

        else if (month == 3 || month == 4 || month == 5)
            season = "весне";

        else if (month == 6 || month == 7 || month == 8)
            season = "лету";

        else if (month == 9 || month == 10 || month == 11)
            season = "осени";

        else
            season = "вымышленным месяцам";

        System.out.println("Этот месяц относиться к: " + season + ".");
    }
}
