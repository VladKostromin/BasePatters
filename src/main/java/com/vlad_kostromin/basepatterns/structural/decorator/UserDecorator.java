package main.java.com.vlad_kostromin.basepatterns.structural.decorator;

public class UserDecorator implements User {
    User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription();
    }
}
