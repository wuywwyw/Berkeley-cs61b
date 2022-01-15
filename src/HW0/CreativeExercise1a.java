package HW0;

/**
 create a program that prints the following figure using loops
 *
 **
 ***
 ****
 *****
 */

public class CreativeExercise1a {
    public static void main(String[] args){
        String col1 = "";
        int line1 = 0;
        while (line1 < 5){
            line1 += 1;
            col1 = col1 + "*";
            System.out.println(col1);
        }
    }
}

