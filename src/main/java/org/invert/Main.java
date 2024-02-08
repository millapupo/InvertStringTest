package org.invert;

public class Main {
    public static void main(String[] args) {
        String original = "Testanto inverter strings";

        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
    public static String inverterString(String str) {
        StringBuilder invertida = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }
        return invertida.toString();
    }
}
