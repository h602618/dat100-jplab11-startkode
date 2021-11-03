package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	private int id;
	private String bruker;
	private String dato;
	private int likes;

	public Innlegg() {
	}

	public Innlegg(int id, String bruker, String dato) {
		setId(id);
		setBruker(bruker);
		setDato(dato);

		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this(id, bruker, dato);

		this.likes = likes;
	}

	public String getBruker() {
		return this.bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return this.dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return this.id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLikes() {
		return this.likes;

	}

	public void doLike() {
		likes++;
	}

	public boolean erLik(Innlegg innlegg) {
		return this.id == innlegg.id;
	}

	@Override
	public String toString() {
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		throw new UnsupportedOperationException(TODO.method());
	}
}
