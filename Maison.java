package ex3;

public class Maison {
private String adr;
private String t;
private int nb;
private float s;
public Maison(String adr,String t,int n) {
	this.adr=adr;
	this.t=t;
	this.nb=n;
}
public Maison (String a,String t,float s) {
	this.adr=a;
	this.t=t;
	this.s=s;
}
public void setSurface(float s) {
	this.s=s;
}
public float calculPrix(float pmc) {
	return this.s*pmc;
}
public float calculePrix() {
	return 2100*this.s;
}
public String toChaine() {
	return (("un "+this.t+" de "+this.s+" mm a "+adr+" avec "+this.nb+" chambres"));
}

}
