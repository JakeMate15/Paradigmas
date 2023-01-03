/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionamiento;

/**
 *
 * @author erikm
 */
public class Pair{
    private Producto first;
    private Integer second;

    public Pair(Producto first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public Producto getFirst() {
        return first;
    }

    public void setFirst(Producto first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
    
    public void addSecond(Integer add){
        second+=add;
    }
    
    public void rest(Integer r){
        second-=r;
    }

}
