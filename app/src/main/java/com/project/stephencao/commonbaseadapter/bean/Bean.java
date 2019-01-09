package com.project.stephencao.commonbaseadapter.bean;

public class Bean {
    private String title;
    private String description;
    private String date;
    private String phone;
    private boolean isChecked;

    public Bean(String title, String descrpition, String date, String phone) {
        this.title = title;
        this.description = descrpition;
        this.date = date;
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
