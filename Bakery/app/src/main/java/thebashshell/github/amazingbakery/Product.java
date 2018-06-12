package thebashshell.github.amazingbakery;

import android.graphics.drawable.Drawable;

class Product {
    private int id;
    private int category;
    private double price;
    private Drawable image;
    private String description;
    private String name;
    private String keywords;
    private int brand;

    public Product(int id, int category, double price, Drawable image, String description, String name) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.image = image;
        this.description = description;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category=" + category +
                ", price=" + price +
                ", image=" + image +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

