package com.springapp.mvc.cleanCode;

import java.util.Iterator;
import java.util.NoSuchElementException;
import static com.springapp.mvc.cleanCode.ErrorCode.*;

/**
 * Created by yjhan on 15. 7. 2..
 */
public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private String[] stringArray;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            stringArray = parameter.split(",");

        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public static String[] getValue(ArgumentMarshaler am) {
        if(am != null && am instanceof StringArrayArgumentMarshaler)
            return ((StringArrayArgumentMarshaler) am).stringArray;
        else
            return null;
    }
}
