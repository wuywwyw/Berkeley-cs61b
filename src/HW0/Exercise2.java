package HW0;

public class Exercise2 {
    /** Returns the maximum value from m. */
    public static int getMax(int[] m){
        int i;
        int max = 0;
        for(i = 0; i < m.length; i++) {
            if (m[i] > max)
                max = m[i];
        }
        return max;
    }

    public static void main(String[] args){
        int[] m = new int[]{9, 2, 15, 2, 22, 10, 6};
        int max = getMax(m);
        System.out.println(max);

    }
}
