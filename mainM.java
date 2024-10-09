package ex3;

public class mainM {

	public static void main(String[] args) {
		Maison m1=new Maison("tunis","duplex",4);
		Maison m2=new Maison("nabeul","villa",5);
		m1.setSurface(210);
		 System.out.println(m1.toChaine()); 
		 System.out.println(m2.toChaine()); 
	    m2.setSurface(230);
		 System.out.println(m1.toChaine()); 
		 System.out.println(m2.toChaine()); 
	    System.out.println(m2.calculPrix(300)+"DT");
	    System.out.println(m2.calculePrix()+"DT");
	}

}
