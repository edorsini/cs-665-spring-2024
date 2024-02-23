package patterns.adapter;

public class OldWay implements Adapter {
    @Override
    public void request() {
        System.out.println("It does a computation the old way...");
    }
}
