package model;

public class Akun{
    private String name;
    private String email;
    private String noHp;
    private String password;

    public Akun setName(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Akun setnoHp(String NoHp) {
        this.noHp = NoHp ;
        return this;
    }
    public String getnoHp() {
        return this.noHp;
    }

    public Akun setPassword(String password) {
    this.password = password;
    return this;
    }
    public String getPassword() {
        return this.password;
    }
}