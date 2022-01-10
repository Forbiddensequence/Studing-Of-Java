package com.company;

import com.company.ArrayIterator.ArrayIterator;
import com.company.Containers.UserContainer;
import com.company.Pair.Pair;
import com.company.People.Human;
import com.company.Users.RealUser;
import com.company.Users.StudentUser;
import com.company.Users.TeacherUser;
import com.company.Users.User;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        t1();
        t2();
        t3();
    }

    private static void t3(){
        Integer a = 6;
        Integer b = 9;
        ifElse(a>b)
                .apply(()->System.out.println("Realization of trueBlock "+a % b))
                .accept(()->System.out.println("Realization of falseBlock "+b % a))
        ;

    }

    /*
    public static Function<Runnable, Consumer<Runnable>> ifElse(boolean statement){
        Function<Runnable,Consumer<Runnable>> result=new Function<Runnable, Consumer<Runnable>>() {
            @Override
            public Consumer<Runnable> apply(Runnable runnable) {
                Consumer<Runnable> falseBlock=new Consumer<Runnable>() {
                    @Override
                    public void accept(Runnable runnable1) {
                        if(!statement){
                            runnable1.run();
                        }
                    }
                };
                if(statement){
                    runnable.run();
                }
                return falseBlock;
            }
        };
        return result;
    }

     */

    public static Function<Runnable, Consumer<Runnable>> ifElse(boolean statement) {
        return trueCallback->{
            if(statement){
                trueCallback.run();
                return falseCallback->{};
            }
            else{
                return Runnable::run;
            }
        };

    }


    private static void t2() {
        Pair<String, User> testPair=new Pair<String,User>("TestString",new StudentUser("SHS","Chupapi",12,228));
        System.out.println(testPair.toString());
    }

    public static void t1(){
        User User1=new TeacherUser("Vasya","Pupkin","Fyodorovich",25,25000);
        User User2=new TeacherUser("Igor","Sidorov","Dmitrievich",30,100000);
        UserContainer<User> userContainer1=new UserContainer<User>(User1);
        UserContainer userContainer2=new UserContainer(User2);
        User User3=new StudentUser("Roman","Aboba",15,565);
        System.out.println("User full name is "+userContainer1.getUserFullName());
        System.out.println("User's age is equal to "+userContainer1.getUserAge());
        System.out.println("Number of existing user containers is equal to "+UserContainer.getNumberOfContainers());
        System.out.println("Number of existing users is equal to "+ RealUser.getNumberOfUsers());
        User[] users={User1,User2,User3};
        ArrayIterator<User> iterator=new ArrayIterator<>(users);
        while(iterator.hasNext()){
            User nextUser=iterator.next();
            if(nextUser.getAge()<20){
                iterator.remove();
            }
        }

        for(User user : users){
            if(user!=null){
                System.out.println(user.getFullName());
                user.sayHello();
                System.out.println("Amount of money of our user is equal to " + user.getAmountOfMoney());
            }
        }

        System.out.println("-------------------------------------------------------------------------------");

        User U1=new TeacherUser("Sergiy","Ryzhov","Victorovich",26,150000);
        User U2=new StudentUser("Sergiy","Ryzhov",20,25000);
        User U3=new TeacherUser("Sergiy","Ryzhov","Victorovich",26,150000);
        System.out.println("Hashcode is equal to "+Integer.toHexString(U1.hashCode()));
        System.out.println("Hashcode is equal to "+Integer.toHexString(U2.hashCode()));
        System.out.println("Hashcode is equal to "+Integer.toHexString(U3.hashCode()));
        System.out.println("String representation of object "+U1.getClass()+"\n"+U1.toString());
        System.out.println("String representation of object "+U2.getClass()+"\n"+U2.toString());
        System.out.println(U1.equals(U3));
        User[] anotherUsers={U1,U2,U3,User1};
        Collection<User> collectionOfUsers= new ArrayList<>();
        for(User user: anotherUsers){
            collectionOfUsers.add(user);
            System.out.println(user);
        }
        collectionOfUsers.add(User2);
        //collectionOfUsers.removeAll(List.of(anotherUsers));
        System.out.println();
        for(User user: collectionOfUsers){
            System.out.println(user);
        }
        Collection<User> secondCollectionOfUsers=new ArrayList<>(collectionOfUsers);
        for(User user:collectionOfUsers){
            Iterator<User> iterator1=new ArrayIterator<User>(collectionOfUsers.toArray(new User[0]));
            int numberOfDelete=0;
            while (iterator1.hasNext()){
                User us=iterator1.next();
                if(us.equals(user)){
                    secondCollectionOfUsers.remove(us);
                    numberOfDelete++;
                }
            }
            if(numberOfDelete%2!=0){
                secondCollectionOfUsers.add(user);
            }
        }

        System.out.println();
        for(User user: secondCollectionOfUsers){
            System.out.println(user);
        }
        System.out.println("end of t1");
        System.out.println("-------------------------------------------------------------------------------");
    }
}
