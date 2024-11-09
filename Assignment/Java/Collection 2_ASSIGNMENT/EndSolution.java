import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;

public class EndSolution {
    HashMap<String, ArrayList<String>> dictContact = new HashMap<>();
    public void addContact(String name, String number){
        if (dictContact.containsKey(name)) {
            dictContact.get(name).add(number);
        } else {
            ArrayList<String> phoneNum = new ArrayList<>();
            phoneNum.add(number);
            dictContact.put(name, phoneNum);
        }
    }
    public static void main(String[] args) {
        System.out.print("How many phone number you want to add: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        EndSolution es = new EndSolution();
        for(int i = 0; i < n; i ++){
            System.out.print("Enter contact Type: ");
            String name = scanner.next();
            System.out.print("Enter Corresponding Phone Number: ");
            String phno = scanner.next();
            es.addContact(name, phno);
        }
        scanner.close();
        for(Map.Entry<String, ArrayList<String>> entry: es.dictContact.entrySet()){
            String key = entry.getKey();
            ArrayList<String> values = entry.getValue();

            System.out.println("\n* Name: " + key);
            for (String value : values) {
                System.out.println(" - Phone Number: " + value);
            }
        }
    }
}
/*Output
How many phone number you want to add: 3
Enter contact Type: Home
Enter Corresponding Phone Number: 45154151
Enter contact Type: Work
Enter Corresponding Phone Number: 4513451
Enter contact Type: Home 
Enter Corresponding Phone Number: 3452354

* Name: Work
 - Phone Number: 4513451

* Name: Home
 - Phone Number: 45154151
 - Phone Number: 3452354
*/