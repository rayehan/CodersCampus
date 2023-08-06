public class User {
    private String userName;
    private String name;
    private String passWord;

    public User(String userName, String name, String passWord){
        this.userName = userName;
        this.name = name;
        this.passWord = passWord;
    };

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserName() {
        return userName;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public String getPassWord(){
        return passWord;
    }
}
