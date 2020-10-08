package com.marina.tasks;

public class TimeRunner {
    public static void main(String[] args) {
        PieceOfTime myPiece = new PieceOfTime(20, 45,20);
        //int resultSec = myPiece.countSpanHoursSec();
        System.out.println(myPiece.countSpanHoursSec());

        PieceOfTime spanTime = new PieceOfTime(66310);

        String result = "" + spanTime.countSeconds(); //spanTime.countSpanHoursSec();
        System.out.println(result);

        int check = PieceOfTime.compareObjects(spanTime,myPiece);
        if(check==0){
            System.out.println(myPiece.countSpanHoursSec() + " is equal to  "+ spanTime.countSpanHoursSec());
        }else if(check<0){
            System.out.println(myPiece.countSpanHoursSec() + " is less than "+ spanTime.countSpanHoursSec());
        }else{
            System.out.println(spanTime.countSpanHoursSec() + " is less than " + myPiece.countSpanHoursSec());
        }


    }
}
