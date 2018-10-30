public class mongodatabase implements Database{
    @Override
    public void initcluster() {
        System.out.println("MongoDB");
    }

    @Override
    public void addnode() {
        System.out.println("addnode");
    }
}
