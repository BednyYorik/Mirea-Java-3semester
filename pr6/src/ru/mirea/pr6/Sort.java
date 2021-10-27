package ru.mirea.pr6;

public class Sort {

    public static void sort_ins(Student[] array) {
        for (int j = 1; j < array.length; j++) {
            Student current = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i].getId() > current.getId())) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = current;
        }
    }

    public static void QSort(Student[] arr, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && arr[i].compareTo(arr[cur]) == -1)
                i++;
            while (j > cur && arr[cur].compareTo(arr[j]) == -1)
                j--;
            if (i < j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        QSort(arr, start, cur);
        QSort(arr, cur + 1, end);
    }

}