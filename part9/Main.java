
import java.util.HashSet;
import java.util.Set;



public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        for (String element : set) {
            System.out.println(element);
        }
    }

public static int returnSize(Set<String> setList) {

        return setList.size();
    }

}
