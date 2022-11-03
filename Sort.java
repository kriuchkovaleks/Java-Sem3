// Реализовать алгоритм сортировки слиянием

import java.util.*;
import java.util.logging.Logger;

public class Sort {
    public static void main(String[] args) {

        Logger lg = Logger.getAnonymousLogger();
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[] { 4, 2, 4, 3, 6, 7, 32, 3 };
        
        sort_arr(arr);
        for (int i : arr) {
            Integer.toString(i);
            sb.append(i);
            sb.append(" , ");
        }
        lg.info(sb.toString());
    }

    private static void sort_arr (int[] original_arr) {
        if (original_arr.length < 2) {
            return;
        }
        
        int mid = original_arr.length / 2;
        int [] left = new int[mid];
        int [] right = new int [original_arr.length - mid];
        
        for (int i = 0; i < mid; i++) {
            left[i] = original_arr[i];            
        }
        for (int i = mid; i < original_arr.length; i++) {
            right[i - mid] = original_arr[i];
        }

        sort_arr(left);
        sort_arr(right);
        merge_array(original_arr, left, right);
    }

    private static void merge_array(int[] result_arr, int[] arr1, int[] arr2) {
        int arr1_min_index = 0;
        int arr2_min_index = 0;
        int result_arr_min_index = 0;
        while (arr1_min_index < arr1.length && arr2_min_index < arr2.length) {
            if (arr1[arr1_min_index] <= arr2[arr2_min_index]) {
                result_arr[result_arr_min_index] = arr1[arr1_min_index];
                arr1_min_index++;

            } else {
                result_arr[result_arr_min_index] = arr2[arr2_min_index];
                arr2_min_index++;
            }
            result_arr_min_index++;
        }

        while (arr1_min_index < arr1.length) {
            result_arr[result_arr_min_index] = arr1[arr1_min_index];
            arr1_min_index++;
            result_arr_min_index++;
        }
        while (arr2_min_index < arr2.length) {
            result_arr[result_arr_min_index] = arr2[arr2_min_index];
            arr2_min_index++;
            result_arr_min_index++;
        }
    }
}
