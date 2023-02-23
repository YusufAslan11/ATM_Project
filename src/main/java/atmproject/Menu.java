package atmproject;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);


    public static void start() {
        String select = " ";
        do {
            System.out.println("----- WELCOME TO XXXBANK----");
            System.out.println("----------------------------");

            System.out.println("-------M E N U-------");
            System.out.println(" 1 - Create User Name and Password");
            System.out.println(" 2 - Create an Account");
            System.out.println(" 3 - Entry to System");
            System.out.println(" 4 - Deposit to Account");
            System.out.println(" 5 - Withdraw from Account");
            System.out.println(" 6 - Change Password ");
            System.out.println(" 7 - Exıt ");

            System.out.print(" Your choice......:  ");
            try {
                select = input.next().toUpperCase().substring(0, 1);
            } catch (InputMismatchException e) {
                System.out.println("Please enter only numeric values");
            }
            switch (select) {
                case "1":
                    Methods methods=new Methods();
                    methods.createPassword();

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;

                default:
                    System.out.println("Incorrect entry!!!");


            }


        } while (!select.equals("7"));

    }


}
