package com.marina.tasks;

import java.util.Base64;

public class UserAutentification {
    public String pubName;
   private String privName;
   public String pubPassword;
    private String privPassword;

    public UserAutentification(String pubName, String privName, String pubPassword, String privPassword) {
        this.pubName = pubName;
        setPrivName(privName);
        this.pubPassword = pubPassword;
        setPrivPassword(privPassword);
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPrivName() {
        return privName;
    }

    public void setPrivName(String privName) {
        this.privName = privName;
    }

    public String getPubPassword() {
        return pubPassword;
    }

    public void setPubPassword(String pubPassword) {
        this.pubPassword = pubPassword;
    }

    public String getPrivPassword() {
        return privPassword;
    }

    public void setPrivPassword(String privPassword) {
        String encoded = Base64.getEncoder().encodeToString(privPassword.getBytes());
        this.privPassword = encoded;
    }

    @Override
    public String toString() {
        return "UserAutentification{" +
                "pubName='" + pubName + '\'' +
                ", privName='" + privName + '\'' +
                ", pubPassword='" + pubPassword + '\'' +
                ", privPassword='" + privPassword + '\'' +
                '}';
    }
}
