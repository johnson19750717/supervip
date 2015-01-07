package com.askinsight.shoppingguide.vip.domain;

/**
 * Created by Johnson on 2015/1/7.
 */
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String bigCategory;
    private String middleCategory;
    private String smallCategory;
    private Integer gender;
    private Integer season;
    private Integer color;
    private Integer size;
    private String material;
    private String functions;
    private String technology;
    private String placeOfOrigin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBigCategory() {
        return bigCategory;
    }

    public void setBigCategory(String bigCategory) {
        this.bigCategory = bigCategory;
    }

    public String getMiddleCategory() {
        return middleCategory;
    }

    public void setMiddleCategory(String middleCategory) {
        this.middleCategory = middleCategory;
    }

    public String getSmallCategory() {
        return smallCategory;
    }

    public void setSmallCategory(String smallCategory) {
        this.smallCategory = smallCategory;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }
}
