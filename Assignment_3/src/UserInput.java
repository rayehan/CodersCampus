public class UserInput {
    private String userName;
    private String eMail;
    private String passWord;

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserName() {
        return userName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public String getPassWord(){
        return passWord;
    }
}
