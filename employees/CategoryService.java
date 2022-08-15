package com.example.employees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CategoryService {
    private ArrayList<Category> CategoryList=new ArrayList<>();
    public ArrayList<Category> getUsers(){ return CategoryList;}
    public void addUser( Category category){CategoryList.add(category);}
    public void updateUser( int index, Category category) { CategoryList.set(index,category);}
    public void deleteUser( int index){ CategoryList.remove(index);}
}
