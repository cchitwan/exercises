package com.github.cchitwan;

import lombok.AllArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
@AllArgsConstructor
public class TLVProcessor {

    private InputStreamReader inputStreamReader;

    public void start() throws IOException {
        BufferedReader br = new BufferedReader(inputStreamReader);
        String line;
        while ((line = br.readLine())!=null && !line.isEmpty()){
            String input = line;
            while(!input.isEmpty()) {
                final String result = ProcessorFactory.processInput(input);
                System.out.println(result);
                input = input.split(IHandler.FORMATTER, 3)[2].substring(Utility.convertValue(input));
            }
            line = null;
        }
    }

}
