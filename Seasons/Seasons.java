package Seasons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Seasons {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter a month to find out its season");

        String month = br.readLine().substring(0, 3);
        //note: String month = br.readLine().substring(0, 3); && case "Apr" -- values like "Apra123 *#" will be accepted as "Apr"
        //note: may add .toUpperCase() && case "APR" -- values like "aPra" -- will be accepted as "APR"

        Season season;

        switch (month) {
            case "Dec":
            case "Jan":
            case "Feb":
                season = Season.WINTER;
                System.out.println(month + " belongs to " + season);
                break;
            case "Mar":
            case "Apr":
            case "May":
                season = Season.SPRING;
                System.out.println(month + " belongs to " + season);
                break;
            case "Jun":
            case "Jul":
            case "Aug":
                season = Season.SUMMER;
                System.out.println(month + " belongs to " + season);
                break;
            case "Sep":
            case "Oct":
            case "Nov":
                season = Season.AUTUMN;
                System.out.println(month + " belongs to " + season);
                break;
            default:
                // ?? System.out.println(month + " belongs to " + String.valueOf(Season season));
                System.out.println("This month doesn't exist");
        }
    }
}
