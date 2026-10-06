import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());

        String [] nums = in.readLine().split(" "); 
        
        int lowest = Integer.parseInt(nums[0]);
        int position = 0;
        for(int i = 1; i < N;i++){
            int num = Integer.parseInt(nums[i]);
            if(num < lowest){
                lowest = num;
                position = i;
            }
        }
        System.out.println("Menor valor: " + lowest);
        System.out.println("Posicao: " + position);
    }
}