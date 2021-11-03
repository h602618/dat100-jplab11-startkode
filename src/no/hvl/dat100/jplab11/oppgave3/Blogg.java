package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private int nesteLedig;
	private Innlegg[] innleggTabell;

	public Blogg() {
		innleggTabell = new Innlegg[20];

		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];

		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}

	public Innlegg[] getSamling() {
		return innleggTabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < innleggTabell.length; i++) {
			if (innleggTabell[i] != null && innleggTabell[i].erLik(innlegg)) {
				return i;
			}
		}

		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < innleggTabell.length; i++) {
			if (innleggTabell[i] != null && innleggTabell[i].erLik(innlegg)) {
				return true;
			}
		}

		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggTabell.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (!finnes(innlegg)) {
			innleggTabell[nesteLedig++] = innlegg;

			return true;
		}

		return false;
	}

	public String toString() {
		String str = getAntall() + "\n";

		for (int i = 0; i < getAntall(); i++) {
			str += innleggTabell[i];
		}

		return str;
	}

	// valgfrie oppgaver nedenfor
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean slett(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {
		throw new UnsupportedOperationException(TODO.method());
	}
}