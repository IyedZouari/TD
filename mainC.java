package ex2;

public class mainC {

	public static void main(String[] args) {
		compte co1 =new compte();
		compte co2 =new compte();
		System.out.println("le compte 1 solde : "+co1.avoirSold());
		System.out.println("le num compt1: "+co1.getNum());
		System.out.println("le compte 2 solde : "+co2.avoirSold());
		System.out.println("le num compt2: "+co2.getNum());	
		co2.deposer(500);
		co1.deposer(1200);
		System.out.println("le compte 1 solde : "+co1.avoirSold());
		System.out.println("le num compt1: "+co1.getNum());
		System.out.println("le compte 2 solde : "+co2.avoirSold());
		System.out.println("le num compt2: "+co2.getNum());	
		co2.transferer(700, co1);
		
		System.out.println("le compte 2 solde : "+co2.avoirSold());
		System.out.println("le num compt2: "+co2.getNum());	
		
	}


}
