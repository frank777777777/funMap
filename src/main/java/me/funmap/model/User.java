package me.funmap.model;


public class User {
    private Long id;
    private String userName;
    private String passWord;

    protected User(){}

    public User(Long id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getpassWord() {
        return passWord;
    }

    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }


}
