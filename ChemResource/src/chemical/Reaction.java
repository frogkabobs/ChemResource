package chemical;

import java.util.ArrayList;

public class Reaction {
	public Compound[] reactants;
	public Compound[] products;
	public String conditions;
	
	public Reaction(Compound[] r, Compound[] p, String s) {
		reactants = r;
		products = p;
		conditions = s;
	}
	
	public static final Reaction PUMMERER_REARRANGEMENT = new Reaction(new Compound[] {new Compound(new Atom[] {new Atom(Atom.Element.moiety), new Atom(Atom.Element.sulfur), new Atom(Atom.Element.oxygen), new Atom(Atom.Element.carbon), new Atom(Atom.Element.hydrogen), new Atom(Atom.Element.hydrogen), new Atom(Atom.Element.moiety)}, 
			null, false)}, null, "");

}
