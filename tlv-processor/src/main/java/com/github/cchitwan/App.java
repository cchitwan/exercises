package com.github.cchitwan;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author chanchal.chitwan on 06/12/17.
 */
public class App {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        final TLVProcessor tlvProcessor = new TLVProcessor(in);
        tlvProcessor.start();
    }
}
