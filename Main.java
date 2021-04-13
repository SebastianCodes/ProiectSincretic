public class Main {
    
    public static void main(String args[]){
        
        Nod nod = new Nod(); 
        Nod radacina = null;
        
        Random rand = new Random();
        int num1, num2, num3, num4, num5, num6;
        
        num1 = 1 + rand.nextInt(20);
        num2 = 1 + rand.nextInt(20);
        num3 = 1 + rand.nextInt(20);
        num4 = 1 + rand.nextInt(20);
        num5 = 1 + rand.nextInt(20);
        num6 = 1 + rand.nextInt(20);
        
        radacina = nod.inserareNod(radacina, num1);
        nod.inserareNod(radacina, num2);
        nod.inserareNod(radacina, num3);
        nod.inserareNod(radacina, num4);
        nod.inserareNod(radacina, num5);
        nod.inserareNod(radacina, num6);
        
        System.out.print("Inorder: ");
        nod.inorder(radacina);
        System.out.print("\n");
        System.out.print("Preorder: ");
        nod.preorder(radacina);
        System.out.print("\n");
        System.out.print("Postorder: ");
        nod.postorder(radacina);
        System.out.print("\n");
        System.out.print("Level Order: ");
        nod.levelOrder(radacina);
        System.out.print("\n");
        
        
    }
    
    
}
