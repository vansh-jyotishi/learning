package javaProgramming.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {
    // creating file
    public static void createFile(String filePath) {
        File myObj = new File(filePath);
        try {
            if (myObj.createNewFile()) {
                System.out.println("file created:" + myObj.getName());
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // writing data into a file
    public static void writeFile(String filePath) {

        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write("welcome to java file handelling");
            myWriter.close();
            System.out.println("succesfuly wrote");
        } catch (IOException e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }

    }

    // reading data from the file
    public static void readFile(String filePath) {
        try {
            File myFileObj = new File(filePath);
            Scanner sc = new Scanner(myFileObj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //renaming a file 
    public static void renameFile(String oldFilePath,String newFilePath){
        File newFile = new File(newFilePath);
        File oldFile = new File(oldFilePath);
        if(oldFile.renameTo(newFile)){
            System.out.println("renamed succesfully");
        }else{
            System.out.println("cant rename the file");
        }

    }
    //deleting a file
    public static void deleteFile(String filePath){
        File myObj = new File(filePath);
        if(myObj.delete()){
            
            System.out.println("file deletedd succesfully");
        }else{
            System.out.println("file does not  exists");
        }
    }

    public static void main(String[] args) {
        createFile("./myFile.txt");
        writeFile("./myFile.txt");
        readFile("./myFile.txt");
        renameFile("./myFile.txt","./myNewFile.java");
        deleteFile("./myNewFile.java");
    }
}
