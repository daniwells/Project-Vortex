/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author lid2jvl
 */
public class Session {
    private static Session instance;
    private String email;
    private String password;

    private Session(String password, String email) {
        setEmail(email);
        setPassword(password);
    }

    public static Session getInstance(String passwrod, String email) {
        if (instance == null) {
            instance = new Session(passwrod, email);
        }
        return instance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
