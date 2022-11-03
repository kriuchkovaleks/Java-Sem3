
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HomeTask2 {
    public static void main(String[] args) {
        Logger l = Logger.getAnonymousLogger();
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(45, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        l.info(max_min_average(myList));
    }

    private static String max_min_average(ArrayList<Integer> arr) {
        StringBuilder sb = new StringBuilder();
        arr.sort(Comparator.naturalOrder());
        int min = arr.get(0);
        sb.append("Минимальное: ");
        sb.append(min);
        int max = arr.get(arr.size() - 1);
        sb.append(" Максимальное: ");
        sb.append(max);
        int sum = 0;
        int count = 0;
        for (int j = 0; j < arr.size(); j++) {
            sum = sum + arr.get(j);
            count++;
        }
        double average = sum / count;
        sb.append(" Среднее: ");
        sb.append(average);

        return sb.toString();
    }
}
