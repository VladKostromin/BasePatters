package main.java.com.vlad_kostromin.basepatterns.structural.decorator;

public class AdvancedUserDecorator extends UserDecorator{
    public AdvancedUserDecorator(User user) {
        super(user);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with advanced user settings";
    }
}
