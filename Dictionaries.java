package Krasi.Homework.HWK;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionaries {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        HashMap<Integer, String> months = new HashMap<Integer, String>();
        fillMonths(months);

        System.out.print("Input command: ");
        String command = "";

        while(!command.equals("stop")){

            command = read.nextLine();

            if(command.equals("num")){
                int n = read.nextInt();

                searchByNum(n, months);
            }else if(command.equals("name")){
                //search by name
            }
        }
    }

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

    public static String searchByName(String name, HashMap<Integer, String> months){


        return "";
    }

    public static int searchByNum(int num, HashMap<Integer, String> months){
        String current = months.get(num);

        System.out.printf("The %d month is %s" , num, current);

        return 0;
    }
}
