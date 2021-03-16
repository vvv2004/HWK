package Krasi.Homework.HWK;

import java.util.HashMap;

public class Dictionaries {
    public static void main(String[] args) {
        HashMap<Integer, String> months = new HashMap<Integer, String>();

        defineMonths(months);

        System.out.println(months);
    }

    private static void defineMonths(HashMap<Integer, String> months) {
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

}
