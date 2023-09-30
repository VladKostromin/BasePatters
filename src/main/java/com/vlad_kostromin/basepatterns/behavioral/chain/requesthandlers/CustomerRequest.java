package main.java.com.vlad_kostromin.basepatterns.behavioral.chain.requesthandlers;

public class CustomerRequest {
    private String requestType;
    private String requestDescription;

    public CustomerRequest(String requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    protected String getRequestType() {
        return requestType;
    }

    protected String getRequestDescription() {
        return requestDescription;
    }
}
