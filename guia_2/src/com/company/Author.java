package com.company;

public class Author {
    private String name;
    private String surname;
    private char gender;
    private String email;

    public Author(String name, String surname, char gender, String email){
        setName(name);
        setSurname(surname);
        setGender(gender);
        setEmail(email);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){ this.surname = surname; }

    public void setGender(char gender){ this.gender = gender; }

    public void  setEmail(String email){ this.email = email; }

    public String getName(){ return this.name; }

    public String getSurname(){ return this.surname; }

    public String getFullName(){
        return (this.name + " " + this.surname);
    }

    public char getGender(){ return this.gender; }

    public String getEmail(){ return this.email; }

}
