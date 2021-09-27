package br.com.giovane.java14.nullpointer;

public class NullPointer {

    public static void main(String[] args) {
        String word = null;
        System.out.println(word.equals("SSS"));
    }

}

// Improve the usability of NullPointerExceptions generated
// by the JVM by describing precisely which variable was null.
