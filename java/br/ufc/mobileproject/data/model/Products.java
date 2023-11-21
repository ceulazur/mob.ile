package br.ufc.mobileproject.data.model;

public class Products {
    private String p_name, p_description, p_price, p_image, p_category, p_data, p_time;

    public Products(String p_name, String p_description, String p_price, String p_image, String p_category, String p_data, String p_time) {
        this.p_name = p_name;
        this.p_description = p_description;
        this.p_price = p_price;
        this.p_image = p_image;
        this.p_category = p_category;
        this.p_data = p_data;
        this.p_time = p_time;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_description() {
        return p_description;
    }

    public void setP_description(String p_description) {
        this.p_description = p_description;
    }

    public String getP_price() {
        return p_price;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

    public String getP_image() {
        return p_image;
    }

    public void setP_image(String p_image) {
        this.p_image = p_image;
    }

    public String getP_category() {
        return p_category;
    }

    public void setP_category(String p_category) {
        this.p_category = p_category;
    }

    public String getP_data() {
        return p_data;
    }

    public void setP_data(String p_data) {
        this.p_data = p_data;
    }

    public String getP_time() {
        return p_time;
    }

    public void setP_time(String p_time) {
        this.p_time = p_time;
    }
}
