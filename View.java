import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class View extends VBox
{
    private ImageView imageView;
    private Label firstNameLabel;
    private Label lastNameLabel;
    private Label studentNumberLabel;
    private Label favoriteActivitiesLabel;

    public View()
    {
        imageView = new ImageView();
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        firstNameLabel = new Label();
        lastNameLabel = new Label();
        studentNumberLabel = new Label();
        favoriteActivitiesLabel = new Label();
        favoriteActivitiesLabel.setWrapText(true);

        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));
        setSpacing(10);
        getChildren().addAll(imageView, firstNameLabel, lastNameLabel, studentNumberLabel, favoriteActivitiesLabel);

    }

    public void update(StudentCard student)
    {
        if(student == null) {
            imageView.setImage(null);
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            studentNumberLabel.setText("");
            favoriteActivitiesLabel.setText("");
        } else {
            imageView.setImage(new Image(student.getImageUrl()));
            firstNameLabel.setText(student.getFirstName());
            lastNameLabel.setText(student.getLastName());
            studentNumberLabel.setText("Student Number: " + student.getStudentNumber());
            favoriteActivitiesLabel.setText("Favorite Activities: " + String.join(", ", student.getFavoriteActivities()));
        }
    }
}