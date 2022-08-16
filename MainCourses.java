import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCourses {
    public static void main(String[] args) {
        // Course list
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java Course", 6.5f, 50, 200));
        courses.add(new Course("Python Course", 8.5f, 60, 800));
        courses.add(new Course("DB Course", 4.5f, 70, 700));
        courses.add(new Course("Android Course", 7.5f, 10, 400));
        courses.add(new Course("Writing Course", 1.5f, 10, 300));

        Stream<Course> courseStream = courses.stream();
        Comparator<Course> courseComparator = Comparator.comparing(course -> course.getDuration());

        // Exercise 1
//        int greaterThanFive = (int)courseStream
//              .filter(course -> course.getDuration() > 5f)
//              .count();
//        System.out.printf("Courses that last more than 5 hours: %d\n", greaterThanFive);

        // Exercise 2
//        int lessThanTwo = (int)courseStream
//              .filter(course -> course.getDuration() < 2f)
//              .count();
//        System.out.printf("Courses that last less than 2 hours: %d\n", lessThanTwo);

        // Exercise 3
//        System.out.println("Courses with more than 50 videos: ");
//        courseStream
//                .filter(course -> course.getVideos() > 50)
//                .forEach(course -> System.out.println("- " + course.getTitle()));

        // Exercise 4
//        System.out.println("Top 3 courses with the longest duration: ");
//        courseStream
//                .sorted(courseComparator.reversed())
//                .limit(3)
//                .forEach(course -> System.out.println("- " + course.getTitle()));

        // Exercise 5
//        double totalDuration = courseStream
//                .mapToDouble(course -> course.getDuration())
//                .sum();
//
//        System.out.printf("Total duration from all courses: %.2f", totalDuration);

        // Exercise 6
//        System.out.println("Courses whose duration is greater than the average:");
//        courseStream.filter(course -> {
//            double average = courses.stream()
//                    .mapToDouble(c -> c.getDuration())
//                    .average()
//                    .orElse(0);
//            return course.getDuration() > average;
//        }).forEach(course -> System.out.println(course));

        // Exercise 07
//        System.out.println("Duration of all courses with less than 500 students:");
//        courseStream
//                .filter(course -> course.getStudents() < 500)
//                .forEach(course -> System.out.println("- " + course.getDuration()));

        // Exercise 08
//        double longestDuration = courseStream.
//                mapToDouble(course -> course.getDuration())
//                .max()
//                .getAsDouble();
//        System.out.printf("Longest duration: %.2f hrs.\n", longestDuration);

        // Exercise 09
        System.out.println("Courses list");
        List<String> titles = courseStream
                                .map(course -> course.getTitle())
                                .collect(Collectors.toList());
        System.out.println(titles);

    }
}
