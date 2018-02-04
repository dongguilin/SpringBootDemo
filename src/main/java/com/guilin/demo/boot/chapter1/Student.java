package com.guilin.demo.boot.chapter1;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by dongguilin on 2018/2/4.
 */
public class Student {
    private int id;
    private String name;
    private int age;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss.S")
    private Date birthday;

    @JSONField(serialize = false)
    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
