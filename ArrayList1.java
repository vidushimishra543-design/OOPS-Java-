import java.util.*;

public class ArrayList1 {
    public static void addMarks(List<Integer> marks, int mark) {
        marks.add(mark);
    }

    public static double calculateAverage(List<Integer> marks) {
        double sum = 0.0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public static int findHighest(List<Integer> marks) {
        int max = marks.get(0);
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) > max) {
                max = marks.get(i);
            }
        }
        return max;
    }

    public static void displayMarks(List<Integer> marks) {
        System.out.println("Marks are:");
        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        addMarks(marks, 85);
        addMarks(marks, 90);
        addMarks(marks, 78);
        addMarks(marks, 92);
        addMarks(marks, 88);
        displayMarks(marks);
        double average = calculateAverage(marks);
        System.out.println("Average marks: " + average);
        int highest = findHighest(marks);
        System.out.println("Highest marks: " + highest);
        displayMarks(marks);
    }
}