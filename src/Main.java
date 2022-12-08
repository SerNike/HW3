public class Main {
    public static void main(String[] args) {
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
    }
    public static void test1() {
        System.out.println("Задача 1");
// int, byte, short, long, float, double.
        int a = 2000000000;
        byte b = -10;
        short c = 32000;
        long d = 1000000000;
        float e = 2.5f;
        double q = 2.4;
    }
    public static void test2() {
        System.out.println("Задача 2");
       double e = 27.12;
       long b =987678965;
       double f =2.786;
       short q = 569;
       int c = -159;
       int d = 27897;
       byte a = 67;
       System.out.println(a + " " + b + " " + c + " " + e + " " + d + " " + q + " " + f );
    }
    public static void test3() {
        System.out.println("Задача 3");
        int a = 23;
        int b = 27;
        int c = 30;
        int d = 480;
        int f = d/(a + b + c);
        System.out.println("Листов достанется каждому ученику " + f);
    }
    public static void test4() {
        System.out.println("Задача 4");
        int a = 16;
        int b = 2;
        int c = a*20;
        System.out.println("за 20 минут произведенно " + c);
        int d = 24*60/b*16;
        System.out.println("в сутки произведенно " + d);
        int q = 3*24*60/b*16;
        System.out.println("за три дня произведенно " + q);
        int y = 31*24*60/b*16;
        System.out.println("за один месяц произведенно " + y);
    }
       public static void test5() {
        System.out.println("Задача 5");
        int a = 120;
        int b = 2;
        int c = 4;
        int f = a/(c+b);
        int w = f*b;
        int e = f*c;
        System.out.println("В школе, где " + f + " классов, нужно " + w + " банок белой краски и " + e + " банок коричневой краски");
       }
       public static void test6() {
        System.out.println("Задача 6");
    int a = 5*80;
    int b = 2*105;
    int c = 2*100;
    int e = 4*70;
    double s = a + b + c + e;
    double d = s/1000;
    System.out.println("вес завтрака в граммах " + s + " вес завтрака в кг " + d);
    }
    public static void test7() {
        System.out.println("Задача 7");
        int a = 7;
        int b =250;
        int c = 500;
        int d = a*1000/b;
        int q = a*1000/c;
        System.out.println(d + " столько дней понадобиться, если сбрасывать по " + b + " граммов и "  + q +
                " столько дней понадобиться, если сбрасывать по " + c + " граммов " +
                "в среднем худеть придется " +d/q + " дней ");
    }
    public static void test8(){
        System.out.println("Задача 8");
 int a = 67760;
 int b = 83690;
 int c = 76230;
double d = 1.1;

double masha = (a*d*12)-(a*12);
        double den = (b*d*12)-(b*12);
        double kristina = (c*d*12)-(c*12);
        System.out.println("Маша теперь получает " + a*d + " рублей. Годовой доход вырос на " + masha +  "рублей");
        System.out.println("Денис теперь получает " + b*d + " рублей. Годовой доход вырос на " + den +  "рублей");
        System.out.println("Кристина теперь получает " + c*d + " рублей. Годовой доход вырос на " + kristina +  "рублей");
    }


}