package main.java.com.vlad_kostromin.basepatterns.behavioral.iterator;

public class ToDoList implements Collection{
    private String nameOfList;
    private Task[] tasks;

    public ToDoList(String nameOfList, Task[] tasks) {
        this.nameOfList = nameOfList;
        this.tasks = tasks;
    }

    public String getNameOfList() {
        return nameOfList;
    }

    public void setNameOfList(String nameOfList) {
        this.nameOfList = nameOfList;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index < tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
