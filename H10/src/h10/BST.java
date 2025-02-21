
package h10;


public class BST <T extends Comparable> {
    
    private BinaryTreeNode root;
    public void BST()
    {   
       root = null;
        
    }
    public  boolean isEmpty()
    {
        return root==null;
    }
    public  BinaryTreeNode insert(BinaryTreeNode node, T data)
    {
        if (node==null)
            node = new BinaryTreeNode(data);
        else 
        { T data2 = (T) node.getElement();
        if(data.compareTo(data2)<0)
                node.left = insert(node.left, data);
        else node.right = insert(node.right, data);
        }
        return node;
        
    }
    public void inOrder(BinaryTreeNode t) {
        if (t != null) 
        {
         inOrder(t.getLeft());
         System.out.println(t.getValue());
         inOrder(t.getRight());

    }
    
}//end inorder
    public void searchName(BinaryTreeNode t, String name) {
        
       if (t != null) 
        {
         searchName(t.getLeft(), name);
         Person p = (Person)t.getValue();
         String last = p.getLastname();
         if(last.equalsIgnoreCase(name))
                System.out.println(p);
         searchName(t.getRight(), name);
    
    
    }
    }
    public void searchMonth(BinaryTreeNode t, String month) {
        
       if (t != null) 
        {
         searchMonth(t.getLeft(), month);
         Person p = (Person)t.getValue();
         String birthday = p.getBday();
         birthday = birthday.substring(0,2);
         if(birthday.equalsIgnoreCase(month))
                System.out.println(p);
         searchMonth(t.getRight(), month);
    
    
    }
    }
    public BinaryTreeNode getRoot()
    {
        return root;
    }
}

