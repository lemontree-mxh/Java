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
        System.out.println(result);

        int a1 = 10;
        while(a1 < 20){
            System.out.println("value of a1 : " + a1);
            a1++;
        }
        System.out.print("\n");

        int a2 = 10;
        do{
            System.out.println("value of a2 : " + a2);
            a2++;
        }while (a2 < 20);
        System.out.print("\n");

        for(int a3 = 10;a3 < 20; a3++){
            System.out.println("value of a3 : " + a3);
        }
        System.out.print("\n");

        int [] numbers = {10,20,30,40,50};
        for(int a4 : numbers){
            System.out.print(a4);
            System.out.print(",");
        }
        System.out.print("\n");

        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String a5 : names){
            System.out.print(a5);
            System.out.print(",");
        }
        System.out.print("\n");

        for (int a6 : numbers){
            if (a6 == 30){
                break;
            }
            System.out.println(a6);
        }
        System.out.print("\n");

        for (int a6 : numbers){
            if (a6 == 30){
                continue;
            }
            System.out.println(a6);
        }
        System.out.print("\n");

        int a7 = 30;

        if (a7 < 20){
            System.out.print("这是if语句");
        }else {
            System.out.print("这是else语句");
        }
        System.out.print("\n");

        if (a7 == 10){
            System.out.print("Value of a7 is 10");
        }else if (a7 == 20){
            System.out.print("Value of a7 is 20");
        }else if (a7 == 30){
            System.out.print("Value of a7 is 30");
        }else {
            System.out.print("这是else语句");
        }
        System.out.print("\n");

        char grade = 'D';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要继续努力");
                //break;
            default :
                System.out.println("无效等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
