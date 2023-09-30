package main.java.com.vlad_kostromin.basepatterns.behavioral.chain;

import main.java.com.vlad_kostromin.basepatterns.behavioral.chain.requesthandlers.BillingSupportHandler;
import main.java.com.vlad_kostromin.basepatterns.behavioral.chain.requesthandlers.CustomerRequest;
import main.java.com.vlad_kostromin.basepatterns.behavioral.chain.requesthandlers.TechnicalSupportHandler;

public class RequestRunner {
    public static void main(String[] args) {
        TechnicalSupportHandler technicalSupportHandler = new TechnicalSupportHandler();
        BillingSupportHandler billingSupportHandler = new BillingSupportHandler();

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(technicalSupportHandler);

        CustomerRequest firstRequest = new CustomerRequest("Technical", "No internet connection.");
        CustomerRequest secondRequest = new CustomerRequest("Billing", "Issue with my payment");

        technicalSupportHandler.handleRequest(firstRequest);
        technicalSupportHandler.handleRequest(secondRequest);

        billingSupportHandler.handleRequest(firstRequest);
        billingSupportHandler.handleRequest(secondRequest);

    }
}
