import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
        String filePath = "./error.txt";
        File file = new File(filePath);
        try{
            if (file.exists()) {
                String fileName = file.getName();
                System.out.println(fileName);
                ErrorMessage();
            } else {
                System.out.println("File does not exist.");
            }
        }catch(IOException e){
            System.out.println("Message: " + e.getMessage());
        }
    }
    public static void ErrorMessage() throws IOException{
        throw new IOException("Error File Exists.");
    }
}
