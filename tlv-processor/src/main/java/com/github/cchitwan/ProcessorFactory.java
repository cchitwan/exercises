package com.github.cchitwan;


import com.github.cchitwan.impl.ReplaceHandler;
import com.github.cchitwan.impl.UnknownHandler;
import com.github.cchitwan.impl.UpperCaseHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chanchal.chitwan on 05/12/17.
 */
public class ProcessorFactory{

    private static Map<Type, IHandler> map = new HashMap<Type, IHandler>();
    static {
            map.put(Type.NONE, new UnknownHandler());
            map.put(Type.REPLCE, new ReplaceHandler());
            map.put(Type.UPPRCS, new UpperCaseHandler());
    }
    private static IHandler getProcessor(Type type){
        return map.get(type);
    }

    public static String processInput(String input){

        return getProcessor(IHandler.matcher(input)).process(input, Utility.convertValue(input));
    }

}
