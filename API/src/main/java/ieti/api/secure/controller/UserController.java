package ieti.api.secure.controller;

import ieti.api.secure.entities.*;
import ieti.api.secure.services.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "api/user")
@CrossOrigin
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping
    public ResponseEntity<?> getUsersList(){
        try {
            return new ResponseEntity<>(userService.getUsersList(),HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getUserById(@PathVariable  String userId){
        try {
            return new ResponseEntity<>(userService.getUserById(userId),HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody  User user){
        try {
            return new ResponseEntity<>(userService.createUser(user),HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateUser")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        try {
            return new ResponseEntity<>(userService.updateUser(user),HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/removeUser/{userId}")
    public ResponseEntity<?> removeUser(@PathVariable String userId){
        try {
            userService.removeUser(userId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
        }
    }



}
