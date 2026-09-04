import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
        int NC = Integer.parseInt(in.readLine());
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < NC;i++){
            StringTokenizer line = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(line.nextToken());
            int k = Integer.parseInt(line.nextToken());

            boolean [] nums = new boolean[n];
            int p = k-1;
            nums[p] = true;
            for(int j = 0; j < n-1; j++){
                // para cada repetição acha o proximo numero disponivel ainda
                for(int z = 0; z < k;z++){
                    p = (p+1)%n;
                    while(nums[p%n]) p = (p+1)%n;
                }
                nums[p] = true;
            }
            output.append("Case ").append(i+1).append(": ")
            .append(p+1).append("\n");
        }
        System.out.print(output);
    }   
}