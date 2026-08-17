import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String [] args) throws NumberFormatException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String linha = reader.readLine();
        String[] nums = linha.split(" ");
        int metrosCorridos = Integer.parseInt(nums[0]);
        int comprimentoPista = Integer.parseInt(nums[1]);

        System.out.println(metrosCorridos%comprimentoPista);
    }
}

/*
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int metrosCorridos = sc.nextInt();
        int comprimentoPista = sc.nextInt();
        
        System.out.println(metrosCorridos%comprimentoPista);
 
    }
 
}
*/