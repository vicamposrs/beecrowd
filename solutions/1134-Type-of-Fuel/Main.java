import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new  StringBuilder("MUITO OBRIGADO\n");

        String [] typeName = {"Alcool","Gasolina", "Diesel"};
        int length = typeName.length;
        int [] typeFuelQuantity = new int[length];

        while(true){
            int value = Integer.parseInt(in.readLine());
            if(value == length + 1) break;
            if(value <= length) typeFuelQuantity[value-1]++;
        }

        for(int i = 0; i < length; i++)
            output.append(typeName[i]).append(": ").append(typeFuelQuantity[i]).append("\n");

        System.out.print(output);
    }
}