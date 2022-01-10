package com.company.Users;

public interface User {

    /**
     * Says hello
     */
    void sayHello();

    /**
     *
     * @return user's full name
     */
    String getFullName();

    /**
     * register user in system
     */
    void register();

    /**
     * Get user's age
     * @return user's age
     */
    int getAge();

    /**
     * Get user's amount of money
     * @return amount of user's money
     */
    int getAmountOfMoney();

}
