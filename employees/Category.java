package com.example.employees;

public class Category {

        private String id;
        private String name;

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
    }



