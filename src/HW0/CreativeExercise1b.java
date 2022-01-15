package HW0;

public class CreativeExercise1b {

    public static String drawTriangle(int N){
        String col1 = "";
        int line1 = 0;
        while (line1 < N){
            line1 += 1;
            col1 = col1 + "*";
            System.out.println(col1);
        }
        return col1;
    }

    public static void main(String[] args){
        System.out.println(drawTriangle(10));

    }

}
