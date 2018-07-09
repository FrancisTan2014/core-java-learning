import java.util.Arrays;

public class VarArgsTest {

    public static void main(String[] args) {
        Print(3, 4, 6, 4, 78);
        Print(new int[] { 5, 78, 66, 44, 48, 4 });
    }

    private static void Print(int... nums) {
        System.out.println(Arrays.toString(nums));
    }

}