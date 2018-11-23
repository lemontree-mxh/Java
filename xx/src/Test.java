public class Test {
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        int e = 60; /* 60 = 0011 1100 */
        int f = 13; /* 13 = 0000 1101 */
        int g = 0;
        boolean h = true;
        boolean i = false;

        int x,y;
        x = 10;

        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        System.out.println("a + b = " + (a + b ));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println(a);
        System.out.println("a++   = " +  (a++) );
        System.out.println(a);
        System.out.println("a--   = " +  (a--) );
        System.out.println(a);
        System.out.println("d++   = " +  (d++) );
        System.out.println(d);
        System.out.println("++d   = " +  (++d) );
        System.out.println(d);

        g = e & f;       /* 12 = 0000 1100 */
        System.out.println("e & f = " + g );

        g = e | f;       /* 61 = 0011 1101 */
        System.out.println("e | f = " + g );

        g = e ^ f;       /* 49 = 0011 0001 */
        System.out.println("e ^ f = " + g );

        g = ~e;          /*-61 = 1100 0011 */
        System.out.println("~e = " + g );

        g = e << 2;     /* 240 = 1111 0000 */
        System.out.println("e << 2 = " + g );
        g = e >> 2;     /* 215 = 1111 */
        System.out.println("e >> 2  = " + g );

        g = e >>> 2;     /* 215 = 0000 1111 */
        System.out.println("e >>> 2 = " + g );

        System.out.println("e && f = " + (h&&i));
        System.out.println("e || f = " + (h||i) );
        System.out.println("!(e && f) = " + !(h && i));

        y = ( x == 1 ) ? 20:30;
        System.out.println( "Value of y is : " +  y );
        y = ( x == 10 ) ? 20:30;
        System.out.println( "Value of y is : " +  y );

        String name = "James";
        boolean result = name instanceof String;
        System.out.println( result);
    }
}
