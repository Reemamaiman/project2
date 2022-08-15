package com.example.employees;

import java.util.ArrayList;

public class MerchantService {
    private ArrayList<Merchant> MerchantList=new ArrayList<>();
    public ArrayList<Merchant> getUsers(){ return MerchantList;}
    public void addUser( Merchant merchant){MerchantList.add(merchant);}
    public void updateUser( int index, Merchant merchant) { Merchant.set(index, merchant);}
    public void deleteUser( int index){MerchantList. remove (index);}
}
