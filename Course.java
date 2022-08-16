public class Course {
    private String title;
    private float duration;
    private int videos, students;

    public Course(String title, float duration, int videos, int students) {
        this.title = title;
        this.duration = duration;
        this.videos = videos;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Title: " + title
                + " Duration: " + duration
                + " Videos: " + videos
                + " Students: " + students;
    }
}
