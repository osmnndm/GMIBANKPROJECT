package utilities;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTxtUtil {
    public static void main(String[] args) {
        writeToFile("AllCustomerData.txt","Bekir Tufan");
    }

    public static void writeToFile(String filePath, String data){
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
