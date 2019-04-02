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

        String month = br.readLine();

        Season season = null;

        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                // System.out.println(month + " belongs to " + season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("This month doesn't exist");
        }

        if (season != null) {
            System.out.println(month + " belongs to " + season);
        }
    }
}
