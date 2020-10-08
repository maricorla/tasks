package com.marina.tasks;

public class Banknote {
   private int twenty;
   private int fifty;
   private int oneHundred;

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getOneHundred() {
        return oneHundred;
    }

    public void setOneHundred(int oneHundred) {
        this.oneHundred = oneHundred;
    }

    public Banknote(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }

    public int makeSum(){
        int sumResult = (twenty*20)+ (fifty*50) + (oneHundred*100);
        return sumResult;
    }

    public void addMoney(int twenty,int fifty, int oneHundred){
        this.twenty +=twenty;
        this.fifty += fifty;
        this.oneHundred +=oneHundred;

    }
}
