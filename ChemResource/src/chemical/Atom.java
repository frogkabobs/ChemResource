package chemical;

public class Atom implements Comparable<Atom> {
	public Element element;
	public int charge;
	
	public Atom(Element e, int c) {
		element = e;
		charge = c;
	}
	public Atom(Element e) {
		this(e,0);
	}
	public enum Element {
		hydrogen("H"),
		helium("He"),
		lithium("Li"), 
		beryllium("Be"),
		boron("B"), 
		carbon("C"),
		nitrogen("N"),
		oxygen("O"),
		fluorine("F"),
		neon("N"),
		sodium("Na"),
		magnesium("Mg"),
		aluminum("Al"),
		silicon("Si"),
		phosphorus("P"), 
		sulfur("S"),
		chlorine("Cl"), 
		argon("Ar"), 
		potassium("K"),
		calcium("Ca"),
		scandium("Sc"),
		titanium("Ti"),
		vanadium("V"),
		chromium("Cr"),
		manganese("Mn"), 
		iron("Fe"),
		cobalt("Co"),
		nickel("Ni"),
		copper("Cu"),
		zinc("Zn"),
		gallium("Ga"),
		germanium("Ge"),
		arsenic("As"),
		selenium("Se"),
		bromine("Br"),
		krypton("Kr"),
		rubidium("Rb"), 
		strontium("St"),
		yttrium("Y"),
		zirconium("Zr"),
		niobium("Nb"),
		molybdenum("Mo"),
		technetium("Tc"),
		ruthenium("Ru"),
		rhodium("Rh"),
		palladium("Pd"),
		silver("Ag"),
		cadmium("Cd"),
		indium("In"),
		tin("Sn"), 
		moiety("R"),
		halogen("X");
		
		public String abbrev;
		private Element(String s) {
			abbrev = s;
		}
	}
	@Override
	public int compareTo(Atom a) {
		return element.compareTo(a.element);
	}
}
