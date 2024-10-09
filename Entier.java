package tp4;

public class Entier {
private int n ;
static int count=0;

public  Entier(int n) {
	this.setN(n);
}
public int factoriel() {
	int p=1;
	for (int i=1;i<this.n;i++) {
		p=p*i;}
	return p;
}
public int absolue() {
	if (this.n>0)
		return n;
	if (this.n<0)
		return this.n*-1;
	return this.n ;
}
public String compare(int e1,int e2) {
	if (e1>e2)
		return (e1+"est plus grands que "+e2);
	else if (e1<e2)
		return (e2+"est plus grands que "+e1);
	else
		return (e1+"est egal "+e2);
}
public String premier() {
	for(int i=2;i<this.n;i++) {
		if (this.n%2==0) 
			return ("n'est pas premier");
	}
	return ("est premier");
}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}



}
