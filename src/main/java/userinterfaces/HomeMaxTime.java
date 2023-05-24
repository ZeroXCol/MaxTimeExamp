package userinterfaces;

import org.openqa.selenium.By;

public class HomeMaxTime {

    public static By NOMBRE_USUARIO = By.xpath("//td//input[@name='Logon$v0$MainLayoutEdit$xaf_l30$xaf_dviUserName_Edit']");
    public static By CONTRASENA = By.xpath("//td//input[@name='Logon$v0$MainLayoutEdit$xaf_l35$xaf_dviPassword_Edit']");
    public static By BTN_CONECTARSE = By.xpath("//div//a[contains(text(),Conextarse)]");
}
