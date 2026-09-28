import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int [] nums = new int[20];
        for(int i = 0; i < 20;i++){
            nums[19-i] = Integer.parseInt(in.readLine());
        }

        for(int i = 0; i < 20; i ++){
            output.append("N[").append(i).append("] = ");
            output.append(nums[i]).append("\n");
        }
        System.out.print(output);
    }
}