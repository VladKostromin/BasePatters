package main.java.com.vlad_kostromin.basepatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        User basicUser = new BasicUser();
        System.out.println("Description: " + basicUser.getDescription());

        User userWithAdminPanel = new AdminDecorator(basicUser);
        System.out.println("Description: " + userWithAdminPanel.getDescription());

        User userWithAdvancedPermissions = new AdvancedUserDecorator(basicUser);
        System.out.println("Description: " + userWithAdvancedPermissions.getDescription());

        User userWithMultipleOptions = new AdminDecorator(new AdvancedUserDecorator(basicUser));
        System.out.println("Description: " + userWithMultipleOptions.getDescription());
    }
}
