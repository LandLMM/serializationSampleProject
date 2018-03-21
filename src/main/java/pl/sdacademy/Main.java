package pl.sdacademy;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // tworzenie obiektu
        SerializationSampleObject mauallyCreatedObject = new SerializationSampleObject();
        mauallyCreatedObject.setTransientStringValue("Pawel");
        mauallyCreatedObject.setTransientStringValue("Pluta");
        mauallyCreatedObject.setIntValue(1990);
        mauallyCreatedObject.setTransientIntValue(12345678);
        System.out.println(mauallyCreatedObject);

        //serializowanie obiektu
        OutputStream outputStream = new FileOutputStream("SerializedSampleObject.ser");
        ObjectOutputStream objectSerializer = new ObjectOutputStream(outputStream);
        objectSerializer.writeObject(mauallyCreatedObject);
        outputStream.close();
        System.out.println("Object has been serialized");

        //deserializowanie obiektu
        System.out.println("About to read the object from file");
        InputStream inputStream = new FileInputStream("SerializedSampleObject.ser");
        ObjectInputStream objectDeserializer = new ObjectInputStream(inputStream);
        Object deserializedObject = objectDeserializer.readObject();
        System.out.println("Object has been deserialized");
        System.out.println(deserializedObject);
    }

}