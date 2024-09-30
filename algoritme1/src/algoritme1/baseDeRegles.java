package algoritme1;

public class baseDeRegles {
	
	
	//Les faits n'appartenant pas à la base de faits sont placés dans cette classe afin de créer
	//la base des règles.
	public static fait b = new fait("B");
	public static fait f = new fait("F");
	public static fait i = new fait("I");
	public static fait j = new fait("J");
	public static fait l = new fait("L");
	public static fait m = new fait("M");
	public static fait n = new fait("N");
	public static fait o = new fait("O");
	public static fait p = new fait("P");
	public static fait q = new fait("Q");
	public static fait r = new fait("R");
	public static fait s = new fait("S");
	
	//On crée les groupes de faits et les les règles

	//Regle 1
	public static groupeFaits gf1 = new groupeFaits(baseDeFaits.k,l,m);
	public static groupeFaits gf2 = new groupeFaits(i);
	public static regle r1 = new regle(gf1,gf2);
	
	//Regle 2
	public static groupeFaits gf3 = new groupeFaits(i,j,l);
	public static groupeFaits gf4 = new groupeFaits(q);
	public static regle r2 = new regle(gf3,gf4);
	
	//Regle 3
	public static groupeFaits gf5 = new groupeFaits(baseDeFaits.c,baseDeFaits.d,baseDeFaits.e);
	public static groupeFaits gf6 = new groupeFaits(b);
	public static regle r3 = new regle(gf5,gf6);
	
	//Regle 4
	public static groupeFaits gf7 = new groupeFaits(baseDeFaits.a,b);
	public static regle r4 = new regle(gf7,gf4);
	
	//Regle 5
	public static groupeFaits gf8 = new groupeFaits(l,n,o,p);
	public static groupeFaits gf9 = new groupeFaits(q);
	public static regle r5 = new regle(gf8,gf9);
	
	//Regle 6
	public static groupeFaits gf10 = new groupeFaits(baseDeFaits.c,baseDeFaits.h);
	public static groupeFaits gf11 = new groupeFaits(r);
	public static regle r6 = new regle(gf10,gf11);
	
	//Regle 7
	public static groupeFaits gf12 = new groupeFaits(r,j,m);
	public static groupeFaits gf13 = new groupeFaits(s);
	public static regle r7 = new regle(gf12,gf13);
	
	//Regle 8
	public static groupeFaits gf14 = new groupeFaits(f,baseDeFaits.h);
	public static regle r8 = new regle(gf14,gf6);
	
	//Regle 9
	public static groupeFaits gf15 = new groupeFaits(baseDeFaits.g);
	public static regle r9 = new regle(gf15,gf6);
	
	//La base de regles
	public static groupeRegles BRInitiale = new groupeRegles(r1,r2,r3,r4,r5,r6,r7,r8,r9);
	public static groupeRegles BR; 
	
	public baseDeRegles() {
		BR =  new groupeRegles(r1,r2,r3,r4,r5,r6,r7,r8,r9);
	}
	
}
