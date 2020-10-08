package com.marina.tasks;

public class  PubPrivRunner {
    public static void main(String[] args) {
        UserAutentification user = new UserAutentification("Vasya", "Vasiliy", "password", "password");
       /* System.out.println(user);
        user.pubPassword = "loh";
        user.pubName = "loh";
        System.out.println(user);*/

        System.out.println("user private password is "+user.getPrivPassword());
    }
}
