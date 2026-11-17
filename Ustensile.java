package tp7;

public class Ustensile {
	protected int annee;

    public Ustensile(int annee) {
        this.annee = annee;
    }

    

	public int getAnnee() {
        return this.annee;
    }

    public double getValeur() {
        int age = 2019 - annee;
        if (age < 50) {
            return 0.0;
        }else{return (2019 - annee - 50);
    }
}
}
