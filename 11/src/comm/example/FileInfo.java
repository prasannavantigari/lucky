package comm.example;

import java.io.File;
import java.io.IOException;
public class FileInfo {

	public static void main(String[] args) {

        // The first command line argument needs to be provided
        if (args.length < 1){
            System.out.println("Provide dummyname as command line argument");
            return;
        }

        String FileInfo = args[0];
        File fn = new File(FileInfo);
        try {
            fn.createNewFile();
        } catch (IOException e) {

        }
        System.out.println("Name: " + fn.getName());

        // Check if the file exists using exists() method
        if (fn.exists()) {
            System.out.println(FileInfo + " does exist.");
        }

        if (fn.canRead()) {
            System.out.println(FileInfo  + " is readable.");
        }

        System.out.println(FileInfo + " is " + fn.length() + " bytes long.");
        System.out.println(FileInfo + " is last modifed at " +
                new java.util.Date(fn.lastModified())) ;

        if (fn.canWrite()) {
            System.out.println(FileInfo  + " is writable.");
        } else{
            System.out.println(FileInfo  + " is not writable.");
        }
    }
}

