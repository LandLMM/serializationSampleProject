package pl.sdacademy;

import java.io.Serializable;

public class SerializationSampleObject implements Serializable{



    private String value;
    private transient String transientStringValue;
    private int intValue;
    private transient int transientIntValue;


    public SerializationSampleObject() {
        System.out.println("Object created");
    }

    {
        System.out.println("Object initialized");

    }

    public String getValue() {
        return value;
    }

    public String getTransientStringValue() {
        return transientStringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public int getTransientIntValue() {
        return transientIntValue;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setTransientStringValue(String transientStringValue) {
        this.transientStringValue = transientStringValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setTransientIntValue(int transientIntValue) {
        this.transientIntValue = transientIntValue;
    }

    @Override
    public String toString() {
        return "SerializationSampleObject{" +
                "value='" + value + '\'' +
                ", transientStringValue='" + transientStringValue + '\'' +
                ", intValue=" + intValue +
                ", transientIntValue=" + transientIntValue +
                '}';
    }




}
