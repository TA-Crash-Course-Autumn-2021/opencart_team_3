package models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegisterUserModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String passwordConfirm;

    public RegisterUserModel(){

    }

    public static RegisterUserModel.Builder builder(){
        return new RegisterUserModel().new Builder();
    }

    public class Builder{

        public RegisterUserModel.Builder setFirstName(String value){
            firstName= value;
            return this;
        }

        public RegisterUserModel.Builder setLastName(String value){
            lastName= value;
            return this;
        }

        public RegisterUserModel.Builder setEmail(String value){
            email= value;
            return this;
        }

        public RegisterUserModel.Builder setTelephone(String value){
            telephone= value;
            return this;
        }

        public RegisterUserModel.Builder setPassword(String value){
            password= value;
            return this;
        }

        public RegisterUserModel.Builder setPasswordConfirm(String value){
            passwordConfirm= value;
            return this;
        }

        public RegisterUserModel build(){
            return RegisterUserModel.this;
        }

    }

}
