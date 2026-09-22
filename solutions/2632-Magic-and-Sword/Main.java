import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;


public class Main{
    
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
        int x1 = xL - Cx , y1 = yL - Cy;
        int [][] p = {
            {x1,y1}, {x1+w,y1}, {x1+w,y1+h}, {x1,y1+h}
        };

        int x =0, y = 0;

        boolean betweenX =  (0 >= x1 && 0 <= x1 + w);
        boolean betweenY =  (0 >= y1 && 0 <= y1 + h);

        if(betweenX && betweenY) return 1;

        if(betweenX){
            x = 0;
            y = Math.min(Math.abs(y1), Math.abs(y1+h));
        }
        else if(betweenY){
            y = 0;
            x = Math.min(Math.abs(x1), Math.abs(x1 + w));
        }
        else
        {
            int d = Integer.MAX_VALUE;
            for(int []point : p){
                int dTemp = point[0]*point[0] + point[1]*point[1];
                if(dTemp < d){
                    d = dTemp;
                    x = point[0];
                    y = point[1];
                }
            }
        }
        return (x*x + y*y <= r*r)?1:0;
    }
}
