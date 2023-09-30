package main.java.com.vlad_kostromin.basepatterns.structural.decorator;

public class AdminDecorator extends UserDecorator {

    public AdminDecorator(User user) {
        super(user);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with admin settings";
    }
}
