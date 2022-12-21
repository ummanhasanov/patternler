/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Umman Hasan
 */
public class Fanar2 extends Device implements Serializable// immutable etmekdir meqsedi
//        state-i (deyisenlerin parametrlerinin deyisdirilmesini) qorumaq ucun
{

//  immutable olmasi ucun private edirik asgini
    private String name;
    private String surname;
    private String fatherName;
    private int age;
    private int a;
//  immutable olmasi ucun private edirik yuxarini 

    private Fanar2() {

    }

    public String getSurname() {
        return surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getAge() {
        return age;
    }

    public int getA() {
        return a;
    }

    public String getName() {
        return name;
    }

   

    public Fanar2(String name, String surname, String fatherName, int age, int a) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
        this.a = a;
    }

    private void setName(String name) {// setler private olmalidir qiraqdan cagirilmasin
        this.name = name;
    }

    private void setFatherName(String name) {
        this.fatherName = name;
    }

    private void setSurname(String name) {
        this.surname = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setA(int a) {
        this.a = a;
    }

    public static Fanar2Builder builder() {
        return new Fanar2Builder();
    }

    public static class Fanar2Builder// inner class
//     Fonar2 obyektinin 1(bir) defe yaradilsin ve deyisiklik edile bilmesin
//     Fanar2Builder vasitesi ile 
    {

        private Fanar2 f = null;

        public Fanar2Builder() {
            f = new Fanar2();
        }

        public Fanar2 build() {// private Fanar2 f ; geri qaytarir
            Fanar2 ff = f;// asagi
            f = null;// bu basqa variantda yazilisdir burada parameter teleb olunmur
            return ff;// yuxari

//            return new Fanar2(f.name, f.surname, f.fatherName, f.age, f.a);
        }

        public Fanar2Builder setYourName(String name) {
            this.f.name = name;
            return this;
        }

        public Fanar2Builder setYourSurname(String name) {
            this.f.surname = name;
            return this;
        }

        public Fanar2Builder setYourFatherName(String name) {
            this.f.fatherName = name;
            return this;
        }

        public Fanar2Builder howOldAreYou(int age) {
            this.f.age = age;
            return this;
        }
    }
}
