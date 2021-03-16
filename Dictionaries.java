package Krasi.Homework.HWK;

import java.util.Hashtable;
import java.util.Scanner;

public class Dictionaries {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Hashtable<Integer, String> months_digitKeys = new Hashtable<>();
        Hashtable<String, Integer> months_stringKeys = new Hashtable<>();
        fillMonths(months_digitKeys, months_stringKeys);

        System.out.println("---------------------------------");
        String command = "";

        while(!command.equals("stop")){

            System.out.print("Input command: ");
            command = read.next();
            System.out.println("---------------------------------");

            /*if(command.equals("num")){
                int n = read.nextInt();

                searchByNum(n, months_digitKeys);
            }else if(command.equals("name")){
                String name = read.nextLine();

                searchByName(name, months_stringKeys);
            }*/

            switch (command){
                case "num":
                    int n = read.nextInt();
                    searchByNum(n, months_digitKeys);

                    break;

                case "name":
                    System.out.print("Input the month /USE FIRST CAPITAL LETTER!/ : ");
                    String name = read.next();
                    searchByName(name, months_stringKeys);

                    break;

                case "stop": break;

                default:
                    System.out.println("Wrong input");

            }
        }
    }

    private static void fillMonths(Hashtable<Integer, String> months_n, Hashtable<String, Integer> months_d) {
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

    public static void searchByName(String name, Hashtable<String, Integer> months) {
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

    public static void searchByNum(int num, Hashtable<Integer, String> months){
        String current = months.get(num);

        System.out.printf("The %d month is %s" , num, current);
        System.out.println();
    }
}
