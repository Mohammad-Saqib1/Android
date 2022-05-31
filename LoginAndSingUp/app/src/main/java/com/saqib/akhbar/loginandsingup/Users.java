package com.saqib.akhbar.loginandsingup;

public class Users {

    String personName,emailId,Password,pic;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Users(String personName, String emailId, String password, String pic) {
        this.personName = personName;
        this.emailId = emailId;
        Password = password;
        this.pic = pic;
    }

    public Users(){

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Users(String personName, String emailId, String password) {
        this.personName = personName;
        this.emailId = emailId;
        Password = password;
    }
}
