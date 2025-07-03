import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String nameTask;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private boolean isCompleted;

    public Task(String name, LocalDateTime dateEnd, boolean isCompleted) {
        this.nameTask = name;
        this.dateStart = LocalDateTime.now();
        this.dateEnd = dateEnd;
        this.isCompleted = isCompleted;
    }

    public void setName( String nameTask) { this.nameTask = nameTask; }
    public void setDateStart( LocalDateTime dateStart ) { this.dateStart = dateStart; }
    public void setDateEnd ( LocalDateTime dateEnd )  { this.dateEnd = dateEnd; }
    public void setIsCompleted ( boolean isCompleted ) { this.isCompleted = isCompleted; }

    public String getNameTask() { return nameTask; }
    public LocalDateTime getDateStart() { return dateStart; }
    public LocalDateTime getDateEnd() { return dateEnd; }
    public boolean getIsCompleted() { return isCompleted; }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
        return String.format(
            "Задача: %s | Начало: %s | Конец: %s | Статус: %s",
                    nameTask,
                    dateStart.format(formatter),
                    dateEnd.format(formatter),
                    isCompleted ? "Выполнено" : "Не выполнено"
        );
    }
}
