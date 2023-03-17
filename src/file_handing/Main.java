package file_handing;

import java.io.File; // import the File class
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File myObj = new File("filename.txt"); //specify the filename
    }
}

// Create file
class CreateFile {
    public static void main(String[] args) {
        try {
//            File myObj = new File("filename.txt"); // 相对路径
            File myObj = new File("C:\\Users\\WX847\\Desktop\\some_file\\filename.txt");// 绝对路径要用双斜杠

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists. ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("File in Java might be tricky, but it is fun enough");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An Error occurred");
        }

    }
}

class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

//get file information

class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File name:" + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());

        } else {
            System.out.println("The file does not exists.");
        }
    }
}
// delete a file

class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("filename2.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file:" + myObj.getName());

        } else {
            System.out.println("Failed to delete the file.");
        }

    }
}

// delete Folder
class DeleteFolder {
    public static void main(String[] args) {
        File myObj = new File("Test");
        if (myObj.delete()) {
            System.out.println("Deleted the folder:" + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }

    }
}
