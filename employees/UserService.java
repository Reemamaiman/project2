package com.example.employees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserService {
    private ArrayList<User> UserList=new ArrayList<>();
    public ArrayList<User> getUsers(){ return UserList;}
    public void addUser( User user){UserList.add(user);}
    public void updateUser( int index, User user) { UserList.set(index,user);}
    public void deleteUser( int index){ UserList. remove (index);}
}
