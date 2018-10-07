package chemical;

public class Moiety implements Comparable<Moiety>{
	public Element element;
	public int charge;
	
	public Moiety() {
		// TODO Auto-generated constructor stub
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
		organicGroup("Organic Group","R"),
		halogen("X");
		
		public String name;
		public String abbrev;
		
		private Element(String s) {
			abbrev = s;
			name = name().substring(0, 1).toUpperCase() + name().substring(1);
		}
		private Element(String n, String s) {
			name = n;
			abbrev = s;
		}
	}

	@Override
	public int compareTo(Moiety a) {
		return element.compareTo(a.element);
	}

}
