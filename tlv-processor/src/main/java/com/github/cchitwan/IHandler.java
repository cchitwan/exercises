package com.github.cchitwan;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
public abstract class IHandler {

    public static String FORMATTER = "-";

    protected abstract String process(String input, int length);

    public static Type matcher(String input){
        Type type = Type.NONE;
        try {
            type = Type.valueOf(input.split(FORMATTER, 3)[0]);
        }catch (IllegalArgumentException e){

        }
        return type;
    }
}
