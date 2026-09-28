import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String line;

        while((line = in.readLine()) != null){
            String [] nums = line.split(" ");

            int R1 = Integer.parseInt(nums[0]);
            int X1 = Integer.parseInt(nums[1]);
            int Y1 = Integer.parseInt(nums[2]);

            int R2 = Integer.parseInt(nums[3]);
            int X2 = Integer.parseInt(nums[4]);
            int Y2 = Integer.parseInt(nums[5]);

            int r = R1 - R2;
            int x = X2 - X1;
            int y = Y2 - Y1;

            if(x*x + y*y <= r*r && R1 >= R2) 
                output.append("RICO\n");
            else
                output.append("MORTO\n");
        }
        System.out.print(output);
    }
}