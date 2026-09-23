import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder output = new StringBuilder();

        int T = Integer.parseInt(in.readLine());

        for(int i = 0; i < T; i++){
            String [] line = in.readLine().split(" ");

            int PA = Integer.parseInt(line[0]);
            int PB = Integer.parseInt(line[1]);
            double G1 = Double.parseDouble(line[2]);
            double G2 = Double.parseDouble(line[3]);

            int years = (int) (100*(PA - PB)/(G2*PB - G1*PA));

            if(PA*(1+G1*years/100) == PB*(1+G2*years/100)) years++;
        
            if(years > 100) output.append("Mais de 1 seculo.\n").append(years).append("\n");
            else output.append(years).append(" anos.\n");
        }
        System.out.print(output);
    }
}