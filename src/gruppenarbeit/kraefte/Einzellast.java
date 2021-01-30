package gruppenarbeit.kraefte;

public class Einzellast extends Last{
    private final double _xa;
    public Einzellast(double a, double b){
        set_wert(a);
        _xa = b;
    }

    /*
    calculates this shit
    @return result as double without having local results
     */
    @Override
    public double berechneMmax() {
        double wert = get_wert();
        return wert * _xa;
    }
}
