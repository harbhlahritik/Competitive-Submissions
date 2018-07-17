import java.util.Scanner;
 
public class Main {
 
    public static int friends(String name){
        for(int i = 0;i < name.length()-1;i++){
            if(name.charAt(i) == 'c' && name.charAt(i+1) == 'h') {
                return 1;
            }
            else if(name.charAt(i) == 'h' && name.charAt(i+1) == 'e'){
                return 1;
            }
            else if(name.charAt(i) == 'e' && name.charAt(i+1) == 'f'){
                return 1;
            }
        }
        return 0;
    }
 
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String str = s.nextLine();
        int friends = 0;
        while(N > 0){
            friends += friends(s.nextLine());
            N--;
        }
        System.out.println(friends);
    }
}
