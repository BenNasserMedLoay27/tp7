package tp7;

class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public double getSurface() {
        return cote * cote;
    }

    @Override
    public double getValeur() {
        return 5 * super.getValeur();
    }
}
