package com.students;
import com.students.base.Base;

public class Nebi extends  Base {

    public Nebi(){
      super(25, 95);
    }
    public Nebi(int _yas){
      super(_yas);
    }

    public  Nebi(int _yas, int kilo){
      super(_yas,kilo);
    }


    public static String myName() {
        return "com.students.nebi";
    }





}

