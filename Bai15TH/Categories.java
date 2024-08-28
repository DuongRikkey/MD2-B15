package Bai15TH;

public class Categories {
    private static int autoIncrementId = 1;
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    public Categories() {
        this.catalogId = autoIncrementId++;
    }

    public Categories(String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = autoIncrementId++;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    // Getters and Setters
    public int getCatalogId() {
        return catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        if (catalogName.length() <= 50) {
            this.catalogName = catalogName;
        } else {
            throw new IllegalArgumentException("Catalog name must be 50 characters or less.");
        }
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public void inputData() {
        // Implementation for inputting category data (use Scanner for input)
    }

    public void displayData() {
        // Implementation for displaying category data
    }

    @Override
    public String toString() {
        return "Category ID: " + catalogId +
                ", Name: " + catalogName +
                ", Description: " + descriptions +
                ", Status: " + (catalogStatus ? "Active" : "Inactive");
    }
}

