package com.github.cchitwan.impl;

import com.github.cchitwan.IHandler;
import com.github.cchitwan.Type;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
public class ReplaceHandler extends IHandler {

    final private String VALUE = "THIS STRING";
    final private String KEY = Type.REPLCE.name();

    public String process(final String input, final int length) {
        return KEY + FORMATTER + VALUE;
    }
}
