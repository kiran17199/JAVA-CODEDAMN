package Arrays;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        for (int x: list) {
            System.out.println(x);
        }
    }
    
}
