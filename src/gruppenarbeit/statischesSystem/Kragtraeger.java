package gruppenarbeit.statischesSystem;
import gruppenarbeit.kraefte.Einzellast;

//gets data as fachwert
public class Kragtraeger {
    protected double
            _l,  //laenge
            _mMax, //maxBiegemoment
            _p, //Einzellast --> needed for
            _xa; //

    public Kragtraeger(double l, double p, double xa){
        //set variables for safety
        _l = l;
        _p = p;
        _xa = xa;

        //new Einzellast object with values given
        Einzellast elsa = new Einzellast(_p, _xa);
        //objects calculate
        set_mMax(elsa.berechneMmax());
        System.out.println(_mMax);
    }
    //getter methods most of them are this case probably obsolete

    public double get_mMax() {
        return _mMax;
    }

    //setter
    public void set_mMax(double _mMax) {
        this._mMax = _mMax;
    }

    public void set_l(double _l) {
        this._l = _l;
    }

    public void set_p(double _p) {
        this._p = _p;
    }

    public void set_xa(double _xa) {
        this._xa = _xa;
    }
}
