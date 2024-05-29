package edu.pxu.lthdt.bai03;

public class QuanLyXe {
	public static void main(String[] args) {
        // TODO code application logic here
        XeOto car = new XeOto("Lambotghini", 2023, 800);
        XeBus bus = new XeBus("VinBus", 2023, 400, 30);
        
        System.out.println(car);
        System.out.println(bus);
    }
}
