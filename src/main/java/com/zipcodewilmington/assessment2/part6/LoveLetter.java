package com.zipcodewilmington.assessment2.part6;

//import static oracle.jrockit.jfr.events.Bits.charValue;

public class LoveLetter {

    LoveLetter() {

    }

    public Integer[] mystery(String[] letters) {
        Integer[] palandromic = new Integer[letters.length];
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            int counter = 0;
            for (int j = 0; j < letter.length()/2; j++) {
                counter += Math.abs(letter.charAt(j) - letter.charAt(letter.length()-1-j));
            }
            palandromic[i] = counter;
        }
        return palandromic;
    }
}
