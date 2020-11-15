package main;

import model.IPhone;

public class Lesson_5 {
    public static void main(String[] args) {
        //inheritance example
        String model = "IPhone 12 Pro";
        String country = "USA";
        int year = 2020;
        int price = 1000;
        IPhone phone = new IPhone(model, country, price, year);
        phone.setTouchId(true);
        phone.setHasFaceId(true);
        phone.setHasBatteryCharger(false);
        System.out.println("----------" + phone.getModel() + "-----------");
        phone.printInfo();
        phone.discount();
        System.out.println("-------------------------------------");


        //string functions
        System.out.println("***String functions***");
        char arr[] = {'H', 'e', 'l', 'l', 'o'};
        String s1 = new String(arr);
        System.out.println(s1);

        char c;
        c = "s1".charAt(1);
        System.out.println(c);

        String s2="Hello",s3="HELLO";
        System.out.println(s2.equalsIgnoreCase(s3));

        System.out.println("Hi Armenia".startsWith("Hi"));
        String s4 = "Hello".replace('l', 'w');
        String s5 = " Hello Hello      ".trim();
        System.out.println(s4);
        System.out.println(s5);

        String r = String.join(" ", "One", "Two", "Three");
        System.out.println(r);

        //stringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println( sb);
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println( sb);
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.insert(5,"World!");
        System.out.println(sb1);
//        String a="ABABABA";
//        for (int i = 0; i < a.length(); i++) {
//            a[i]='c';
//        }

    }
}
