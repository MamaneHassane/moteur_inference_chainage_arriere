package algoritme1;

import java.util.Iterator;
import java.util.Vector;

public class groupeFaits {
	Vector<fait> lesfaits;
	public groupeFaits(fait... _lesfaits) {
		lesfaits = new Vector<fait>();
		for(fait f : _lesfaits) lesfaits.add(f); 
	}
	public String toString() {
		String toReturn = "";
		Iterator<fait> it = lesfaits.iterator();
		while (it.hasNext()) toReturn += it.next().toString();
		return toReturn;
	}
}
