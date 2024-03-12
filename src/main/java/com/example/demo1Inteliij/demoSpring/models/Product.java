package com.example.demo1Inteliij.demoSpring.models;

import jakarta.persistence.*;

import javax.lang.model.element.Name;
import java.util.Calendar;
import java.util.Objects;


@Entity
@Table(name="tblProduct")
public class Product {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    you can also use "sequence"
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName= "product_sequence",
            allocationSize = 1 //increment by 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    //validate = constraint
    @Column(nullable = true, unique = true, length = 500)
    private String productName;
    private Double price;
    private int nam;
    private String url;

    //default constructor
    public Product() {
    }

    //calculated field = transient,not exist in mysql
    @Transient
    private int age;

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - nam;
    }

    public Product(String productName, Double price, int nam, String url) {
        this.productName = productName;
        this.price = price;
        this.nam = nam;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName='" + productName + '\'' + ", price=" + price + ", nam=" + nam + ", url='" + url + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return nam == product.nam && age == product.age && Objects.equals(id, product.id) && Objects.equals(productName, product.productName) && Objects.equals(price, product.price) && Objects.equals(url, product.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, price, nam, url, age);
    }
}
