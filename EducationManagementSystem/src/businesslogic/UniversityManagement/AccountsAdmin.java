/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;
import businesslogic.Person;
import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class AccountsAdmin extends Person{
    
    private String accountsAdminID;
    private Date startDate;
    
    public AccountsAdmin(String personFirstName, String personLastName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword,  String accountsAdminID, Date startDate) {
            
        this.setPersonFirstName(personFirstName);
        this.setPersonLastName(personLastName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(UserRole.ACCOUNTS_ADMIN);
        this.setAccountsAdminID(accountsAdminID);
        this.setStartDate(startDate);
        }
    

    public String getAccountsAdminID() {
        return accountsAdminID;
    }

    public void setAccountsAdminID(String accountsAdminID) {
        this.accountsAdminID = accountsAdminID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
    
}
