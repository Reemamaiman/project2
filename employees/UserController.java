package com.example.employees;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/User")
public class UserController {

    private ArrayList<User> userList = new ArrayList<>();

    @GetMapping("/User")
    public ResponseEntity getUsersController() {

        return ResponseEntity.status(200).body(userList);
    }

    @PostMapping("/User")
    public ResponseEntity addUser(@RequestBody @Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message, 400));

        }
        return ResponseEntity.status(201).body(new ApiResponse("new user add !", 201));
    }

    @PutMapping("/users/{index}")
    public ResponseEntity updateUser(@RequestBody @Valid User user
            , @PathVariable int index, Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message, 400));
        }
        if (index >= userList.size()) {
            return ResponseEntity.status(400).body(new ApiResponse("Invalid index !", 400));
        }
        userList.set(index, user);
        return ResponseEntity.status(201).body(new ApiResponse("User updated !", 201));

    }

    @DeleteMapping("/users/{index}")
    public ResponseEntity deleteUser(@PathVariable int index) {
        if (index >= userList.size()) {
            return ResponseEntity.status(400).body(new ApiResponse("User deleted !", 400));
        }

        userList.remove(index);
        return ResponseEntity.status(200).body(new ApiResponse("User updated !", 200));

    }
}
