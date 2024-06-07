import java.io.*;

public class File {
    public static void main(String[] args) {
        String sourceFilePath = "File.java";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("code.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("There was an error copying the file.");
            e.printStackTrace();
        }
    }
}