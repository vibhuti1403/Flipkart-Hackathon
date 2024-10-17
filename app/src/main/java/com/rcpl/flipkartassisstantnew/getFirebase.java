package com.rcpl.flipkartassisstantnew;

public class getFirebase {
    String Name;

    public getFirebase(String name, String imageUrl, int price) {
        Name = name;
        ImageUrl = imageUrl;
        this.price = price;
    }

    String ImageUrl;
    int price;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
