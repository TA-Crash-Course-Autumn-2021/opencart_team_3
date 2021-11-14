package models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LoginUserModel {

    private String emailLogin;
    private String passwordLogin;

    public LoginUserModel(){

    }

    public static LoginUserModel.Builder builder(){
        return new LoginUserModel().new Builder();
    }

    public class Builder{

        public LoginUserModel.Builder setEmailLogin(String value){
            emailLogin= value;
            return this;
        }

        public LoginUserModel.Builder setPasswordLogin(String value){
            passwordLogin= value;
            return this;
        }

        public LoginUserModel build(){
            return LoginUserModel.this;
        }

    }

}
