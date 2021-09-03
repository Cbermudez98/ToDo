/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Auxiliar
 */
public class User {
    
    private int id;
    private String user;
    private String name;
    private String lName;
    private String email;
    private String phone;
    private int age;
    private String secureQuestion;
    private String answerQuestion;
    private String password;

    public User() {
    }

    public User(int id, String user, String name, String lName, String email, String phone, int age, String secureQuestion, String answerQuestion, String password) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.secureQuestion = secureQuestion;
        this.answerQuestion = answerQuestion;
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the secureQuestion
     */
    public String getSecureQuestion() {
        return secureQuestion;
    }

    /**
     * @param secureQuestion the secureQuestion to set
     */
    public void setSecureQuestion(String secureQuestion) {
        this.secureQuestion = secureQuestion;
    }

    /**
     * @return the answerQuestion
     */
    public String getAnswerQuestion() {
        return answerQuestion;
    }

    /**
     * @param answerQuestion the answerQuestion to set
     */
    public void setAnswerQuestion(String answerQuestion) {
        this.answerQuestion = answerQuestion;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
}
