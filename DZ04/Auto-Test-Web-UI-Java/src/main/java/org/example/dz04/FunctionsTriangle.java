package org.example.dz04;


/**
 * Created by Olga Shestakova
 * Date 28.08.2021
 */
public class FunctionsTriangle {

    public boolean areaOfTriangle(Integer a, Integer b, Integer c) {

        if (a + b < c) {
            return false;
        }
        if (a + c < b) {
            return false;
        }
        if (c + b < a) {
            return false;
        }
        return true;
    }

    //функция, вычисляющая площадь треугольника по трём сторонам

//    public static void main(String[] args) {
//
//        float a = 7;
//        float b = 7;
//        float c = 7;
//
//        float p = (a + b + c) / 2;
//        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//
//
//        System.out.println("Площадь треугольника = " + s);
//    }

}

