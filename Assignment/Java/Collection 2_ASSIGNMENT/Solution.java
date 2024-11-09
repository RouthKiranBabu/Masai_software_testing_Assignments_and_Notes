import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;

public class Solution{
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> contactDirectory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Name and List of Phone Number you want to add -> ");
        String name = new String();
        ArrayList<String> phoneNumberList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i ++){
            System.out.print("Enter one Word Name: ");
            name = scanner.next();
            phoneNumberList = new ArrayList<>();
            String cond = "Yes";
            while (cond.equals("Yes")){
                System.out.print("Do you want to Add Phone Number(type 'Yes' for Ok): ");
                cond = scanner.next();
                if (cond.equals("Yes")){
                    System.out.print("Enter Phone Number: ");
                    String num = scanner.next();
                    phoneNumberList.add(num);
                }
            }
            contactDirectory.put(name, phoneNumberList);
        }
        scanner.close();
        for(Map.Entry<String, ArrayList<String>> entry: contactDirectory.entrySet()){
            String key = entry.getKey();
            ArrayList<String> values = entry.getValue();

            System.out.println("\n* Name: " + key);
            for (String value : values) {
                System.out.println(" - Phone Number: " + value);
            }
        }
    }
}

/*Output:
Enter Number of Name and List of Phone Number you want to add -> 3
Enter one Word Name: routh
Do you want to Add Phone Number(type 'Yes' for Ok): Yes
Enter Phone Number: 4351541
Do you want to Add Phone Number(type 'Yes' for Ok): Yes
Enter Phone Number: 451541
Do you want to Add Phone Number(type 'Yes' for Ok): Yes
Enter Phone Number: 45135413
Do you want to Add Phone Number(type 'Yes' for Ok): no
Enter one Word Name: Kiran
Do you want to Add Phone Number(type 'Yes' for Ok): Yes
Enter Phone Number: 5135145345
Do you want to Add Phone Number(type 'Yes' for Ok): no
Enter one Word Name: Babu
Do you want to Add Phone Number(type 'Yes' for Ok): Yes
Enter Phone Number: 4513451345
Do you want to Add Phone Number(type 'Yes' for Ok): no

* Name: Kiran
 - Phone Number: 5135145345

* Name: routh
 - Phone Number: 4351541
 - Phone Number: 451541
 - Phone Number: 45135413

* Name: Babu
 - Phone Number: 4513451345
*/