public class LenaHelp {
    public static void main(String[] args) {
        int i = 2400000;

        short s = 12;

        s = (short)i;

        int j = i << 16;
        System.out.println("i represents in bytes - " + Integer.toBinaryString(i));
        String ido =  Integer.toBinaryString(i);
        System.out.println(ido.length());

        System.out.println("1 - " + Integer.toBinaryString(j));

        System.out.println("1 - " + j);


        j = j >> 16;

        System.out.println("2 - " + Integer.toBinaryString(j));

        System.out.println("2 - " + j);



        System.out.println("---------------");

        System.out.println(j);

        System.out.println(s);
    }
}
