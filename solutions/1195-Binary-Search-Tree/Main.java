import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
    int val;
    Node left;
    Node right;

    public Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(int val){ 
        this.val = val;
    }

    static void pre(Node a,StringBuilder sb){
        if(a == null) return;
        sb.append(" ").append(a.val);
        pre(a.left,sb);
        pre(a.right,sb);

    }

    static void in(Node a,StringBuilder sb){
        if(a == null) return;
        in(a.left,sb);
        sb.append(" ").append(a.val);
        in(a.right,sb);
    }

    static void post(Node a,StringBuilder sb){
        if(a == null) return;
        post(a.left,sb);
        post(a.right,sb);
        sb.append(" ").append(a.val);
    }
}

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int NC = Integer.parseInt(in.readLine());
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < NC;i++){
            int N = Integer.parseInt(in.readLine());
            String [] line = in.readLine().split(" ");
            int val = Integer.parseInt(line[0]);
            Node root = new Node(val);
            for(int j = 1; j<N; j++){
                Node temp = root;
                val = Integer.parseInt(line[j]);
                boolean notInserted = true;
                while( notInserted ){
                    if(val < temp.val){
                        if(temp.left == null){
                            temp.left = new Node(val);
                            notInserted = false;
                        }
                        else temp = temp.left;
                    }
                    else{
                        if(temp.right == null){
                            temp.right = new Node(val);
                            notInserted = false;
                        }
                        else temp = temp.right;
                    }
                }
            }

            output.append("Case ").append(i + 1).append(":\n");
            output.append("Pre.:");Node.pre(root,output);output.append("\n");
            output.append("In..:");Node.in(root,output); output.append("\n");
            output.append("Post:");Node.post(root,output);output.append("\n\n");
        }
        System.out.print(output);
    }
}