package Krasi.Homework.HWK;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Dictionaries {

    //MAIN
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);



        HashMap<Integer, String> months_digitKeys = new HashMap<>();
        HashMap<String, Integer> months_stringKeys = new HashMap<>();
        fillMonths(months_digitKeys, months_stringKeys);

        System.out.println("---------------------------------");
        String command = "";




        //Код, който изпълнява команди <num - Търсене по номер; name - Търсее по име; stop - Слага край на програмата;>
        while(!command.equals("stop")){


            System.out.print("Input command: ");
            command = read.next();
            System.out.println("---------------------------------");

            //Switch-case, който следи коя команда е въведена от потребителя
            switch (command){

                //Търсене по номер
                case "num":
                    System.out.print("Input the number of the month /BETWEEN 1 AND 12/ : ");
                    int n = read.nextInt();

                    //Ако номера на месеца е съществуващ
                    if(n > 1 && n < 12) {
                        searchByNum(n, months_digitKeys); // Метод, който намира и принтира месеца
                    }else{ // Ако номера на месеца не съществува
                        System.out.println("There is no month answering your input!");
                        System.out.println("--------------------------------------------");
                        System.out.println("!HINT! | Try putting number between 1 and 12 | !HINT!");
                        System.out.println("--------------------------------------------");
                    }
                    break;

                //Търсене по име
                case "name":
                    System.out.print("Input the month /USE FIRST CAPITAL LETTER!/ : ");
                    String name = read.next();
                    searchByName(name, months_stringKeys); //Метод, който намира и принтира месеца

                    break;

                case "stop": break;


                //Ако командата не съществува
                default:
                    System.out.println("Wrong input");

            }
        }
    }
    //END OF MAIN


    //ЗАПЪЛВАНЕ НА МЕСЕЦИ В РЕЧНИЦИТЕ
    private static void fillMonths(HashMap<Integer, String> months_n, HashMap<String, Integer> months_d) {
        months_n.put(1, "January");
        months_n.put(2, "February");
        months_n.put(3, "March");
        months_n.put(4, "April");
        months_n.put(5, "May");
        months_n.put(6, "June");
        months_n.put(7, "July");
        months_n.put(8, "August");
        months_n.put(9, "September");
        months_n.put(10, "October");
        months_n.put(11, "November");
        months_n.put(12, "December");

        //==================================================================================

        months_d.put("January", 1);
        months_d.put("February", 2);
        months_d.put("March", 3);
        months_d.put("April", 4);
        months_d.put("May", 5);
        months_d.put("June", 6);
        months_d.put("July", 7);
        months_d.put("August", 8);
        months_d.put("September", 9);
        months_d.put("October", 10);
        months_d.put("November", 11);
        months_d.put("December", 12);
    }


    //ТЪРСЕНЕ ПО ИМЕ
    public static void searchByName(String name, HashMap<String, Integer> months) {
        try {
            int current = months.get(name);

            System.out.println("---------------------------------");
            System.out.printf("%s is the %d month", name, current);
            System.out.println();
            System.out.println("---------------------------------");
        }catch (Exception e){
            System.out.println("Wrong name input!");
            System.out.println("--------------------------------------------");
            System.out.println("!HINT! | Try using capital letter | !HINT!");
            System.out.println("--------------------------------------------");
        }
    }


    //ТЪРСЕНЕ ПО НОМЕР
    public static void searchByNum(int num, HashMap<Integer, String> months) {

        String current = months.get(num);

        System.out.println("--------------------------------------------");
        System.out.printf("The %d month is %s", num, current);
        System.out.println();
        System.out.println("--------------------------------------------");


    }
}