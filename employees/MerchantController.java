package com.example.employees;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/merchant")
public class MerchantController {







        private ArrayList<ArrayList<Merchant>> merchantList = new ArrayList<>();

        @GetMapping("/merchant")
        public ResponseEntity getUsersController() {

            return ResponseEntity.status(200).body(merchantList);
        }

        @PostMapping("/merchant")
        public ResponseEntity addUser(@RequestBody @Valid User user, Errors errors) {
            if (errors.hasErrors()) {
                String message = errors.getFieldError().getDefaultMessage();
                return ResponseEntity.status(400).body(new ApiResponse(message, 400));

            }
            return ResponseEntity.status(201).body(new ApiResponse("new product add !", 201));
        }

        @PutMapping("/merchant/{index}")
        public ResponseEntity updateProduct(@RequestBody @Valid Merchant
                                             merchant
                , @PathVariable int index, Errors errors) {
            if (errors.hasErrors()) {
                String message = errors.getFieldError().getDefaultMessage();
                return ResponseEntity.status(400).body(new ApiResponse(message, 400));
            }
            if (index >= merchantList.size()) {
                return ResponseEntity.status(400).body(new ApiResponse("Invalid index !", 400));
            }
            merchantList.set(index,Merchant);
            return ResponseEntity.status(201).body(new ApiResponse("product updated !", 201));

        }

        @DeleteMapping("/merchant/{index}")
        public ResponseEntity deleteUser(@PathVariable int index) {
            if (index >= merchantList.size()) {
                return ResponseEntity.status(400).body(new ApiResponse("prodect deleted !", 400));
            }

            merchantList.remove(index);
            return ResponseEntity.status(200).body(new ApiResponse("product updated !", 200));

        }
    }


}
