package com.example.employees;

public class User {

        private String id;
        private String username;
        private String password;
        private String email;
        private String role;
        private float balance;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            if (id == null || id.length() != 3)
                throw new IllegalArgumentException("The ID Value Is Invalid");

            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            if (username == null || username.length() != 5)
                throw new IllegalArgumentException("The Username Value Is Invalid");

            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            if (password == null || password.length() != 6 || !isDigitAndNumber(password))
                throw new IllegalArgumentException("The Password Value Is Invalid");

            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (email == null || !isValidEmailAddress(email))
                throw new IllegalArgumentException("The Email Value Is Invalid");

            this.email = email;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            if (role == null || (role != "Admin" && role != "Customer"))
                throw new IllegalArgumentException("The Password Value Is Invalid");

            this.role = role;
        }

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            if (balance < 0)
                throw new IllegalArgumentException("The Price Value Is Invalid");

            this.balance = balance;
        }

        private boolean isDigitAndNumber(String str) {
            int digit = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)))
                    digit++;
            }

            if (digit == str.length())
                return false;

            return true;
        }

        public boolean isValidEmailAddress(String email) {
            String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
            java.util.regex.Matcher m = p.matcher(email);
            return m.matches();
        }
    }
