import java.util.ArrayList;
import java.util.List;

class CommandInvoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void showHistory() {
        System.out.println("Command history: " + commandHistory.size() + " commands executed.");
    }
}
