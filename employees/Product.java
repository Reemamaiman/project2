package com.example.employees;

import java.util.ArrayList;

public class Product {

        private String id;
        private String name;
        private float price;
        private String categoryID;
        private ArrayList<String> comment = new ArrayList<String>();

        public String getId() {
            return id;
        }

        public void setId(String id) {
            if (id == null || id.length() != 3)
                throw new IllegalArgumentException("The ID Value Is Invalid");

            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.length() != 3)
                throw new IllegalArgumentException("The Name Value Is Invalid");

            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            if (price < 0)
                throw new IllegalArgumentException("The Price Value Is Invalid");

            this.price = price;
        }

        public String getCategoryID() {
            return categoryID;
        }

        public void setCategoryID(String categoryID) {
            if (categoryID == null || categoryID.length() != 3)
                throw new IllegalArgumentException("The Name Value Is Invalid");

            this.categoryID = categoryID;
        }

        public ArrayList<String> getComment() {
            return comment;
        }

        public void setComment(ArrayList<String> comment) {
            this.comment = comment;
        }


    }

