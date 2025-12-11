// package com.defaults;

public class DefaultValues {

    // Instance variables → JVM assigns default values
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;

    float defaultFloat;
    double defaultDouble;

    char defaultChar;       // shows empty output because default is '\u0000'
    boolean defaultBoolean;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();

        System.out.println("Default byte value: " + obj.defaultByte);
        System.out.println("Default short value: " + obj.defaultShort);
        System.out.println("Default int value: " + obj.defaultInt);
        System.out.println("Default long value: " + obj.defaultLong);

        System.out.println("Default float value: " + obj.defaultFloat);
        System.out.println("Default double value: " + obj.defaultDouble);

        System.out.println("Default char value: '" + obj.defaultChar + "'");
        System.out.println("Default boolean value: " + obj.defaultBoolean);
    }
}
