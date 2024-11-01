import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
            readFile("error.txt");
        }catch(IOException e){
            System.out.println("Caught an Checked Exception: " + e.getMessage());
        }
        try{
            demostrateUncheckedException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException{
        if("error.txt".equals(fileName)){
            throw new IOException("File not Found: " + fileName);
        }
        System.out.println("Reading file: " + fileName);
    }
    
    public static void demostrateUncheckedException(){
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);
    }
}
