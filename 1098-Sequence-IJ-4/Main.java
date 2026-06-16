public class Main {
    public static void main(String[]args){
        for(int i = 0;i <= 20 ; i+=2){
            for(int j = 1; j <= 3; j++){
                if(i%10 == 0)System.out.printf("I=%d J=%d\n",i/10,j+i/10);
                else System.out.printf("I=%.1f J=%.1f\n",i/10.0,j+i/10.0);
            }
        }
    }
}