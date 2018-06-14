package com.el.onboarding.junit.romanNumerals.services;

import java.util.TreeMap;

public class HinduToRomanNumeralConverter {

	//ones
	//tens
	//hundreds
	//thousands
	//public final int[] NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // array containing all of the values
	//public final String[] NUMBER_LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // array containing all of the numerals
	
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

//    public final static String toRoman(int number) {
//        int l =  map.floorKey(number);
//        if ( number == l ) {
//            return map.get(number);
//        }
//        return map.get(l) + toRoman(number-l);
//    }

	public final static String convert(int input) {
        int l =  map.floorKey(input);
        if ( input == l ) {
            return map.get(input);
        }
        return map.get(l) + convert(input-l);
	}

}

