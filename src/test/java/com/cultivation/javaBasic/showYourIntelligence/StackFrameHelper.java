package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement[] stack = new Throwable().getStackTrace();
        String result = (stack[1].getClassName()+"."+stack[1].getMethodName());
        return result;
        // --end-->
    }
}
