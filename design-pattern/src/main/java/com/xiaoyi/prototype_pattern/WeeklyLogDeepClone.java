package com.xiaoyi.prototype_pattern;

import java.io.*;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class WeeklyLogDeepClone implements Serializable {
    private  String name;
    private  String date;
    private  String content;
    private  Attachment attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public WeeklyLogDeepClone deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(this);

        // 将对象从流中读出
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (WeeklyLogDeepClone) objectInputStream.readObject();

    }
}
