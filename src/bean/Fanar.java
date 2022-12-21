/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public class Fanar extends Device
{
    private Fanar(){
        
    }
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static Fanar f = null;
    
    public static Fanar instance(){// instance = obyekt
        if(f == null){
            f = new Fanar();
        }
        return f;
    }
}
