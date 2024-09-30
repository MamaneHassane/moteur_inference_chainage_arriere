 package algoritme1;

import java.util.Iterator;
import java.util.Scanner;

public class algorithme {
	public static groupeFaits Sauvegarde_faits_de_etablir_faits;
	
	public static String etablirFaits(groupeFaits F) {
		
		
		
		if(F.lesfaits.isEmpty()) return "SUCCES";
		System.out.println("Debut de EtablirFaits de "+F);
		fait unFait = F.lesfaits.firstElement();
		F.lesfaits.remove(0);
		
		System.out.println("Pour le fait "+unFait);
		
		Sauvegarde_faits_de_etablir_faits = F;
		
		if(procedureM12(unFait).equals("ECHEC"))return "ECHEC";
		
		else return etablirFaits(F);
	}

	
	public static String cycle(groupeRegles R, fait f) {
		regle  uneRegle = null;
		groupeFaits lesFaits = new groupeFaits();
		if(R.lesregles.isEmpty())return "ECHEC";
		else {
				uneRegle = R.lesregles.firstElement();
				R.lesregles.remove(0);
				if(uneRegle.conclusionContient(f)) {
					System.out.println("Le fait "+f+" se trouve dans la conclusion de "+uneRegle+"\n");
					lesFaits = uneRegle.faits_gauches;
					if(!R.lesregles.isEmpty()) System.out.println("Les regles restantes sont : \n"+R);
					if(etablirFaits(lesFaits).equals("SUCCES")) return "SUCCES";
				}
				else{
				System.out.println("Le fait "+f+" ne se trouve pas dans la conclusion de "+uneRegle+"\n");
				if(!R.lesregles.isEmpty()) System.out.println("Les regles restantes sont:  \n"+R);
				}
				return cycle(R,f);	
		}
	}
	
	public static String procedureM12(fait f) {
		
		for(fait F : baseDeFaits.BF.lesfaits) {
			if(F.lefait.equals(f.lefait)) 
				{
					System.out.println("Déja dans la base de faits...");
					return "SUCCES" ;
				}
		}
        return cycle(new baseDeRegles().BR,f);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Base de faits :");
		System.out.println(baseDeFaits.BF);
		System.out.println("Base de regles :");
		System.out.println(baseDeRegles.BRInitiale);
		System.out.println("Quel fait voulez-vous prouver ?");
		String F = scanner.next();
		System.out.println(procedureM12(new fait(F)));
		
	}

}
