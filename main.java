package tp4;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Entier n =new Entier(6);
		System.out.println("factoriel de  "+ n.getN()+" est "+n.factoriel());
		System.out.println("absolue de  "+n.getN()+ "  est "+n.absolue());
		System.out.println(n.premier());
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter e1:");
			int e1 = sc.nextInt();
			System.out.println("Enter e2:");
			int e2 =sc.nextInt();
        System.out.println(n.compare(e1, e2));
         
        ++Entier.count;
        System.out.println("Valeur après première incrémentation (préfixée) : " + Entier.count);
        Entier.count++;
        System.out.println("Valeur après deuxième incrémentation (postfixée) : " + Entier.count);
			sc.close();
		
	}

}
