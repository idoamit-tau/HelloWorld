public class Exmple2 {
    public static void main(String[] args) {
        int num1 = 15;
        boolean b1 = func1(num1);
        boolean b2 = func2(num1);
        System.out.println("and :" + (b1 && b2));
        System.out.println("or :" + (b1 || b2));
        System.out.println("------------------");
        System.out.println("-- calculating b3: ");
        boolean b3 = func1(num1) && func2(num1); //*
        System.out.println("-- calculating b4: ");
        boolean b4 = func1(num1) || func2(num1); //**
        System.out.println("not :" + !b4);
    }
    public static boolean func1(int x) {
        System.out.println("func1");
        return x > 10;
    }
    public static boolean func2(int x) {
        System.out.println("func2");
        return x % 2 == 0; //% is modulo, same as in Python
    }
}
