package com.ceva.coding_test1.Models;

public class User {
    private int id;
    private int userID;
    private String employeeID;
    private String siteName;
    private String businessUnitName;
    private String accountName;
    private String groupName;
    private String categoryName;
    private String typeName;
    private String date;
    private String duration;
    private boolean isProcessed;
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getBusinessUnitName() {
        return this.businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isIsProcessed() {
        return this.isProcessed;
    }

    public boolean getIsProcessed() {
        return this.isProcessed;
    }

    public void setIsProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    public User(int id, int userID, String employeeID, String siteName, String businessUnitName, String accountName, String groupName, String categoryName, String typeName, String date, String duration, boolean isProcessed) {
        this.id = id;
        this.userID = userID;
        this.employeeID = employeeID;
        this.siteName = siteName;
        this.businessUnitName = businessUnitName;
        this.accountName = accountName;
        this.groupName = groupName;
        this.categoryName = categoryName;
        this.typeName = typeName;
        this.date = date;
        this.duration = duration;
        this.isProcessed = isProcessed;
    }
    
}
