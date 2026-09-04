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

    static String pre(Node a){
        if(a == null) return "";
        return " " + a.val + pre(a.left) + pre(a.right);
    }

    static String in(Node a){
        if(a == null) return "";
        return in(a.left) +" " + a.val + in(a.right);
    }

    static String post(Node a){
        if(a == null) return "";
        return post(a.left) + post(a.right) +" " + a.val;
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
                while(val > -1){
                    if(val < temp.val){
                        if(temp.left == null){
                            temp.left = new Node(val);
                            val = -1;
                        }
                        else temp = temp.left;
                    }
                    else{
                        if(temp.right == null){
                            temp.right = new Node(val);
                            val = -1;
                        }
                        else temp = temp.right;
                    }
                }
            }

            output.append("Case ").append(i + 1).append(":\n");
            output.append("Pre.:").append(Node.pre(root)).append("\n");
            output.append("In..:").append(Node.in(root)).append("\n");
            output.append("Post:").append(Node.post(root)).append("\n\n");
        }
        System.out.print(output);
    }
}