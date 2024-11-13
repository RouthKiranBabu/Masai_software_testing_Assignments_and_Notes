import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public void readFile(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new IOException("File not found");
            }
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch(IOException ie){
            System.out.println(ie.getMessage());
        }
    }
    public static void main(String[] args){
        Solution s = new Solution();
        //s.readFile("C:\\Users\\kiran\\OneDrive\\Desktop\\Checked and Unchecked Exception_ASSIGNMENT\\Task2\\someFile.txt");
        s.readFile("C:\\Users\\kiran\\OneDrive\\Desktop\\Checked and Unchecked Exception_ASSIGNMENT\\Task2\\File.txt");
    }
}
