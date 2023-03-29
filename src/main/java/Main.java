import java.util.Scanner;
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Notebook notebook = new Notebook();

        choiceTasks(notebook);

        scanner.close();
    }
    public static void choiceTasks(Notebook notebook) {
        notebook.descriptionOperations();

        while (true) {
            System.out.print("Выберите команду >> ");
            String inputTeam = scanner.nextLine();

            if (inputTeam.equalsIgnoreCase("end")) {
                notebook.outputTasks();
                System.out.println("Программа завершена");
                return;
            } else if (inputTeam.equals("1")) {
                System.out.print("Введите задачу:\n >> ");
                String inputTask = scanner.nextLine();
                notebook.addTasks(inputTask);
            } else if (inputTeam.equals("2")) {
                notebook.emptyList();
                System.out.println("Выберите порядковый номер задачи для удаления");
                notebook.outputTasks();
                System.out.print(" >> ");
                String inputIndex = scanner.nextLine();
                notebook.deleteTask(inputIndex);
            } else if (inputTeam.equals("3")) {
                notebook.emptyList();
                notebook.outputTasks();
            } else if (inputTeam.equals("4")) {
                notebook.emptyList();
                System.out.println("Вы действительно хотите очистить весь список задач? "
                        + "(Ведите \"Да\" для подтверждения или \"Нет\" для отмены)");
                notebook.outputTasks();
                System.out.print(" >> ");
                String inputVerificatoin = scanner.nextLine();
                notebook.clearList(inputVerificatoin);
            } else
                System.out.println("Введена не верная команда");
        }
    }
}
