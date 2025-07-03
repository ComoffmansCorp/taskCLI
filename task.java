import java.time.LocalDateTime;

public class task {
    private String nameTask;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private boolean isCompleted;

    public task(String name, LocalDateTime dateEnd, boolean isCompleted) {
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


}
