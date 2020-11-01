package com.marina.generics;

public class Box <T>{

    private T content;
    private T content2;

    public T getContent2() {
        return content2;
    }

    public void setContent2(T content2) {
        this.content2 = content2;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getContentType(){
        return content.getClass().getName();
    }

    public String getContent2Type(){
        return content2.getClass().getName();
    }

    @Override
    public String toString() {
        return content.toString() + ", "+ content2.toString();
    }
}
