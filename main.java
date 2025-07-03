public class main {
    public static void main(String[] args) {
        Task task = new Task(
                "Написать код",
                LocalDateTime.of(2025, 12, 31, 23, 25),
                false
        );
        System.out.println(task);
    }
}
