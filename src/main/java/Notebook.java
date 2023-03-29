import java.util.*;
public class Notebook {

    private final List<String> tasks;

    public Notebook() {
        tasks = new ArrayList<>();
    }
    public void descriptionOperations() {
        System.out.println("Для работы с электронной записной книжкой выберите команду:"
                + "\n1 - Добавление новой задачи" + "\n2 - Удаление задачи из списка" + "\n3 - Просмотр списка задач"
                + "\n4 - Удалить все задачи" + "\n\"end\" - Выход\n");
    }
    public List<String> addTasks(String inputTask) {
        tasks.add(inputTask);
        return tasks;
    }
    public List<String> deleteTask(String inputIndex) {
        try {
            int index = Integer.parseInt(inputIndex);
            tasks.remove(index - 1);
            outputTasks();
        } catch (Exception exception) {
            System.out.println("Введена не верная команда");
        }
        return tasks;
    }
    public void outputTasks() {
        if (emptyList()) {
            return;
        }
        System.out.println("Список дел:");
        int i = 1;
        for (String task : tasks) {
            System.out.println(i + ". " + task);
            i++;
        }
    }
    public List<String> clearList(String inputVerificatoin) {
        if ("да".equalsIgnoreCase(inputVerificatoin)) {
            tasks.clear();
            outputTasks();
        } else {
            System.out.println("Удаление отменено");
        }
        return tasks;
    }
    public boolean emptyList() {
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст");
            return true;
        }
        return false;
    }
}