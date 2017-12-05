package com.github.cchitwan.impl;

import com.github.cchitwan.IHandler;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
public class UpperCaseHandler extends IHandler {


    public String process(final String input, final int length) {
        assert input.trim().length() > length;
        final String[] split = input.split(FORMATTER);
        split[2] = split[2].substring(0,length).toUpperCase();
        return split[0] + FORMATTER+split[2];

    }
}
