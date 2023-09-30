package main.java.com.vlad_kostromin.basepatterns.behavioral.iterator;

public class TaskRunner {
    public static void main(String[] args) {
        Task[] tasks = {
                new Task("Study Java", 100),
                new Task("Eat", 80),
                new Task("Sleep", 10)
        };
        ToDoList myToDoList = new ToDoList("Daily routine", tasks);
        Iterator iterator = myToDoList.getIterator();
        System.out.println("Name of to do list: " + myToDoList.getNameOfList());
        System.out.println("Tasks:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
