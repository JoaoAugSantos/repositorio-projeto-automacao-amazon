package com.amazon.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By elementoHomePage = By.id("twotabsearchtextbox");
    private By botaoVendaNaAmazon = By.xpath("//a[@data-csa-c-content-id='nav_cs_sell']");
    private By botaoMaisVendidos = By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']");
    private By botaoOfertasDoDia = By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']");
    private By botaoPrime = By.id("nav-link-amazonprime");
    private By botaoLivros = By.xpath("//a[@data-csa-c-content-id='nav_cs_books']");
    private By botaoMusica = By.xpath("//a[@data-csa-c-content-id='nav_cs_music']");
    private By botaoIdeiasDePresente = By.xpath("//a[@data-csa-c-content-id='nav_cs_giftfinder']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarVendaAmazon(){
        driver.findElement(botaoVendaNaAmazon).click();
    }


    public boolean validarRedirecionamentoVendaNaAmazon(String tituloEsperado) {
        return driver.getTitle().toLowerCase().contains(tituloEsperado);
    }

    public boolean estaNaHomePage() {
        return driver.findElement(elementoHomePage).isDisplayed();
    }

    public void acessarMaisVendidos(){
        driver.findElement(botaoMaisVendidos).click();
    }

    public void acessarOfertasDoDia(){
        driver.findElement(botaoOfertasDoDia).click();
    }
    public void acessarPrime(){
        driver.findElement(botaoPrime).click();
    }

    public void acessarLivros(){
        driver.findElement(botaoLivros).click();
    }

    public void acessarMusica(){
        driver.findElement(botaoMusica).click();
    }

    public void acessarIdeiasDePresente(){
        driver.findElement(botaoIdeiasDePresente).click();
    }
}