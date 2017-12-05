package com.github.cchitwan.impl;

import com.github.cchitwan.IHandler;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
public class UnknownHandler extends IHandler {

    private String VALUE = "Type not valid";
    public String process(final String input, final int length) {
        return VALUE;
    }
}
