import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        String [] months = {
            "January","February","March","April",
            "May", "June", "July", "August",
            "September", "October", "November" , "December"
        };

        Scanner sc = new Scanner(System.in);

        int monthNumber = sc.nextInt() - 1;

        System.out.println(months[monthNumber]);

        sc.close();
    }
 
}