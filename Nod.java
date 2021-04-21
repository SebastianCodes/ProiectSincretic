public class Nod {
    
    private int key;
    private Nod left;
    private Nod right;
    
    public Nod nouNod(int key){
        Nod nod = new Nod();
        nod.key = key;
        nod.left = null;
        nod.right = null;
        return nod;
    }
    
    public Nod inserareNod(Nod nod, int key){
        if(nod == null)
            return nouNod(key);
        
        if(key < nod.key){
            nod.left = inserareNod(nod.left, key);
        }
        else if(key > nod.key){
            nod.right = inserareNod(nod.right, key);
        }
        return nod;
    }
    
    public void inorder(Nod nod){
        if(nod != null){
            inorder(nod.left);
            System.out.print(nod.key + " ");
            inorder(nod.right);
        }
    }
    
    public void preorder(Nod nod){
        if(nod != null){
            System.out.print(nod.key + " ");
            preorder(nod.left);
            preorder(nod.right);
        }
    }
    
    public void postorder(Nod nod){
        if(nod != null){
            postorder(nod.left);
            postorder(nod.right);
            System.out.print(nod.key + " ");
        }
    }
    
    public void levelOrder(Nod nod){
      if (nod == null)
        return;
  
        Queue<Nod> q = new LinkedList<>();
  
        q.add(nod);
        q.add(null);
  
        while (!q.isEmpty()) {
  
        Nod curr = q.poll();
  
       if (curr == null) {
        if (!q.isEmpty()) {
          q.add(null);
          System.out.println();
        }
      } else {
        if (curr.left != null)
          q.add(curr.left);
        
        if (curr.right != null)
          q.add(curr.right);
  
        System.out.print(curr.key + " ");
      }
    }
   }
    
}
