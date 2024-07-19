package com.students;

import com.students.base.Base;

public class Egomen extends Base {


    public Egomen (){
        super(12, 86);
    }

    public Egomen (int _yas){
        super(_yas);
    }

    public Egomen (int _yas, int _kilo){
        super(_yas, _kilo);
    }

    public Egomen(boolean _gender){
        super();
        cinsiyet = _gender;
    }


public int abc(){
    return 1;
}

    public static String myName() {
        return "Egemen";
    }


/*

    public void  yasArtir() {
        yas++;
    }

    public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (!isBarking) {
            return false;
        }

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (hourOfDay < 8 || hourOfDay >= 20) {
            return true;
        }
        return false;
    }

    public boolean hasTeen(int yas1, int yas2, int yas3) {
        return  (yas1 >= 13 && yas1 <= 19)
                ||
                (yas2 >= 13 && yas2 <= 19)
                ||
                (yas3 >= 13 && yas3 <= 19);
    }

    public boolean isCatPlaying(boolean isSummer, int temperature) {
        if(isSummer){
            return  temperature >= 25 && temperature <= 45;
        } else {
            return temperature >=25 && temperature <= 35;
        }
    }

    public double area (double length, double width){
        if (length < 0 || width < 0) {
            return  -1;
        }
    return  length * width;
    }
*/

}
