import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());

        int rabbit = 0;
        int rat = 0;
        int frog = 0;

        int total = 0;

        String [] line = new String[2];
        for(int i = 0; i < N; i++){
            line = in.readLine().split(" ");
            int num = Integer.parseInt(line[0]);
            char animal = line[1].charAt(0);

            switch (animal) {
                case 'C': rabbit += num; break;
                case 'R': rat += num; break;
                case 'S': frog += num; break;
            }

            total += num;
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + rabbit);
        System.out.println("Total de ratos: " + rat);
        System.out.println("Total de sapos: " + frog);
        System.out.printf("Percentual de coelhos: %.2f %%\n",100.0*rabbit/total);
        System.out.printf("Percentual de ratos: %.2f %%\n",100.0*rat/total);
        System.out.printf("Percentual de sapos: %.2f %%\n",100.0*frog/total);

    }
}