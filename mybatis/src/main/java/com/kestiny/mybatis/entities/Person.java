package com.kestiny.mybatis.entities;

import java.sql.Timestamp;

public class Person {
    private Integer nid;
    private String account;
    private String name;
    private Integer sex;
    private String pswd;
    private Integer school;
    private Integer status;
    private Integer delFlag;
    private String mobile;
    private String uid18;
    private String nickname;
    private Integer gold;
    private Integer experience;
    private String iconUrl;
    private Integer classId;
    private Integer clothId;
    private Integer weaponId;
    private Integer wingsId;
    private Integer personType;
    private Integer onlineTime;
    private Timestamp lastLoginTime;
    private Integer examNumber;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public Integer getSchool() {
        return school;
    }

    public void setSchool(Integer school) {
        this.school = school;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUid18() {
        return uid18;
    }

    public void setUid18(String uid18) {
        this.uid18 = uid18;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getClothId() {
        return clothId;
    }

    public void setClothId(Integer clothId) {
        this.clothId = clothId;
    }

    public Integer getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Integer weaponId) {
        this.weaponId = weaponId;
    }

    public Integer getWingsId() {
        return wingsId;
    }

    public void setWingsId(Integer wingsId) {
        this.wingsId = wingsId;
    }

    public Integer getPersonType() {
        return personType;
    }

    public void setPersonType(Integer personType) {
        this.personType = personType;
    }

    public Integer getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Integer onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(Integer examNumber) {
        this.examNumber = examNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nid=" + nid +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", pswd='" + pswd + '\'' +
                ", school=" + school +
                ", status=" + status +
                ", delFlag=" + delFlag +
                ", mobile='" + mobile + '\'' +
                ", uid18='" + uid18 + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gold=" + gold +
                ", experience=" + experience +
                ", iconUrl='" + iconUrl + '\'' +
                ", classId=" + classId +
                ", clothId=" + clothId +
                ", weaponId=" + weaponId +
                ", wingsId=" + wingsId +
                ", personType=" + personType +
                ", onlineTime=" + onlineTime +
                ", lastLoginTime=" + lastLoginTime +
                ", examNumber=" + examNumber +
                '}';
    }
}
