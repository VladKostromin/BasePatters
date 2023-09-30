package main.java.com.vlad_kostromin.basepatterns.behavioral.chain.requesthandlers;

public abstract class SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(CustomerRequest request) {
        if(canHandle(request)) {
            processRequest(request);
        } else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Unable to proceed request");
        }
    }

    protected abstract void processRequest(CustomerRequest request);
    protected abstract boolean canHandle(CustomerRequest request);

}
