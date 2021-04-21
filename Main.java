public class Main {
    
    public static void main(String args[]){
        
        Nod nod = new Nod(); 
        Nod radacina = null;
        
        int[] tab = {6, 3, 7, 2, 10, 4};
        
        for(int i : tab){
           radacina = nod.inserareNod(radacina, i);
        }
        
        System.out.print("Inorder: ");
        nod.inorder(radacina);
        System.out.print("\n");
        System.out.print("Preorder: ");
        nod.preorder(radacina);
        System.out.print("\n");
        System.out.print("Postorder: ");
        nod.postorder(radacina);
        System.out.print("\n");
        System.out.println("Level Order: ");
        nod.levelOrder(radacina);
        System.out.print("\n");
        
        
    }
    
    
}
