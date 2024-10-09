package ex2;

public class compte {
	private float solde_compte=0;
	private int num;
	public static int count=0;
	public compte() {
		this.solde_compte=0;
		count++;
		this.num=count;
	}
	public float deposer(float m) {
		return this.solde_compte+=m;
	}
	public float retirer(float m) {
		return this.solde_compte-=m;
	}
	public float avoirSold() {
		return this.solde_compte;
	}
	public void transferer(float m,compte c ) {
		this.solde_compte-=m;
		c.solde_compte+=m;
	}
	public int getNum() {
		return num;
	}
}
