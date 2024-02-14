public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD!");
        int a=10;
        float b=10.67f;
int g;

        char c ='a';
        double d=1234.56789;
        long e=87479449L;
        boolean f=true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //float to int
        g=(int)(b);
        System.out.println(g);
        // int to float
        float h;
        h=(float)(a);
        System.out.println(h);

// string cannot be converted to int
//        String i="amal";
//        i=(int)(i);
//        System.out.println(i);
        // int to byte takes only last two digits
        byte j;
        int k =102456;
        j=(byte)(k);
        System.out.println(j);
        double l=(a*j)+(b*d)-(c*e);
        System.out.println(l);
        System.out.println(a*j);
        System.out.println(b*d);
        System.out.println(c*e);
        // int*byte=int
        // float*double=double
        //char*long=long


    }
}
