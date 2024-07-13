import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selamlar Bu bir Hesap Makinesi dir");

        //accessor ReturnType fnName (prms)

        Scanner myScannerObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("1 inci Sayıyı giriniz");

        int number1 = myScannerObj.nextInt();  // Read user input
        System.out.println("1 inci Sayı : " + number1);  // Output user input

        System.out.println("2 inci Sayıyı giriniz");
        int number2 = myScannerObj.nextInt();  // Read user input
        System.out.println("2 inci Sayı: " + number2);  // Output user input

        System.out.println("işlem giriniz; ");
        String islem = myScannerObj.next();
        switch (islem){
            case "topla":
                System.out.println("sonuç : " + (number1 + number2));
                break;
            case "çıkart":
                System.out.println("sonuç : " + (number1 - number2));
                break;
            case "çarp":
                System.out.println("sonuç : " + (number1 * number2));
                break;
            case "böl":
                System.out.println("sonuç : " + (number1 / number2));
                break;
            default:
                System.out.println("böyle bir işlem yoktur");
        }
    }
}