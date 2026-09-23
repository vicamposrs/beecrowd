import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder output= new StringBuilder();
        while((line = in.readLine()) != null){
            String []nums = line.split(" ");
            int numberOfWords = Integer.parseInt(nums[0]);
            int maxLinesperPage = Integer.parseInt(nums[1]);
            int maxCharactersPerLine = Integer.parseInt(nums[2]);

            String [] words = in.readLine().split(" ");

            int numOfLines = 1;
            int numOfPages = 1;
            int numOfcharacters = 0;
            int space = 0;

            for(String word : words){
                int wordLenth = word.length();
                
                if(wordLenth + space + numOfcharacters <= maxCharactersPerLine){
                    numOfcharacters += wordLenth + space;
                    space = 1;
                }
                else{
                    numOfcharacters = wordLenth;
                    numOfLines++;
                }
                if(numOfLines > maxLinesperPage){
                    numOfLines = 1;
                    numOfPages++;
                }
                System.out.println(numOfLines + " " + numOfcharacters + " " +numOfPages + " " +word);
            }
            output.append(numOfPages).append("\n");
        }
        System.out.print(output);
        
    }
}