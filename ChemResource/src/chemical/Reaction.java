package chemical;

import java.util.ArrayList;
import chemical.Moiety.Element;

public class Reaction {
	public Compound[] reactants;
	public Compound[] products;
	public String conditions;
	
	public Reaction(Compound[] r, Compound[] p, String s) {
		reactants = r;
		products = p;
		conditions = s;
	}
	
	public static final Reaction PUMMERER_REARRANGEMENT = new Reaction(new Compound[] {new Compound(new Atom[] {new Atom(Element.organicGroup), new Atom(Element.sulfur), new Atom(Element.oxygen), new Atom(Element.carbon), new Atom(Element.hydrogen), new Atom(Element.hydrogen), new Atom(Element.organicGroup)}, 
			null, false)}, null, "");

}
