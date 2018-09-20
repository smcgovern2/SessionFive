package smcgovern2.enums;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader input = new BufferedReader(isr);

        System.out.println("What is your favorite nfc team?");

        String sub = input.readLine().substring(0,3).toUpperCase();

        System.out.println(sub);
        
        try{

            boolean found = false;
            for (NFCCities city : NFCCities.values()) {
                if(city.name().equals(sub)){
                    System.out.println(city.getText());
                    found = true;
                }
            }

            if(!found){
                throw new IOException();
            }
        } catch (Exception e){
            try{
                boolean found = false;
                for (NFCTeams team : NFCTeams.values()) {
                    if(team.name().equals(sub)){
                        System.out.println(team.getText());
                        found = true;
                    }
                }
                if (!found) {
                    throw new IOException();
                }
            } catch (Exception e1){
                System.out.println("Unrecognized team");
            }

        }



    }
}
