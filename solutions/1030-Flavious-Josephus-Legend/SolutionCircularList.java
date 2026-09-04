import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    int val;
    Node next;

    Node(int val,Node next){
        this.val = val;
        this.next = next;
    }

    static void remove(Node ant, Node removed){
        ant.next = removed.next;
    }

    String exibe(){
        Node b = this;
        StringBuilder a =new StringBuilder();
        a.append("[ ");
        a.append(b.val).append(" , ");
        b = b.next;
        while(b != null && b != this){
            a.append(b.val).append(" , ");
            b = b.next;
        }
        a.append(" ]");
        return a.toString();
    }

}

public class SolutionCircularList {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
        int NC = Integer.parseInt(in.readLine());
        StringBuilder output = new StringBuilder();

        for(int z = 0; z < NC;z++){
            StringTokenizer line = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(line.nextToken());
            int k = Integer.parseInt(line.nextToken());

            Node a = new Node(1,null);
            Node p = a;

        
            for(int i = 2;i <= n;i++){
                p.next = new Node(i,null);
                p = p.next;
            }
            p.next = a;

            while(a.val != k-1) a = a.next;
            p = a.next;
            for(int i = 0; i < n ; i ++){
                p = a.next;
                Node.remove(a, p);
                for(int j = 0; j < k-1; j++)a = a.next;
            }
        

            output.append("Case ").append(z+1).append(": ")
            .append(a.val).append("\n");
        }
        System.out.print(output);
    }
}
