package tn.smi.refproject.DTO;

public class ActivityResponse {

    private String primaryActivity;
    private String secondaryActivity;

    public ActivityResponse(String primaryActivity, String secondaryActivity) {
        this.primaryActivity = primaryActivity;
        this.secondaryActivity = secondaryActivity;
    }

    // Getters and Setters
    public String getPrimaryActivity() {
        return primaryActivity;
    }

    public void setPrimaryActivity(String primaryActivity) {
        this.primaryActivity = primaryActivity;
    }

    public String getSecondaryActivity() {
        return secondaryActivity;
    }

    public void setSecondaryActivity(String secondaryActivity) {
        this.secondaryActivity = secondaryActivity;
    }
}