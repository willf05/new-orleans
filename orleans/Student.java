package orleans;

public class Student {

    private String name;
    private double rating;
    private static double sumRating;
    private static int studentsQty;
    private static double avgRating;

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public Student() {
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        sumRating = sumRating + rating;
        studentsQty++;
        avgRating = sumRating/studentsQty;
    }

    public static boolean isFirstBetterStudent(double a, double b) {
        return (a > b);
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ", Rating: " + this.rating);
    }

    public void changeRating(double newRating) {
        sumRating = sumRating - rating + newRating;
        this.rating = newRating;
        avgRating = sumRating/studentsQty;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Theodor", 3.72);
        Student s2 = new Student("Barnaby", 3.62);
        Student s3 = new Student("Marshall", 3.64);

//        double avgRating = sumRating / studentsQty;
        System.out.println("Average rating is " + avgRating);
//        System.out.println(s2.toString());

        s1.changeRating(3.78);
//        System.out.println(s1.getRating());
//        System.out.println(sumRating);
        System.out.println("Average rating is " + String.format("%.2f", avgRating));
    }
}
