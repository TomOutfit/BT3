package test;

import model.GiaoVien;
import model.Hocsinh;
import model.Monhoc;

public class Main {
    public static void main(String[] args) {
        GiaoVien a = new GiaoVien("a1","A", "012932332", "nhameo");
        System.out.println(a.toString());
        Hocsinh b = new Hocsinh("b1", "B", "012937328", "nhaheo", "Girl");
        System.out.println(b.toString());
        Monhoc c = new Monhoc("c1", "Physic");
        System.out.println(c.toString());
    }
}
