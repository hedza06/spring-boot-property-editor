# Spring Boot Property Editors
Project demonstrates use of property editors in Spring Data. Property editors are
heavily used for managing conversion between string values and custom Object types.

## Some usage tips...
**UserPropertyEditor** is used to make a conversion between provided path variable as string
and converting it to **UserDTO** definition. To invoke property editor you should
write init binder method inside your controller class like so:
```
@InitBinder
public void initBinder(WebDataBinder binder) {
    binder.registerCustomEditor(TargetClass.class, new PropertyEditorClass());
}
```
After you put method above into your controller the automatic invocation will be called.

**API:** `http://localhost:8080/api/user/{data}` 
**Method:** `GET`  
**Response http status:** `(200 | 400)`

## Contribution
If someone is interesting in contribution please contact me on e-mail ```hedzaprog@gmail.com```. 
There will be more interesting things to come for Spring Boot especially.

## Author
Heril Muratović  
Software Engineer  
<br>
**Mobile**: +38269657962  
**E-mail**: hedzaprog@gmail.com  
**Skype**: hedza06  
**Twitter**: hedzakirk  
**LinkedIn**: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
**StackOverflow**: https://stackoverflow.com/users/4078505/heril-muratovic