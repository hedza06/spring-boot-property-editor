package com.springboot.propertyeditor.controllers;

import com.springboot.propertyeditor.converters.UserPropertyEditor;
import com.springboot.propertyeditor.dto.UserDTO;
import com.springboot.propertyeditor.services.UserService;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Description("User routing component")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(UserDTO.class, new UserPropertyEditor());
    }

    /**
     * Fetching user data | GET : /api/user/{data}
     *
     * @param userDTO given user data transfer object as string | path variable
     * @return ResponseEntity with UserDTO and http status code
     */
    @GetMapping(value = "/user/{data}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getUserData(@PathVariable("data") UserDTO userDTO)
    {
        UserDTO userData = userService.fetch(userDTO);
        return new ResponseEntity<>(userData, HttpStatus.OK);
    }
}
