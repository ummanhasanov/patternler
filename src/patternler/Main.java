/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patternler;

import bean.Fanar;
import bean.Fanar2;
import bean.Fanar2.Fanar2Builder;// Fanar2 obyektini yaradarken bele yazilir

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fanar ff = Fanar.instance();

           Fanar2Builder builder = Fanar2.builder();// Fanar2 obyektini yaradir
            builder.setYourName("Huseyn");
            builder.setYourSurname("Hasanov");
            builder.setYourFatherName("Umman");
            builder.howOldAreYou(8);
            
            Fanar2 f = builder.build();
            
//            builder.howOldAreYou(81);// NullPointerException verecek bu da      Fanar2 f = builder.build(); bir defe cagirildiqdan sonra bas verir

            
            System.out.println("name = "+f.getName()+",\n"  + "surname = "+ f.getSurname()+",\n" + "father name = "+f.getFatherName()+",\n"  +"age = "+ f.getAge());
    }
    
}
