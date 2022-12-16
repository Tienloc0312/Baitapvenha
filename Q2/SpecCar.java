/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author hp
 */
public class SpecCar extends Car{
    int type;
    public SpecCar(){
        
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(int type, String maker, int price) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.getMaker() + ", " + super.getPrice() + ", " + this.type;
    }

    public void setData() {
        super.setMaker("XZ" + super.getMaker());
        System.out.println(super.getMaker());
        super.setPrice(super.getPrice() + 20);
        System.out.println(super.toString());
    }

    public int getValue() {
        int inc;
        if (this.type < 7) {
            inc = 10;
        } else {
            inc = 15;
        }
        return super.getPrice() + inc;
    }
    
}
