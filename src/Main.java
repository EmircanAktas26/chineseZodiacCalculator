import java.util.Scanner;

/*
*@Author Emircan Aktaş - 23.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birthYear,calculator;

        System.out.print("Enter your year of birth :");
        birthYear = inp.nextInt();

        if(birthYear % 12 == 0){
            System.out.println("Your chinese zodiac sign : Monkey");
        }else if (birthYear % 12 == 1){
            System.out.println("Your chinese zodiac sign : Cockerel");
        }else if (birthYear % 12 == 2){
            System.out.println("Your chinese zodiac sign : Dog");
        }else if (birthYear % 12 == 3){
            System.out.println("Your chinese zodiac sign : Pig");
        }else if (birthYear % 12 == 4){
            System.out.println("Your chinese zodiac sign : Mouse");
        }else if (birthYear % 12 == 5){
            System.out.println("Your chinese zodiac sign : Ox");
        }else if (birthYear % 12 == 6){
            System.out.println("Your chinese zodiac sign : Tiger");
        }else if (birthYear % 12 == 7){
            System.out.println("Your chinese zodiac sign : Rabbit");
        }else if (birthYear % 12 == 8){
            System.out.println("Your chinese zodiac sign : Dragon");
        }else if (birthYear % 12 == 9){
            System.out.println("Your chinese zodiac sign : Snake");
        }else if (birthYear % 12 == 10){
            System.out.println("Your chinese zodiac sign : Horse");
        }else if (birthYear % 12 == 11){
            System.out.println("Your chinese zodiac sign : Sheep");
        }

    }
}