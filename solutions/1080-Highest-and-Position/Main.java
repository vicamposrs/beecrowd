import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int highest = -1;
        int position = 0;
        int num;
        for(int i = 1; i <= 100; i++){
            num = Integer.parseInt(in.readLine());
            if(num > highest){
                highest = num;
                position = i;
            }
        }
        System.out.println(
            highest + "\n" +
            position
        );
        in.close();
    }
}