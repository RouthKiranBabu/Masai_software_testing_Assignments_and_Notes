import java.util.ArrayList;
import java.util.List;

public class Solution{
    List<String> cityList = new ArrayList<>();
    public void putCity(String cityName){
        cityList.add(cityName);
    }
    public List<String> getCity(){
        return cityList;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String city = new String();
        for (int i = 1; i < 6; i ++){
            city = "city_" + Integer.toString(i);
            s.putCity(city);
        }
        System.out.println("City List: " + s.getCity());
        for (int i = 0; i < s.getCity().size(); i ++){
            System.out.println("City at index " + i + " is: " + s.getCity().get(i));
        }
    }
}