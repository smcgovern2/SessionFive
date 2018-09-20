package smcgovern2.numwrappers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        System.out.println("enter a number");
        String toParse = input.readLine();
        try {
            Byte.parseByte(toParse);
            System.out.println("BYTE");
        } catch (Exception e) {
            try {
                Short.parseShort(toParse);
                System.out.println("SHORT");
            } catch (Exception e1) {
                try {
                    Integer.parseInt(toParse);
                    System.out.println("INTEGER");
                } catch (Exception e2) {
                    try {
                        Long.parseLong(toParse);
                        System.out.println("LONG");
                    } catch (Exception e3) {
                        try {
                            Float.parseFloat(toParse);
                            System.out.println("FLOAT");
                        } catch (Exception e4) {
                            try {
                                Double.parseDouble(toParse);
                                System.out.println("DOUBLE");
                            } catch (Exception e5){
                                System.out.println("INVALID ENTRY");
                            }
                        }
                    }
                }
            }
        }
    }
}
