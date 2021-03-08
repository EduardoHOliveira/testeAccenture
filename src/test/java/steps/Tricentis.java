package steps;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

import utils.Utils;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.EnterInsurantData;
import pages.EnterProductData;
import pages.EnterVehicleData;
import pages.SelectPriceOption;
import pages.SendQuote;
import pages.ValidarMensagem;

@RunWith(Runner.class)
public class Tricentis {
	private WebDriver driver;

	@Before
	public void iniciar() {
		driver = Utils.createChrome();
	}
	
	@Quando("^informo os campos da aba enter Vehicle Data e prossigo$")
	public void informoOsCamposDaAbaEnterVehicleDataEProssigo() throws Throwable {
		new EnterVehicleData(driver).preencherAbaEnterVehicleData("Nissan", "Scooter", "300", "20", "03/01/2021",
				"1", "Yes", "2", "Gas", "421", "865", "1480", "QWERT20", "26741");
	}

	@Quando("^informo os dados da aba enter Insurant Data e prossigo$")
	public void informoOsDadosDaAbaEnterInsurantDataEProssigo() throws Throwable {
		new EnterInsurantData(driver).preencherEnterInsurantData("Tricentis", "Vehicle", "07/13/1983", "Rua Logradouro",
				"M", "Brazil", "70123000", "Brasilia", "Employee", "Yes", "No", "Yes", "No", "Yes");
	}

	@Quando("^informo os dados da aba enter Product Data e prossigo$")
	public void informoOsDadosDaAbaEnterProductDataEProssigo() throws Throwable {
		new EnterProductData(driver).preencherAbaEnterProductData("05/01/2021", "25.000.000,00", "Malus 11",
				"Partial Coverage", "No", "Yes", "Yes");
	}

	@Quando("^informo os dados da aba Select Price Option e prossigo$")
	public void informoOsDadosDaAbaSelectPriceOptionEProssigo() throws Throwable {
		new SelectPriceOption(driver).preencherAbaSelectPriceOption("selectplatinum");
	}

	@Quando("^informo os dados da aba Send Quote e envio$")
	public void informoOsDadosDaAbaSendQuoteEEnvio() throws Throwable {
		new SendQuote(driver).preencherAbaSendQuote("email@email.com", "5561999990001", "nononono",
				"Nonono000", "Nonono000");
	}

	@Entao("^valido a mensagem de sucesso$")
	public void validoAMensagemDeSucesso() throws Throwable {
		new ValidarMensagem(driver).validaMensagens();
	}

}