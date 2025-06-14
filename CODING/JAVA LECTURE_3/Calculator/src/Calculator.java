import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : SUM");
        System.out.println("2 : SUB");
        System.out.println("3 : MUL");
        System.out.println("4 : DIV");
        System.out.println("5 : MOD");

        System.out.println("ENTER YOUR CHOICE : ");
        float choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter Num1 : ");
            float num1 = sc.nextFloat();
            System.out.println("Enter Num2 : ");
            float num2 = sc.nextFloat();

            float sum = num1 + num2;
            System.out.println(sum);
        } else if (choice == 2) {
            System.out.println("Enter Num1 : ");
            float num1 = sc.nextFloat();
            System.out.println("Enter Num2 : ");
            float num2 = sc.nextFloat();

            float sub = num1 - num2;
            System.out.println(sub);
        } else if (choice == 3) {
            System.out.println("Enter Num1 : ");
            float num1 = sc.nextFloat();
            System.out.println("Enter Num2 : ");
            float num2 = sc.nextFloat();

            float mul = num1 * num2;
            System.out.println(mul);
        } else if (choice == 4) {
            System.out.println("Enter Num1 : ");
            float num1 = sc.nextFloat();
            System.out.println("Enter Num2 : ");
            float num2 = sc.nextFloat();

            float div = num1 / num2;
            System.out.println(div);
        } else if (choice == 5) {
            System.out.println("Enter Num1 : ");
            float num1 = sc.nextFloat();
            System.out.println("Enter Num2 : ");
            float num2 = sc.nextFloat();

            float mod = num1 % num2;
            System.out.println(mod);
        } else {
            System.out.println("Invalid Input");
        }

        // switch (choice) {
        //     case value:

        //         break;

        //     default:
        //         break;
        // }

    }
}
