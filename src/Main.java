import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] B = {1,2,3,5};
        System.out.println(compareSets(A,B));
    }
    public static int compareSets(int[] A, int[] B) {

        if (Arrays.equals(A,B)) return 0;
        else if (A.length < B.length) {
            boolean allInB = true;
            for (int i:A) {
                if (!existsInArr(i, B)) allInB = false;
            }
            if (allInB) return -1;
        }
        else if (A.length > B.length) {
            boolean allInA = true;
            for (int i:B) {
                if (!existsInArr(i, A)) allInA = false;
            }
            if (allInA) return 1;
        }
        return -2;
    }
    static boolean existsInArr (int number, int[] arr) {
        for (int i: arr) {
            if (number == i) return true;
        }
        return false;
    }
}
