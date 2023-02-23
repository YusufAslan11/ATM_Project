package atmproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Bank>bankInformation=new ArrayList<>();


    public void createPassword(){

        System.out.print("Please create username...");
        String userName = scan.next().trim().toUpperCase();  //Kullanıcı adı alındı

        String nameOfUsernameSys=userName; //Kullanıcı adı sisteme aktarıldı

        System.out.print("Please create a password..."); //şifre oluşturma istendi
        String yourPassword = scan.next();              //Oluşturulan şifre yourPassword e aktarıldı


        if (yourPassword.length() < 8) {
            System.out.println("Your password must be at least 8 character ");
        } else if (yourPassword.contains(" ")) {
            System.out.println("Your password has not contain 'space' ");
        } else if (yourPassword.replaceAll("[^A-Z]", "").length() < 1) {
            System.out.println("Your password must contain at least uppercase 1 character ");
        } else if (yourPassword.replaceAll("[^a-z]", "").length() < 1) {
            System.out.println("Your password must contain at least lower case 1 character ");
        } else if (yourPassword.replaceAll("[a-zA-Z0-9]", "").length() < 1) {
            System.out.println("Your password must contain at least symbol 1 character");
        } else if (yourPassword.replaceAll("[^0-9]", "").length() < 1) {
            System.out.println("Your password must contain at least number 1 character");
        } else {
            System.out.println("Your User Name and password created successful");}

        String passwordSys = yourPassword;  //Oluşturulan şifre sisteme aktarıldı

    }
    public void createAccount(){
        String accountNUmber=null;
        String cardNo=null;

        System.out.println("Please enter your name");
        String name= scan.nextLine();

        System.out.println("Please enter your last name");
        String lastName= scan.nextLine();

        System.out.println("Please enter your identity");
        String identity= scan.nextLine();

        Bank bank=new Bank(name,lastName,identity,accountNUmber,cardNo);






    }
    public void entry(){
        //Oluşturduğun şifre ile sisteme giriş
    }
    public void sendMoney(){
        //Hesaptan para çek

    }
    public void widthDrawMoney(){
        //Hesaba para gönder
    }


}
