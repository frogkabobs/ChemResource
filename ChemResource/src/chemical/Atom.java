package chemical;

public class Atom extends Moiety {
	
	
	public Atom(Element e, int c) {
		element = e;
		charge = c;
	}
	public Atom(Element e) {
		this(e,0);
	}
	

}
