package main.java.com.vlad_kostromin.basepatterns.behavioral.template;

public abstract class Beverage {
    private boolean condiments;

    public Beverage(String condiments) {
        if(condiments.equalsIgnoreCase("yes")){
            this.condiments = true;
        } else {
            this.condiments = false;
        }

    }

    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return condiments;
    }

}
