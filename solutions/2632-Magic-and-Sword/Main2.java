import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        
        
        final Map<String,Integer> indexSpells = Map.of(
            "fire",0,
            "water",1,
            "earth",2,
            "air",3
        );

        final int []damages = {200,300,400,100};
        final int [][] spellRadius = {
            {20,30,50},
            {10,25,40},
            {25,55,70},
            {18,38,60}
        };
        int N = Integer.parseInt(in.readLine());
        for(int i = 0; i < N;i++){
            String [] line = in.readLine().split(" ");
            int w = Integer.parseInt(line[0]);
            int h = Integer.parseInt(line[1]);
            int xL = Integer.parseInt(line[2]);
            int yL = Integer.parseInt(line[3]);
            line = in.readLine().split(" ");
            String spell = line[0];
            int level = Integer.parseInt(line[1]);
            int Cx = Integer.parseInt(line[2]);
            int Cy = Integer.parseInt(line[3]); 

            int index = indexSpells.get(spell);
            int radius = spellRadius[index][level - 1];

            int damage = damages[index] * calcIntersec(w,h,xL,yL,Cx,Cy,radius);
            output.append(damage).append("\n");
        }
        System.out.print(output);
    }

    private static int calcIntersec(int w,int h, int xL, int yL,int Cx,int Cy,int r) {
        int [] pc = {Cx,Cy};
        int x1 = xL - pc[0] , y1 = yL - pc[1];
        int [][] p = {
            {x1,y1}, {x1+w,y1}, {x1+w,y1+h}, {x1,y1+h}
        };


        double d = Integer.MAX_VALUE;
        int [] ponto={};

        // encontra ponto mais proximo
        for(int []point : p){
            double dTemp = (Math.pow(point[0],2) + Math.pow(point[1],2));
            if(dTemp < d){
                d = dTemp;
                ponto = point;
            }
        }

        if(d <= r*r){
            return 1;
        }

        int Y2 = r*r - ponto[0]*ponto[0];

        if(Y2 >= 0){
            double y = Math.sqrt(Y2);
            if((y >= y1 && y <= y1 +h) || (-y >= y1 && -y <= y1 +h))return 1;
            return 0;
        }
        return 0;
    }
}
