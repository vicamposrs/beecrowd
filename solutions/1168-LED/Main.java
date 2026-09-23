import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder output = new StringBuilder();

        final int [] ledForNumber = {6,2,5,5,4,5,6,3,7,6};

        int N = Integer.parseInt(in.readLine());

        for(int i = 0; i < N;i++){
            char []nums = in.readLine().toCharArray();
            int sum = 0;
            for(char num : nums){
                int digit = num - '0';
                sum += ledForNumber[digit];
            }
            output.append(sum);
            output.append(" leds\n");
        }
        System.out.print(output);
    }
}