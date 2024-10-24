package SDP_5;

public class Main {
    public static void main(String[] args) {
        // Initialize the Model, View, and Presenter
        DataModel model = new DataModel("Initial Data");
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Run the Presenter logic
        presenter.updateData();
        presenter.combineData();
    }
}
