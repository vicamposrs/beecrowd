import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double S = 0;

        for(int i = 0; i <= 19; i++){
            S += (2.0*i + 1)/(Math.pow(2,i));
        }
        System.out.printf("%.2f\n",S);
    }
 
}