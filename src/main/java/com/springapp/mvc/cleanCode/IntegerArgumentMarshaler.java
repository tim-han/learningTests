package com.springapp.mvc.cleanCode;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.springapp.mvc.cleanCode.ErrorCode.INVALID_INTEGER;
import static com.springapp.mvc.cleanCode.ErrorCode.MISSING_INTEGER;

/**
 * Created by yjhan on 15. 7. 2..
 */
public class IntegerArgumentMarshaler implements ArgumentMarshaler {
    private Integer intValue = 0;


    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            intValue = Integer.parseInt(parameter);
        } catch(NoSuchElementException e) {
            throw new ArgsException(MISSING_INTEGER);
        } catch(NumberFormatException e) {
            throw new ArgsException(INVALID_INTEGER, parameter);
        }
    }

    public static int getValue(ArgumentMarshaler am) {
        if(am != null && am instanceof IntegerArgumentMarshaler)
            return ((IntegerArgumentMarshaler) am).intValue;
        else
            return 0;
    }
}
