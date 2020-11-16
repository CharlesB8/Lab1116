import java.util.ArrayList;

public class NintendoSwitch {

    String model;
    String leftJoyConColor;
    String rightJoyConColor;
    Boolean containsSD;
    ArrayList<String> gamesDownloaded = new ArrayList<String>();


    public NintendoSwitch() {}

    public NintendoSwitch(String model, String leftJoyConColor, String rightJoyConColor, Boolean containsSD, ArrayList<String> gamesDownloaded) {
        this.model = model;
        this.leftJoyConColor = leftJoyConColor;
        this.rightJoyConColor = rightJoyConColor;
        this.containsSD = containsSD;
        this.gamesDownloaded = gamesDownloaded;
    }

    public ArrayList<String> getGamesDownloaded() {
        return gamesDownloaded;
    }

    public void setGamesDownloaded(ArrayList<String> gamesDownloaded) {
        this.gamesDownloaded = gamesDownloaded;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLeftJoyConColor() {
        return leftJoyConColor;
    }

    public void setLeftJoyConColor(String leftJoyConColor) {
        this.leftJoyConColor = leftJoyConColor;
    }

    public String getRightJoyConColor() {
        return rightJoyConColor;
    }

    public void setRightJoyConColor(String rightJoyConColor) {
        this.rightJoyConColor = rightJoyConColor;
    }

    public Boolean getContainsSD() {
        return containsSD;
    }

    public void setContainsSD(Boolean containsSD) {
        this.containsSD = containsSD;
    }
}
