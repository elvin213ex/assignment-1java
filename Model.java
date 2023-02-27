import javafx.scene.Scene;
import javafx.stage.Stage;

public class Model
{
    private StudentCard model;
    private View view;
    private Stage stage;

    public Model(StudentCard model)
    {
        this.model = model;
        view = new View();
        view.update(model);
        view.setOnMouseClicked(event ->
        {
            System.out.println("Clicked on student card for " + model.getFirstName() + " " + model.getLastName());
        });
    }

    public void show(Stage stage)
    {
        this.stage = stage;
        stage.setTitle("Student Card");
        Scene scene = new Scene(view);
        stage.setScene(scene);
        stage.show();
    }
}