package com.example.employees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    private ArrayList<Product> ProductList=new ArrayList<>();
    public ArrayList<Product> getUsers(){ return ProductList;}
    public void addUser( Product product){ProductList.add(product);}
    public void updateUser( int index, Product product) { ProductList.set(index,product);}
    public void deleteUser( int index){ ProductList. remove (index);}

}
