package top.lwzp.test.vo;

import java.util.Date;

public class RestTemplateTestVo {
    private int age;
    private String name;
    private Date date;

    public RestTemplateTestVo(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public RestTemplateTestVo() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
