package com.juaracoding;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class    Main {
    public static void main(String[] args) {
        //Nama  : I Gede Arya Krisnadi
        System.setProperty("webdriver.chrome.driver","F:\\JuaraCoding\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://juice-shop.herokuapp.com");
        System.out.println("Open URL");

        //remove ads
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]/span[1]/span")).click();
        delay(2);

        //login
//        driver.findElement(By.id("navbarAccount")).click();
//        Select loginAccount = new Select(driver.findElement(By.id("navbarAccount")));
//        loginAccount.selectByVisibleText("Login");
//        delay(2);
//        driver.findElement(By.xpath("//*[@id=\"navbarLoginButton\"]/span")).click();
//        delay(3);

        driver.get("https://juice-shop.herokuapp.com/#/login");
        String email = "aryakrisnadi96@gmail.com";
        String pass = "aryakrinadi123";
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@id='loginButton']/span[1]")).click();
        delay(2);

        //add to chart
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/div[2]/button/span[1]")).click();
        delay(2);
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/div[2]/button/span[1]/span")).click();
        delay(2);
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-card/div[2]/button/span[1]/span")).click();

        js.executeScript("window.scrollBy(0,10000)");
        delay(3);
        //sold item
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/mat-card/div[3]/button/span[1]/span\n")).click();

    }
    static void delay(long waktu){
        try {
            Thread.sleep(waktu*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
