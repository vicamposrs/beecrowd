import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder output = new StringBuilder();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        int evenCount = 0, oddCount = 0;
        for(int i = 0 ; i < 15;i++){
            int num = Integer.parseInt(in.readLine());
            if(num%2 == 0){
                even.append("par[").append(evenCount).append("] = ")
                .append(num).append("\n");
                evenCount++;
            }
            else{
                odd.append("impar[").append(oddCount).append("] = ")
                .append(num).append("\n");
                oddCount++;
            }

            if(oddCount == 5){
                output.append(odd);
                odd = new StringBuilder();
                oddCount = 0;
            }
            if(evenCount == 5){
                output.append(even);
                even = new StringBuilder();
                evenCount = 0;
            }
        }
        output.append(odd).append(even);
        System.out.print(output);
    }
}