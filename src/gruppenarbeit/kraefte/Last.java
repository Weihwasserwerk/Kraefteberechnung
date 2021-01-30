package gruppenarbeit.kraefte;

//fachwerte
abstract class Last {
    private double _wert;
    public abstract double berechneMmax();

    public void set_wert(double a){
        _wert = a;
    }

    public double get_wert() {
        return _wert;
    }
}

