import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        double num =Double.parseDouble(in.readLine());

        for(int i = 0; i < 100;i++){
            long part1 = (long)num;
            int part2 = (int)((num - (double)(long)num)*100000);
            if(part2%10 > 5 || (part2%10 == 5 &&  (part2/10)%2 == 1)) part2 = part2/10 + 1;
            else part2 /= 10; 

            output.append("N[").append(i).append("] = ");
            output.append(part1).append(".");
            if(part2 < 1000) output.append("0");
            if(part2 < 100) output.append("0");
            if(part2 < 10) output.append("0");
            output.append(part2).append("\n");
            num /= 2.0;
        }

        System.out.print(output);
    }
}