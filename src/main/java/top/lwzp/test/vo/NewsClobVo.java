package top.lwzp.test.vo;

import java.util.StringJoiner;

public class NewsClobVo {
    private String newsId;
    private String attrName;
    private String attrValue;
    private int age;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"newsId\":\"")
                .append(newsId).append('\"');
        sb.append(",\"attrName\":\"")
                .append(attrName).append('\"');
        sb.append(",\"attrValue\":\"")
                .append(attrValue).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append('}');
        return sb.toString().replace("\"null\"", "\"\"");
    }
}
