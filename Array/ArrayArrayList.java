//convert an array to ArrayList and an ArrayList to array?
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem9 {
    public static void main(String[] args) {
        // Step 1: Convert Array to ArrayList
        String[] array = {"Apple", "Banana", "Cherry"};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Using Arrays.asList()
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted ArrayList: " + arrayList);
        
        // Step 2: Convert ArrayList back to Array
        String[] newArray = arrayList.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(newArray));
    }
}
