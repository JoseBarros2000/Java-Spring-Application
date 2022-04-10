package daibackend.demo.model.custom;

import daibackend.demo.model.Role;
import daibackend.demo.util.ConstantUtils;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreateChild {
    @Email(message = "Insert a valid email")
    private String email;

    @Email(message = "Insert a valid email")
    private String parentEmail;

    @NotBlank(message = "Can't be blank")
    @Pattern(regexp = ConstantUtils.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number")
    private String password;

    @NotBlank(message = "Can't be blank")
    @Pattern(regexp = ConstantUtils.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number")
    private String confirmPassword;

    @NotBlank(message = "Can't be blank")
    @Pattern(regexp = ConstantUtils.CHAR_PATTERN, message = "Can only letters, letters with special characters and spaces")
    private String name;

    private int age;

    @NotBlank(message = "Can't be blank")
    @Pattern(regexp = ConstantUtils.CHAR_PATTERN, message = "Can only letters, letters with special characters and spaces")
    private String address;

    @NotBlank(message = "Can't be blank")
    @Size(max = 9, min = 9, message = "Must contain exacly 9 numbers")
    @Pattern(regexp = ConstantUtils.CODE_PATTERN, message = "Can only contain numbers")
    private String contact;

    private long idAvatar;

    private Role role;

    public CreateChild(@Email(message = "Insert a valid email") String email, @NotBlank(message = "Can't be blank") @Pattern(regexp = ConstantUtils.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number") String password, @NotBlank(message = "Can't be blank") @Pattern(regexp = ConstantUtils.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number") String confirmPassword, @NotBlank(message = "Can't be blank") @Pattern(regexp = ConstantUtils.CHAR_PATTERN, message = "Can only letters, letters with special characters and spaces") String name, int age, @NotBlank(message = "Can't be blank") @Pattern(regexp = ConstantUtils.CHAR_PATTERN, message = "Can only letters, letters with special characters and spaces") String address, Role role,String contact,long idAvatar,String parentEmail) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.name = name;
        this.age = age;
        this.address = address;
        this.role = role;
        this.contact=contact;
        this.idAvatar=idAvatar;
        this.parentEmail=parentEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public long getIdAvatar() {
        return idAvatar;
    }

    public void setIdAvatar(long idAvatar) {
        this.idAvatar = idAvatar;
    }

    public String getParent_email() {
        return parentEmail;
    }

    public void setParent_email(String parentEmail) {
        this.parentEmail = parentEmail;
    }
}
