import java.util.Scanner;
class TreeNode{
    int info;
    TreeNode lptr;
    TreeNode rptr;

    public TreeNode(int info){
        this.info = info;
        this.lptr = null;
        this.rptr = null;
    }
}

class Nirav{
    public TreeNode root = null;

    public TreeNode insert(TreeNode root , int data){
        if(root == null){
            root = new TreeNode(data);
            return root;
        }
        TreeNode newNode = new TreeNode(data);
        if(root.info > newNode.info){
            root.lptr = insert(root.lptr, data);
        }
        else if(root.info < newNode.info){
            root.rptr = insert(root.rptr , data);
        }
        return root;
    }

    public int searchmax(TreeNode root , int max){
        if(root == null){
            return max;
        }
        return searchmax(root.rptr , root.info);

    }

    public int searchmin(TreeNode root , int min){
        if(root == null){
            return min;
        }
        return searchmax(root.lptr , root.info);

    }
}
public class BSTMaxMin {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Nirav t = new Nirav(); 
        System.out.println("Enter Number of Nodes: ");
        int n = sc.nextInt();
        int nodes[] = new int[n];
        System.out.println("Enter the value of nodes one by one: ");
        for(int i = 0 ; i < n ; i++){
            nodes[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            t.root = t.insert(t.root, nodes[i]);
        }
        System.out.println("Min=" + t.searchmin(t.root, t.root.info));
        System.out.println("Max=" + t.searchmax(t.root, t.root.info));
    }
}
