import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class File_handling {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            // 1. Create the File
            File myFile = new File(fileName);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write to the File
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a test for Java File Handling!");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 3. Read from the File
            Scanner reader = new Scanner(myFile);
            System.out.println("File contents:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
