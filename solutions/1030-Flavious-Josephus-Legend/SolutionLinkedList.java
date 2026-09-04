import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SolutionLinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
        int NC = Integer.parseInt(in.readLine());
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < NC;i++){
            StringTokenizer line = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(line.nextToken());
            int k = Integer.parseInt(line.nextToken());

            int p = 0;
            LinkedList<Integer> nums = new LinkedList<>();
            for(int j = 1; j <= n; j++){
                nums.add(j);
            }
            for(int j = 0; j < n-1;j++){
                p= (p +k-1)%(n-j);
                nums.remove(p);
            }
            output.append("Case ").append(i + 1).append(": ")
            .append(nums.get(0)).append("\n");
        }
        System.out.print(output);
    } 
}
