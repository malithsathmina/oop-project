package OOpProgect;


import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main implements Serializable {
    //create a method to save the list of users uesing Serialization
    public static void serializeData(ArrayList<UserProfile> myArray) {
        try (ObjectOutputStream myFile = new ObjectOutputStream(new FileOutputStream("data_file.ser"))) {
            myFile.writeObject(myArray);
            System.out.println("Serialization successful. User object saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //create a method to get the list of users from file
    public static ArrayList<UserProfile> deserializeData() {
        try (ObjectInputStream serializeFile = new ObjectInputStream(new FileInputStream("data_file.ser"))) {
            Object temp = serializeFile.readObject();
            if (temp != null && temp instanceof ArrayList<?>) {
                return (ArrayList<UserProfile>) temp;
            } else {
                System.out.println("Deserialization failed. Unexpected object type.");
            }
        } catch (FileNotFoundException ignored) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}

