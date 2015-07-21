package com.springapp.mvc.cleanCode;

import java.util.Iterator;

/**
 * Created by yjhan on 15. 7. 2..
 */
public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}
