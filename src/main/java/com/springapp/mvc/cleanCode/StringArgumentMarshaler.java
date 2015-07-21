package com.springapp.mvc.cleanCode;

import java.util.Iterator;
import java.util.NoSuchElementException;
import static com.springapp.mvc.cleanCode.ErrorCode.*;

/**
 * Created by yjhan on 15. 7. 2..
 */
public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public static String getValue(ArgumentMarshaler am) {
        if(am != null && am instanceof StringArgumentMarshaler)
            return ((StringArgumentMarshaler) am).stringValue;
        else
            return "";
    }
}
