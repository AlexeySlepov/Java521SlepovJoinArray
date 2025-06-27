import java.util.Arrays;

public class Main {
    // TODO: 1) Есть 2 массива в отсортированнов виде
    //   int[] arr = {-5,0,1,1,2,3,6,8,22,45,678}
    //   int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100}
    //   int[] arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
    //   Нельзя использовать сортировку

    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};

        int[] arr3 = join(arr, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] join(int[] arr, int[] arr2) {
        int[] result = new int[arr.length + arr2.length];
        for (int i = 0, j = 0; i + j < result.length; ) {
            if (i < (arr.length) && j < (arr2.length)) {
                if (arr[i] < arr2[j]) {
                    result[i + j] = arr[i++];
                } else {
                    result[i + j] = arr2[j++];
                }
            } else if (i < (arr.length) && j == (arr2.length)) {
                result[i + j] = arr[i++];
            } else if (i == (arr.length) && j < (arr2.length)) {
                result[i + j] = arr2[j++];
            }
        }
        return result;
    }
}
