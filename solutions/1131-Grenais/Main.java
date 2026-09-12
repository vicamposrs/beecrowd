import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int inter = 0, gremio = 0, empate = 0;
        int grenais = 0;

        boolean cont = true;
        while(cont){
            String [] line = in.readLine().split(" ");
            int interGoals = Integer.parseInt(line[0]);
            int gremioGoals = Integer.parseInt(line[1]);
            if(interGoals == gremioGoals) empate++;
            else if(interGoals > gremioGoals) inter++;
            else gremio++;

            grenais++;
            output.append("Novo grenal (1-sim 2-nao)\n");
            if(in.readLine().equals("2")) cont = false;
        }
        output.append(grenais).append(" grenais\n");
        output.append("Inter:").append(inter).append("\n");
        output.append("Gremio:").append(gremio).append("\n");
        output.append("Empates:").append(empate).append("\n");
        if(inter == gremio) output.append("Não houve vencedor");
        else if(inter > gremio) output.append("Inter venceu mais");
        else output.append("Gremio venceu mais");

        System.out.println(output);
    }
 
}