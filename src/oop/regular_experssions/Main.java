package oop.regular_experssions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFounder = matcher.find();

        if (matchFounder){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }
    }
}
