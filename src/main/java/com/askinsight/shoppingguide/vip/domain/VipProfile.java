package com.askinsight.shoppingguide.vip.domain;

import java.util.Date;

/**
 * Created by Johnson on 2015/1/7.
 */
public class VipProfile {
    private Long id;
    private String name;
    private String nickName;
    private String telephone;
    private String wechat;
    private Date birthday;
    private String cardNo;
    private String occupation;
    private String topSize;
    private String bottomSize;
    private Integer height;
    private Integer shoesCode;
    private String address;
    private String appearance;
    private String characteristic;
    private String appId;
    private Date createDate;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTopSize() {
        return topSize;
    }

    public void setTopSize(String topSize) {
        this.topSize = topSize;
    }

    public String getBottomSize() {
        return bottomSize;
    }

    public void setBottomSize(String bottomSize) {
        this.bottomSize = bottomSize;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getShoesCode() {
        return shoesCode;
    }

    public void setShoesCode(Integer shoesCode) {
        this.shoesCode = shoesCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
