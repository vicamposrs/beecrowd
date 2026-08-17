// 19-03-2026

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int workedHours = Integer.parseInt(reader.readLine());
        float salaryPerHour = Float.parseFloat(reader.readLine());

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n",workedHours*salaryPerHour);
    }
}