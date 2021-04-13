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
        Queue<Nod> queue = new LinkedList<Nod>();
        queue.add(nod);
        
        while(!queue.isEmpty()){
            Nod temp = queue.poll();
            System.out.print(temp.key + " ");
            
            if(temp.left != null){
                queue.add(temp.left);
            }
            
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
}
