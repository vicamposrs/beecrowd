import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        double [] nums = new double[3];
        for(int i = 0; i < N; i++){
            String line = in.readLine();
            nums[0] = Double.parseDouble(line.substring(0,3));
            nums[1] = Double.parseDouble(line.substring(4,7));
            nums[2] = Double.parseDouble(line.substring(8,11));

            double weightedAverage = (nums[0]*2+nums[1]*3+nums[2]*5)/10;
            
            output.append("%.1f\n".formatted(weightedAverage));
        }
        System.out.print(output);
    }
}