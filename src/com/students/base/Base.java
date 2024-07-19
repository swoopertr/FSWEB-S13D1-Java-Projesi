package com.students.base;

public class Base {
    public int yas;
    public int kilo;
    public boolean cinsiyet;

    public Base(){
        yas = 18;
        kilo = 60;
    }

    public Base(int _yas){
        yas = _yas;
        kilo = 60;
    }

    public Base(int _yas, int _kilo){
        yas = _yas;
        kilo = _kilo;
    }





    public void yasArtir() {
        yas++;
    }
    public boolean shouldWakeUp(boolean dogBarking, int time) {
        if (time > 23 || time < 0) {
            return false;
        } else if (time >= 20 || time < 8) {
            if (dogBarking) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean hasTeen(int yas1, int yas2, int yas3) {
        if (yas1 >=13 && yas1 <= 19) {
            return true;
        } else if (yas2 >=13 && yas2 <= 19) {
            return true;
        } else if (yas3 >=13 && yas3 <= 19) {
            return true;
        }
        return false;
    }
}
