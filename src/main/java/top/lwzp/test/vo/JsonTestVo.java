package top.lwzp.test.vo;

import java.util.Date;

public class JsonTestVo {
    public JsonTestVo(int age,String name,Date date){
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public JsonTestVo(){}

    private int age;
    private String name;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"age\":")
                .append(age);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append('}');
        return sb.toString().replace("\"null\"", "\"\"");
    }
}
