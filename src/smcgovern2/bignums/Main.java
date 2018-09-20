package smcgovern2.bignums;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger wiscPop = new BigInteger("5726398");
        BigInteger calPop = new BigInteger("38041430");
        BigInteger texPop = new BigInteger("26059203");
        BigInteger copyPrice = new BigInteger("323");
        BigInteger total = wiscPop;
        System.out.println("Wisconsin population : " + total.toString());
        total = total.multiply(calPop);
        System.out.println("Letters to California : " + total.toString());
        total = total.multiply(texPop);
        System.out.println("Copies to Texas : " + total.toString());
        total = total.multiply(copyPrice);
        System.out.printf("Price of copies : $%s.%s \n", total.toString().substring(0, total.toString().length() - 2 ), total.toString().substring(total.toString().length() - 2));

    }
}
