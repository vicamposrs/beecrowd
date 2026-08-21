import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(in.readLine());
        
        for(int i = 1; i <= 10;i++) System.out.println( i+" x "+num+" = "+ i*num);

        in.close();
    }
}
