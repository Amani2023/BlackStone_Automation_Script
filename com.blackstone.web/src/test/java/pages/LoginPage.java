package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    private By loginEmail= By.xpath("//input[@id='mat-input-0']");
    private By loginPassword= By.xpath("//input[@id='mat-input-2']");
    private By loginButton=By.xpath("//button[contains(text(), 'Sign In']");
    private By userIcon=By.xpath("//header/section[1]/navbar[1]/div[1]/div[2]/nav-actions[1]/div[1]/ul[1]/li[3]/div[1]1/div[2]/img[1]");
    private By logoutOption=By.xpath("//li[contains(text(), 'Logout')]");


    public void get_Home_Page_Title(){
        driver.getTitle();
    }

    public By getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(By loginEmail) {
        this.loginEmail = loginEmail;
    }

    public By getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(By loginPassword) {
        this.loginPassword = loginPassword;
    }

    public By getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(By loginButton) {
        this.loginButton = loginButton;
    }

    public By getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(By userIcon) {
        this.userIcon = userIcon;
    }

    public By getLogoutOption() {
        return logoutOption;
    }

    public void setLogoutOption(By logoutOption) {
        this.logoutOption = logoutOption;
    }
}
