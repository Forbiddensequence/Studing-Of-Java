package com.company.Containers;

import com.company.Users.RealUser;
import com.company.Users.User;

public class UserContainer <G extends  User> {
    private G user;
    private static int numberOfContainers=0;
    public UserContainer(G user) {
        this.user = user;
        numberOfContainers++;
    }

    public void setUser(G user) {
        this.user = user;
    }

    public String getUserFullName(){
        return user.getFullName();
    }

    public int getUserAge(){
        return user.getAge();
    }

    public static int getNumberOfContainers(){
        return numberOfContainers;
    }
}
