package com.example.employees;

public class Merchant {

        private String id;
        private String productId;
        private String merchantId;
        private int stock;

    public static void set(int index, Merchant merchant) {
    }


    public String getId() {
            return id;
        }

        public void setId(String id) {
            if (id == null || id.length() != 3)
                throw new IllegalArgumentException("The ID Value Is Invalid");

            this.id = id;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            if (productId == null || productId.length() != 3)
                throw new IllegalArgumentException("The Product ID Value Is Invalid");

            this.productId = productId;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            if (merchantId == null || merchantId.length() != 3)
                throw new IllegalArgumentException("The Merchant ID Value Is Invalid");

            this.merchantId = merchantId;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            if (stock <= 10)
                throw new IllegalArgumentException("The Stock Value Is Invalid");

            this.stock = stock;
        }


    }

