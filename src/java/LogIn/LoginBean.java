
package LogIn;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.annotation.ManagedBean;


 @Named(value = "loginBean")
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

     String userName;
    private String password;
    private String myMsg="Test Msg";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    boolean verified = false;
    public LoginBean() {
    }
    public String Verify(){
         try {

            String query = "SELECT 'id' FROM 'user' WHERE username= "+" '"+userName+"' AND password='"+password+"' ";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration_details?useSSl=false", "root", "4662");
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            if (rs.next()) {
                verified = true;
                
            }

        } catch (Exception e) {

        }
         if (verified)
             return "login";
         else
             return null;
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMyMsg() {
        return myMsg;
    }

    public void setMyMsg(String myMsg) {
        this.myMsg = myMsg;
    }
    
}
