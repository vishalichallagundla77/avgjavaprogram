
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c=0;
        int sum=0;
        while(true) {
            int a = scanner.nextInt();
            if (a==0) {
                break;
            }
            sum+=a;
            c++;
        }
        System.out.println(sum/c);
    }}
