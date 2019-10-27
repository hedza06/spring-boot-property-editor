package com.springboot.propertyeditor.services;

import com.springboot.propertyeditor.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Service
@Description("Service component")
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    /**
     * Logging and returning given user data transfer object
     *
     * @param userDTO given user data
     * @return UserDTO Object
     */
    public UserDTO fetch(UserDTO userDTO)
    {
        LOGGER.info("User data transfer object: {}", userDTO);
        return userDTO;
    }
}
