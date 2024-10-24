package SDP_5;

public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void updateData() {
        view.displayData(model.getData());
        String newData = view.promptForData();
        model.setData(newData);
        view.displayData("Data updated to: " + model.getData());
    }

    public void combineData() {
        String moreData = view.promptForMoreData();
        model.appendData(moreData);
        view.displayFinalData(model.getData());
    }
}
