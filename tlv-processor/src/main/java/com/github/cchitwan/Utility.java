package com.github.cchitwan;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
public class Utility {

    public static int convertValue(String s){
        return Integer.parseInt(s.split(IHandler.FORMATTER)[1]);
    }

}
