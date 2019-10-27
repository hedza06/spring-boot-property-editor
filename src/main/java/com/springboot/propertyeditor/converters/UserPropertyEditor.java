package com.springboot.propertyeditor.converters;

import com.springboot.propertyeditor.dto.UserDTO;
import com.springboot.propertyeditor.enumerations.UserTypeEnum;
import org.springframework.context.annotation.Description;

import java.beans.PropertyEditorSupport;

@Description("Custom user property editor")
public class UserPropertyEditor extends PropertyEditorSupport {

    @Override
    public String getAsText()
    {
        UserDTO userDTO = (UserDTO) getValue();
        return userDTO == null ? "" : userDTO.getUsername();
    }

    @Override
    public void setAsText(String text)
    {
        UserDTO userDTO;
        switch (text)
        {
            case "heril-muratovic-INDIVIDUAL-hedza06-27":
                userDTO = parseAndGet("heril-muratovic-INDIVIDUAL-hedza06-27");
                setValue(userDTO);
                break;

            case "martin-fowler-INDIVIDUAL-martinFO-45":
                userDTO = parseAndGet("martin-fowler-INDIVIDUAL-martinFO-45");
                setValue(userDTO);
                break;

            default:
                throw new IllegalArgumentException("Invalid argument!");
        }
    }

    /**
     * Method for parsing string and getting the result in another shape
     *
     * @param text given value as string
     * @return User Data Transfer Object
     */
    private UserDTO parseAndGet(String text)
    {
        String[] values = text.split("-");

        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(values[0]);
        userDTO.setLastName(values[1]);
        userDTO.setUserType(UserTypeEnum.valueOf(values[2]));
        userDTO.setUsername(values[3]);
        userDTO.setAge(Integer.valueOf(values[4]));

        return userDTO;
    }
}
