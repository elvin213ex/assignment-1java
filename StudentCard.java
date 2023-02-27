import java.util.List;

public class StudentCard {
    String firstName;
     String lastName;
    int studentNumber;
     List<String> favoriteActivities;
     String imageUrl;

    public StudentCard(String firstName, String lastName, int studentNumber, List<String> favoriteActivities, String imageUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.favoriteActivities = favoriteActivities;
        this.imageUrl = imageUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public List<String> getFavoriteActivities() {
        return favoriteActivities;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
