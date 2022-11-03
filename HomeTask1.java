//2. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeTask1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Logger l = Logger.getAnonymousLogger();

        List<Integer> mylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1212, 1111));
        for (int i = 0; i < mylist.size(); i++) {
            if (mylist.get(i) % 2 != 0) {
                sb.append(mylist.get(i));
                sb.append(" ");
            }
        }
        l.info(sb.toString());
    }

}
