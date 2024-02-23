package patterns.adapter;

public class AdapteeToClientAdapter implements Adapter {
    private final Adaptee instance;

    public AdapteeToClientAdapter(final Adaptee instance) {
        this.instance = instance;
    }

    @Override
    public void request() {
        // Here you would call then the Adaptee's specificRequest()
        instance.specificRequest();
    }

}

