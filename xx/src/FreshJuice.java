public class FreshJuice {
    /* 枚举 */
    enum FreshJuiceSize{SMALL, MIDDLE, LARGE}
    FreshJuiceSize size;

    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MIDDLE;
        System.out.println(juice.size);
    }
}