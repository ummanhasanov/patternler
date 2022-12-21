/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public final class Config// immutsble and singleton pattern
{
    private String name;
    
    public static Config ins = null;
    
    public static Config instance(){
        if (ins == null){
            ins = new Config();
        }
        return ins;
    }
}
