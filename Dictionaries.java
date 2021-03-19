package Krasi.Homework.HWK;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Dictionaries {

    //MAIN
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);



        HashMap<Integer, String> months = new HashMap<>();
        fillMonths(months);

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

                        searchByNum(n, months); // Метод, който намира и принтира месеца

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
                    searchByName(name, months); //Метод, който намира и принтира месеца

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
    private static void fillMonths(HashMap<Integer, String> months) {

        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

    }


    //ТЪРСЕНЕ ПО ИМЕ
    public static void searchByName(String name, HashMap<Integer, String> months) {
        try {
            int current = getKeyFromValue(name, months);

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

    public static int getKeyFromValue(String input, HashMap<Integer, String> months){
        int value = 0;

        for (int i = 1; i <= months.size(); i++) {
            if(months.get(i).equals(input)){
                value = i;
            }
        }


        return value;
    }
}