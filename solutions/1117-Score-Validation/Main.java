import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        float [] nums = new float[2];

        for(int i = 0; i < 2;i++){
            while(true){
                nums[i] = Float.parseFloat(in.readLine());
                if(nums[i] >=0 && nums[i] <= 10) break;
                output.append("nota invalida\n");
            }
        }
        float average = (nums[0] + nums[1])/2;
        output.append("%.2f\n".formatted(average));
        System.out.print(output);
    }
 
}