package SDP_5;

public class DataModel {
    private String data;

    public DataModel(String initialData) {
        this.data = initialData;
    }

    public String getData() {
        return data;
    }

    public void setData(String newData) {
        this.data = newData;
    }

    public void appendData(String moreData) {
        this.data = this.data + " | " + moreData;
    }
}
