
import com.students.*;

public class Main {

    public static void main(String[] args) {
        //todo : burada yazdığımız classlardan objeleri ürretip kullanıcağız.

        Elif elifObj = new Elif(35);
        elifObj.cinsiyet = false;

        System.out.println("Elif'in yaşı " + elifObj.yas);
        System.out.println("Elif'in kilo " + elifObj.kilo);
        System.out.println("Elif'in köpeği havlıyor mu? " + (elifObj.shouldWakeUp(true, 1) == true));



        Sinan sinan = new Sinan();
        boolean isOk = sinan.hasTeen(1,1,1);
        System.out.println(isOk);
        System.out.println("Sinan'ın yaşı " + sinan.yas);
        Sinan sinan2 = new Sinan(45);
        System.out.println("Sinan 2'nin yaşı " + sinan2.yas);
        Sinan sinan3 = new Sinan(65, 75);
        System.out.println("Sinan 3'ün yaşı " + sinan3.yas + " kilosu " + sinan3.kilo);



        Nebi nebi = new Nebi(25,95);
        System.out.println("Yaş atandı: " + nebi.yas );
        nebi.yasArtir();
        System.out.println("Yaş arttırıldı: " + nebi.yas);
        System.out.println("Nebi'nin yaşı " + nebi.yas);
        System.out.println("Nebi'nin kilo " + nebi.kilo);




        Gokalp gokalp = new Gokalp();
        System.out.println("Gökalp'in yaşı : " + gokalp.yas);
        Gokalp gokalp2 = new Gokalp(16);
        System.out.println("Gökalp'in Kemik yaşı : " + gokalp2.yas);
        Gokalp gokalp3 = new Gokalp(26,93);
        System.out.println("Gökalp'in gerçek yaşı ve kilosu : " + gokalp3.yas + " " + gokalp3.kilo);


        Egomen egomen = new Egomen();
        System.out.println("Ego yaş: " + egomen.yas + " " + egomen.kilo);
        Egomen egomeniki = new Egomen(12, 67);
        System.out.println( "Ego2 kilo " + egomeniki.kilo +" Ego2 Yaş " + egomeniki.yas);
        Egomen egomenUc = new Egomen(25);
        System.out.println("Ego3 yaş " + egomenUc.yas + " kilo " + egomenUc.kilo);
        Egomen egomenDort = new Egomen(false);
        System.out.println("Ego4 cinsiyet " + egomenDort.cinsiyet + " kilo "+egomenDort.kilo + "  yaş " + egomenDort.yas);

        Mete mete = new Mete();
        mete.yas = 9;
        System.out.println("Mete'nin yaşı " + mete.yas);
        System.out.println("Mete'nin kilo " + mete.kilo);

        //            Ogrenciler ogrenciler = new Ogrenciler();
//            ogrenciler.gokalp.yas = 30;
//            System.out.println("gokalp yas " + ogrenciler.gokalp.yas);
//        System.out.println("Ben kimim?" + com.students.Sinan.myName()    );
//        System.out.println("İsmin ne Evladım? " + com.students.Egomen.myName());
//        System.out.println("adım: "+ com.students.Nebi.myname());
//        System.out.println("ben kimim elif"+ com.students.Elif.myName());
//        System.out.println("Say My Name : " + com.students.Gokalp.myName());
//
//
//        //nebi boy static
//        com.students.Nebi.boy = 186;
//        System.out.println("com.students.Nebi boy : "+com.students.Nebi.boy);
//
//        com.students.Mete.boy = com.students.Nebi.boy + 1;
//        System.out.println("mete boy" + com.students.Mete.boy);
//
//        com.students.Elif.boy=com.students.Mete.boy + 1;
//        System.out.println("elif boy:"+ com.students.Elif.boy);
//
//        com.students.Egomen.boy = com.students.Elif.boy + 1;
//        System.out.println("Egemen boyun kaç?  "+ com.students.Egomen.boy);
//
//        com.students.Sinan.boy = com.students.Egomen.boy + 1;
//        System.out.println("com.students.Sinan boy " + com.students.Sinan.boy);
//
//        com.students.Gokalp.boy = com.students.Sinan.boy + 1;
//        System.out.println("com.students.Gokalp boy : " + com.students.Gokalp.boy);
//        com.students.Gokalp.boyDegistir();
//        System.out.println("com.students.Nebi boy : "+com.students.Nebi.boy);

//        com.students.Egomen egemenObj = new com.students.Egomen();
//        egemenObj.yas = 17;
//        System.out.println("Yaşın ne Egemen? " + egemenObj.yas);
//        egemenObj.yasArtir();
//        System.out.println("Bir sene sonra yaşın ne Egemen? " + egemenObj.yas);
//
//        com.students.Sinan sinanObj = new com.students.Sinan();
//        sinanObj.yas = 99;
//        System.out.println("com.students.Sinan " + sinanObj.yas + " yaşında");
//        sinanObj.yasArtir();
//        System.out.println("com.students.Sinan " + sinanObj.yas + " yaşında");
//
//        com.students.Elif elifAgeObj = new com.students.Elif();
//        elifAgeObj.yas =38;
//        System.out.println("elif " + elifAgeObj.yas + " yasinda");
//        elifAgeObj.yasArtir();
//        System.out.println("elif yeni " + elifAgeObj.yas + " yasinda");
//
//
//        com.students.Gokalp gokalpObj = new com.students.Gokalp();
//        gokalpObj.yas = 60;
//        System.out.println("Yaş : " + gokalpObj.yas);
//        gokalpObj.yasArttir();
//        System.out.println("Olman gereken yaş : " + gokalpObj.yas);
//
//        com.students.Nebi nebiObj = new com.students.Nebi();
//        nebiObj.yas = 25;
//        System.out.println("nebi yas => " + nebiObj.yas);
//        nebiObj.agePlus();
//        System.out.println("yaşlı nebi  => " + nebiObj.yas);
//
//        com.students.Mete meteobj = new com.students.Mete ();
//        meteobj.yas = 32;
//        System.out.println("mete yas => " + meteobj.yas);
//        meteobj.yasArtir();
//        System.out.println("mete yas => " +meteobj.yas);
//
//        com.students.Mete meteobj_genclik = new com.students.Mete();
//        meteobj_genclik.yas = 22;
//        System.out.println("genç mete yas => " + meteobj_genclik.yas);
//        meteobj_genclik.yasArtir();
//        System.out.println("genç mete yas => " +meteobj_genclik.yas);
//
//        com.students.Mete meteobj_bebek = new com.students.Mete();
//        meteobj_bebek.yas = 2;
//        System.out.println("genç mete yas => " + meteobj_bebek.yas);
//        meteobj_bebek.yasArtir();
//        System.out.println("genç mete yas => " +meteobj_bebek.yas);


//        for (int i = 0; i < 100; i++) {
//            com.students.Mete tmpMete = new com.students.Mete();
//            tmpMete.yas = i+4;
//            tmpMete.yasArtir();
//            System.out.println("genç mete yas => " +tmpMete.yas);
//        }

        /*
        com.students.Sinan sinanObj = new com.students.Sinan();
        System.out.println("starting sinan's tests");
        System.out.println("wake up testi");
        System.out.println("Test Case 1: " + (sinanObj.shouldWakeUp(true, 1) == true));
        System.out.println("Test Case 2: " + (sinanObj.shouldWakeUp(false, 2) == false));
        System.out.println("Test Case 3: " + (sinanObj.shouldWakeUp(true, 8) == false));
        System.out.println("Test Case 4: " + (sinanObj.shouldWakeUp(true, -1) == false));
        System.out.println("hasTeen testi");
        System.out.println("Test Case 1: " + (sinanObj.hasTeen(9,99,19) == true));
        System.out.println("Test Case 2: " + (sinanObj.hasTeen(23,15,42) == true));
        System.out.println("Test Case 3: " + (sinanObj.hasTeen(22,23,34) == false));
        System.out.println("finished sinan's tests");*/

   /*     com.students.Egomen egemenObj = new com.students.Egomen();
        System.out.println("Ego Start Barking Dog");
        System.out.println("Test Case 1: " + (egemenObj.shouldWakeUp(true, 1) == true));  // true
        System.out.println("Test Case 2: " + (egemenObj.shouldWakeUp(false, 2) == false)); // false
        System.out.println("Test Case 3: " + (egemenObj.shouldWakeUp(true, 8) == false));  // false
        System.out.println("Test Case 4: " + (egemenObj.shouldWakeUp(true, -1) == false)); // false
        System.out.println("New Fn HasTeen Below: ");
        System.out.println("Test Case 1: " + (egemenObj.hasTeen(9, 99, 19) == true));  // true
        System.out.println("Test Case 2: " + (egemenObj.hasTeen(23, 15, 42) == true)); // true
        System.out.println("Test Case 3: " + (egemenObj.hasTeen(22, 23, 34) == false)); // false
        // System.out.println("New Fn Cat: ");
        // System.out.println("New Fn Area: ");
        System.out.println("Ego Finish");*/

//        com.students.Elif elifObj = new com.students.Elif();
//        System.out.println("elif test1:" + (elifObj.shouldWakeUp(true,1 ) == true));
//        System.out.println("elif test2:" + (ElifObj.shouldWakeUp(false,2 ) == false));
//        System.out.println("elif test3:" + (ElifObj.shouldWakeUp(true,8 ) == false));
//        System.out.println("elif test4:" + (ElifObj.shouldWakeUp(true,-1 ) == false));
//        System.out.println("elif New Fn HasTeen Below: ");
//        System.out.println("elif hasTeen test1:" + (ElifObj.hasTeen(9, 99, 19) == true));
//        System.out.println("elif hasTeen test2:" + (ElifObj.hasTeen(23, 15, 42) == true));
//        System.out.println("elif hasTeen test2:" + (ElifObj.hasTeen(22, 23, 34) == false));

        //com.students.Mete Mete0bj = new com.students.Mete();
        //System.out.println("test1:" + (Mete0bj.shouldWakeup(true, 1) == true));
       // System.out.println("test2:" + (Mete0bj.shouldWakeup(false, 2) == false));
        //System.out.println("test3:" + (Mete0bj.shouldWakeup(true, 8) == false));
        //System.out.println("test4:" + (Mete0bj.shouldWakeup(true, -1) == false));
        //System.out.println("com.students.Mete New Fn HasTeen Below: ");
        //System.out.println("com.students.Mete hasTeen test1:" + (Mete0bj.hasTeen(9, 99, 19) == true));
        //System.out.println("com.students.Mete hasTeen test1:" + (Mete0bj.hasTeen(23, 15, 42) == true));
        //System.out.println("com.students.Mete hasTeen test1:" + (Mete0bj.hasTeen(22, 23, 34) == false));
        

        // com.students.Gokalp gokalpObj = new com.students.Gokalp();
        // System.out.println("Havlayan Köpek Testi");
        // System.out.println("Sonuç : " + (gokalpObj.shouldWakeUp(true,1) == true));
        // System.out.println("Sonuç : " + (gokalpObj.shouldWakeUp(false, 2 ) == false));
        // System.out.println("Sonuç : " + (gokalpObj.shouldWakeUp(true,8) == false));
        // System.out.println("Sonuç : " + (gokalpObj.shouldWakeUp(true,-1) == true));
        // System.out.println("HasTeen testi");
        // System.out.println("Sonuç : " + (gokalpObj.hasTeen(9,99,19) == true));
        // System.out.println("Sonuç : " + (gokalpObj.hasTeen(23,15,45) == true));
        // System.out.println("Sonuç : " + (gokalpObj.hasTeen(22,23,34) == false));



    /*   // com.students.Nebi nebiObj = new com.students.Nebi();
        System.out.println("NEBİ'S TEST");
        System.out.println("Test 1: " + (nebiObj.shouldWakeUp(true, 1) == true));
        System.out.println("Test 2: " + (nebiObj.shouldWakeUp(false, 2) == false));
        System.out.println("Test 3: " + (nebiObj.shouldWakeUp(true, 8) == false));
        System.out.println("Test 4: " + (nebiObj.shouldWakeUp(true, -1) == false));

        System.out.println("has teen test");
        System.out.println("hasteen test case1 "+(nebiObj.hasTeen(9,99,19) == true));
        System.out.println("hasteen test case 2"+ (nebiObj.hasTeen(23,15,42) == true));
        System.out.println("hasteen test case 3" + (nebiObj.hasTeen(22, 23, 34)== false));
        System.out.println("has teen test done");*/

    }
}