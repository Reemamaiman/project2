package com.example.employees;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;


    @RestController
    @RequestMapping("/api/v1/product")
    public class ProductController{


        private ArrayList<ArrayList<Product>> productsList = new ArrayList<>();

        @GetMapping("/product")
        public ResponseEntity getUsersController() {

            return ResponseEntity.status(200).body(productsList);
        }

        @PostMapping("/product")
        public ResponseEntity addUser(@RequestBody @Valid User user, Errors errors) {
            if (errors.hasErrors()) {
                String message = errors.getFieldError().getDefaultMessage();
                return ResponseEntity.status(400).body(new ApiResponse(message, 400));

            }
            return ResponseEntity.status(201).body(new ApiResponse("new product add !", 201));
        }

        @PutMapping("/product/{index}")
        public ResponseEntity updateProduct(@RequestBody @Valid User user
                , @PathVariable int index, Errors errors) {
            if (errors.hasErrors()) {
                String message = errors.getFieldError().getDefaultMessage();
                return ResponseEntity.status(400).body(new ApiResponse(message, 400));
            }
            if (index >= productsList.size()) {
                return ResponseEntity.status(400).body(new ApiResponse("Invalid index !", 400));
            }

            productsList.set(index,Product);
            return ResponseEntity.status(201).body(new ApiResponse("product updated !", 201));

        }

        @DeleteMapping("/product/{index}")
        public ResponseEntity deleteUser(@PathVariable int index) {
            if (index >= productsList.size()) {
                return ResponseEntity.status(400).body(new ApiResponse("prodect deleted !", 400));
            }

            productsList.remove(index);
            return ResponseEntity.status(200).body(new ApiResponse("product updated !", 200));

        }
    }
