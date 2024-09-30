package algoritme1;

import java.util.Iterator;
import java.util.Vector;

public class groupeRegles implements Cloneable {
	Vector<regle> lesregles;
	public groupeRegles(regle... _lesregles) {
		lesregles = new Vector<regle>();
		for(regle f : _lesregles) lesregles.add(f); 
	}
	public String toString() {
		String toReturn = "";
		Iterator<regle> it = lesregles.iterator();
		while (it.hasNext()) toReturn += it.next().toString();
		return toReturn;
	}
	public groupeRegles clone() throws CloneNotSupportedException {
        return (groupeRegles) super.clone();
    }

}
