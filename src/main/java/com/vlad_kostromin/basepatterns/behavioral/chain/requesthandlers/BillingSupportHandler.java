package main.java.com.vlad_kostromin.basepatterns.behavioral.chain.requesthandlers;

public class BillingSupportHandler extends SupportHandler {

    @Override
    protected void processRequest(CustomerRequest request) {
        System.out.println("Billing support is handling the request: " + request.getRequestDescription());
    }

    @Override
    protected boolean canHandle(CustomerRequest request) {
        return request.getRequestType().equalsIgnoreCase("billing");
    }
}
