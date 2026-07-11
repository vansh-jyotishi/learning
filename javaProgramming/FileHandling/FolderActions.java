package javaProgramming.FileHandling;

import java.io.File;

public class FolderActions {
    // creating a folder
    public static void createFolder(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("new folder created at:" + path);
        } else {
            System.out.println(path + "already exists");
        }
    }

    // checking if folder exists or not
    public static boolean checkExistance(String path) {
        File folder = new File(path);
        if (folder.exists()) {
            System.out.println("folder:" + path + "exists");
            return true;
        } else {
            System.out.println("folder:" + path + "does not exists");
            return false;
        }
    }

    //renaming a folder
    public static void renameFolder(File obj,String newPath){
       if (obj.exists()) {
         obj.renameTo(new File(newPath));
        System.out.println("folder renamed to:"+newPath);
       }else{
        System.out.println("folder does not exists");
       }
    }
    //deleting an folder if its empty
    public static void deleteFolder(String path){
        File folder = new File(path);
        if(folder.exists()){
            folder.delete();
            System.out.println("successfully deleted : "+path);
        }else{
            System.out.println("folder does not exists");
        }
    }
    public static void main(String[] args) {
        String path = "./new folder";
        createFolder(path);
        checkExistance(path);
        renameFolder(new File(path), "./new name folder");
        deleteFolder(path);
        renameFolder(new File(path), "./new name folder");
    }
}
