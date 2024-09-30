package algoritme1;

import java.util.Vector;

public class regle {
	groupeFaits faits_gauches;
	groupeFaits faits_droits;
	
	public regle(groupeFaits G, groupeFaits D){
		faits_gauches = G;
		faits_droits =D;
	}
	
	public String toString() {
		return faits_gauches.toString()+"-->"+ faits_droits.toString()+"\n";
	}
	
	public boolean conclusionContient(fait F) {
		for(fait f : faits_droits.lesfaits ) {
			if(f.lefait.equals(F.lefait)) return true;
		}
		return false;
	}
}
