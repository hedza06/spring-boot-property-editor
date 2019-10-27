package com.springboot.propertyeditor.dto;

import com.springboot.propertyeditor.enumerations.UserTypeEnum;
import org.springframework.context.annotation.Description;

import java.io.Serializable;

@Description("User data transfer object")
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 20191023185100L;

    private String firstName;
    private String lastName;
    private String username;
    private Integer age;
    private UserTypeEnum userType;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    @Override
    public String toString()
    {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", userType='" + userType + '\'' +
                '}';
    }
}
