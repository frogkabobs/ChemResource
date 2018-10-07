package chemical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Compound {
	// add bonds
	Atom[] atoms;
	int[][] bonds; //replace this with numbers
	Hashtable<Atom, Integer> atomRef;
	ArrayList<int[]>[] bondList;
	
	@SuppressWarnings("unchecked")
	public Compound(Atom[] a, int[][] b, boolean sorted) {
		atoms = Arrays.copyOf(a,a.length);
		bonds = b;
		if(!sorted) {
			Hashtable<Atom, Integer> table = new Hashtable<>(a.length);
			for(int i = 0; i < a.length; i++) table.put(a[i], i);
			Arrays.sort(atoms);
			for(int i = 0; i < bonds.length; i++) {
				int[] bo = new int[bonds.length];
				for(int j = 0; j < bonds.length; j++) bo[j] = bonds[i][table.get(atoms[j])];
				bonds[i] = bo;
			}
			int[][] bo1 = new int[bonds.length][];
			for(int i = 0; i < bonds.length; i++) bo1[i] = bonds[table.get(atoms[i])];
			bonds = bo1;
		}
		atomRef = new Hashtable<>(atoms.length);
		for(int i = 0; i < a.length; i++) atomRef.put(atoms[i], i);
		bondList = (ArrayList<int[]>[])new ArrayList[Bond.values().length];
		for(int i = 0; i < bondList.length; i++) bondList[i] = new ArrayList<int[]>();
		for(int i = 0; i < bonds.length; i++) for(int j = 0; j < i; j++) bondList[bonds[i][j]].add(new int[] {i, j});
	}
	
	public Compound(Atom[] a, boolean sorted, int[]... b) {
		atoms = Arrays.copyOf(a,a.length);
		if(sorted) {
			bonds = new int[a.length][a.length];
			for(int[] bo : b) bonds[bo[1]][bo[2]] = bonds[bo[2]][bo[1]] = bo[0];
		} else {
			Arrays.sort(atoms);
			atomRef = new Hashtable<>(atoms.length);
			for(int i = 0; i < a.length; i++) atomRef.put(atoms[i], i);
			bonds = new int[a.length][a.length];
			for(int[] bo : b) bonds[atomRef.get(a[bo[1]])][atomRef.get(a[bo[2]])] = bonds[atomRef.get(a[bo[2]])][atomRef.get(a[bo[1]])] = bo[0];
		}
	}
	
	/* 0 = no bond
	 * 1 = singleCovalent
	 * 1 = doubleCovalent
	 * 2 = tripleCovalent
	 * 3 = ionic
	 * 4 = resonant
	 * 5 = aromatic
	 * 6 = electronDeficient
	 * 7 = coordination
	 * 8 = cyclopropyl; //more may be added
	 * make enum for bonds
	 */
	
	public static enum Bond {
		singleCovalent, doubleCovalent, tripleCovalent, ionic, resonant, aromatic, electronDeficient, coordination, cyclopropyl;
		
		public static Bond value(int i) {
			if(i == 0) return null;
			return values()[i-1];
		}
	}
}
