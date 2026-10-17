public class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public void markDone(){
        this.isDone = true;
    }

    @Override
    public String toString(){
    return (isDone ? "[+] ":" [ ]") + description;
    }
}
