package Bai15TH;

import java.util.Date;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int productStatus;

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, Date created, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        if (productId.matches("^[CSA].{3}$")) { // Regex to ensure the ID format
            this.productId = productId;
        } else {
            throw new IllegalArgumentException("Product ID must start with C, S, or A and be 4 characters long.");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName.length() >= 10 && productName.length() <= 50) {
            this.productName = productName;
        } else {
            throw new IllegalArgumentException("Product name must be between 10 and 50 characters.");
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        if (productStatus >= 0 && productStatus <= 2) {
            this.productStatus = productStatus;
        } else {
            throw new IllegalArgumentException("Product status must be 0, 1, or 2.");
        }
    }

    public void inputData() {
        // Implementation for inputting product data
    }

    public void displayData() {
        // Implementation for displaying product data
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Price: " + price +
                ", Description: " + description +
                ", Created: " + created +
                ", Catalog ID: " + catalogId +
                ", Status: " + productStatus;
    }
}
