import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void cookoff (String [] input) {
        if (input.length < 5) {
            System.out.println("No");
            return;
        }
 
        int cakewalk = 0;
        int simple = 0;
        int easy = 0;
        int easy_medium = 0;
        int medium = 0;
        int medium_hard = 0;
        int hard = 0;
 
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("cakewalk")) {
                cakewalk = 1;
            } else if (input[i].equals("simple")) {
                simple = 1;
            } else if (input[i].equals("easy")) {
                easy = 1;
            } else if (input[i].equals("easy-medium")) {
                easy_medium = 1;
            } else if (input[i].equals("medium")) {
                medium = 1;
            } else if (input[i].equals("medium-hard")) {
                medium_hard = 1;
            } else if (input[i].equals("hard")) {
                hard = 1;
            }
        }
 
        if (easy == 1 && cakewalk == 1 && simple == 1) {
            if (easy_medium == 1 || medium == 1) {
                if (medium_hard == 1 || hard == 1) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
 
        System.out.println("No");
 
    }
 
 
    public static void main (String [] args) throws IOException{
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0){
            int N = s.nextInt();
            String [] input = new String [N];
            for(int j = 0;j < N;j++){
                input[j] = s.next();
            }
            cookoff(input);
            T--;
        }
    }
}
