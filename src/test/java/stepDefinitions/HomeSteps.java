package stepDefinitions;
import base.BaseTest;
import com.amazon.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.pt.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class HomeSteps {
    private HomePage homePage;

    @Before
    public void before() {
        BaseTest.setUp();
        homePage = new HomePage(BaseTest.getDriver());
    }

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        BaseTest.tearDown();
    }

    @Dado("que o usuário está na página inicial da Amazon")
    public void validarHomePage() {
        boolean naHome = homePage.estaNaHomePage();
        assertTrue(naHome, "Erro: Página inicial da Amazon não foi carregada corretamente.");
    }

    @Quando("ele clicar em \"Venda na Amazon\"")
    public void clicarVendaAmazon() {
        homePage.acessarVendaAmazon();
    }

    @Quando("ele clicar em \"Mais vendidos\"")
    public void clicarMaisVendidos() {
        homePage.acessarMaisVendidos();
    }
    @Quando("ele clicar em \"Ofertas do dia\"")
    public void clicarOfertasDoDia() {
        homePage.acessarOfertasDoDia();
    }
    @Quando("ele clicar em \"Prime\"")
    public void clicarPrime() {
        homePage.acessarPrime();
    }


    @Quando("ele clicar em \"Livros\"")
    public void clicarLivros() {
        homePage.acessarLivros();
    }


    @Quando("ele clicar em \"Música\"")
    public void clicarMusica() {
        homePage.acessarMusica();
    }

    @Quando("ele clicar em \"Ideias de presentes\"")
    public void clicarIdeiasDePresentes() {
        homePage.acessarIdeiasDePresente();
    }


    @Entao("o sistema deve redirecionar para a pagina com titulo \"([^\"]*)\"$")
    public void validarTelaApresentada(String titulo) {
        assertTrue(homePage.validarRedirecionamentoVendaNaAmazon(titulo));
    }


}