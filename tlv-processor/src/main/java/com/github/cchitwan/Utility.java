package com.github.cchitwan;

import com.github.cchitwan.impl.ReplaceHandler;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
public class Utility {

    public static int convertValue(String s){
        return Integer.parseInt(s.split(IHandler.FORMATTER)[1]);
    }


    public static void main(String[] args) {
        final ReplaceHandler replaceProcessor = new ReplaceHandler();
        final Type type = replaceProcessor.matcher("UPPRCSA-0003-DSJHIE");
        System.out.println(type);
    }

}
