import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        boolean cont = true;

        while(cont){
            float [] nums = new float[2];
            for(int i = 0; i < 2; i ++){
                while(true){
                    nums[i] = Float.parseFloat(in.readLine());
                    if(nums[i] < 0 || nums[i] > 10) output.append("nota invalida\n");
                    else break;
                }
            }
            float avg = (nums[0] + nums[1])/2;
            output.append("media = %.2f\n".formatted(avg));

            output.append("novo calculo (1-sim 2-nao)\n");
            int a = 0;
            while( a != 1 && a != 2){
                a = Integer.parseInt(in.readLine());
            }
            if(a == 2) cont = false;
        }
        System.out.println(output);
    }
}