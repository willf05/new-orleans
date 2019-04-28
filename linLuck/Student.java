package lInLuck;

public class Student {
    int rating;
    private String name;
    private static int sumRating;
    private static int studentsQty;
    private static double avgRating;

    // TODO implement Student class according to the instructions providede in the README.md file -- DONE
    public static void main(String[] args) {
        Student s1 = new Student("Theodor");
        Student s2 = new Student("Barnaby");
        Student s3 = new Student("Marshall");
        s1.setRating(372);
        s2.setRating(362);
        s3.setRating(364);
        System.out.println(getAvgRating());
        s1.changeRating(378);
        System.out.println(getAvgRating());
    }

    public Student(String name) {
        //TODO initialize name -- DONE
        this.name = name;
    }

    public static double getAvgRating() {
        // TODO return average rating of all students -- DONE
        if (studentsQty > 0) {
            avgRating = sumRating / studentsQty;
        } else avgRating = 0;
        return avgRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO set student's name -- DONE
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        // TODO initialize rating; -- DONE
        this.rating = rating;
        sumRating += rating;
        studentsQty += 1;
        getAvgRating();
    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with student's rating -- DONE
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average raiting of all students -- DONE
        sumRating = sumRating - this.rating + rating;
        this.rating = rating;
        getAvgRating();
    }

    public static void removeStudent(Student student) {
        // TODO remove student -- DONE
        sumRating -= student.getRating();
        studentsQty -= 1;
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student -- DONE
        return ("Name: " + this.name + ", Rating: " + this.rating);
    }
}