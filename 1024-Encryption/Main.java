import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //Ler numero de entradas
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());
        String textoRecebido;
        String [] textoCodificado = new String[casos];

        //Ler cada string

        for(int i = 0; i < casos; i ++){
            textoRecebido = sc.nextLine();

        //codificar

            // +3 nas letras
            textoCodificado[i] = "";
            //65 - 90
            //97 - 122
            for (int j = 0; j < textoRecebido.length();j++) {
                if(Character.isLetter((char)textoRecebido.charAt(j))) 
                    textoCodificado[i] += String.valueOf((char)(textoRecebido.charAt(j) + 3)); 
                else
                textoCodificado[i] += String.valueOf((char)(textoRecebido.charAt(j))); 
            }
                  
            String temp = "";
            //  inverter String
             for (int j = textoCodificado[i].length() - 1; j >= 0;j--){
                int metade = textoCodificado[i].length();
                metade += (metade%2 == 0)?0:1;
                metade /=2;
                if (metade > j) {
                    temp +=  String.valueOf((char)(textoCodificado[i].charAt(j) - 1));
                }
                else temp +=  String.valueOf(textoCodificado[i].charAt(j));
             }
            textoCodificado[i] = temp;

            // -1 nos caracteres

        }

        //Mostrar

        for (String texto : textoCodificado) System.out.println(texto);
            

        sc.close();
    }
}