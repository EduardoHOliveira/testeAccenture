$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Tricentis.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: UTF-8"
    }
  ],
  "line": 4,
  "name": "Cadastro Tricentis",
  "description": "Preencher formulario e obter mensagem de sucesso",
  "id": "cadastro-tricentis",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 6433499000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Realizar o cadastro com sucesso",
  "description": "",
  "id": "cadastro-tricentis;realizar-o-cadastro-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 8,
  "name": "informo os campos da aba enter Vehicle Data e prossigo",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "informo os dados da aba enter Insurant Data e prossigo",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "informo os dados da aba enter Product Data e prossigo",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "informo os dados da aba Select Price Option e prossigo",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "informo os dados da aba Send Quote e envio",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "valido a mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "Tricentis.informoOsCamposDaAbaEnterVehicleDataEProssigo()"
});
formatter.result({
  "duration": 1366339300,
  "status": "passed"
});
formatter.match({
  "location": "Tricentis.informoOsDadosDaAbaEnterInsurantDataEProssigo()"
});
formatter.result({
  "duration": 1041797500,
  "status": "passed"
});
formatter.match({
  "location": "Tricentis.informoOsDadosDaAbaEnterProductDataEProssigo()"
});
formatter.result({
  "duration": 635122500,
  "status": "passed"
});
formatter.match({
  "location": "Tricentis.informoOsDadosDaAbaSelectPriceOptionEProssigo()"
});
formatter.result({
  "duration": 185088100,
  "status": "passed"
});
formatter.match({
  "location": "Tricentis.informoOsDadosDaAbaSendQuoteEEnvio()"
});
formatter.result({
  "duration": 575552700,
  "status": "passed"
});
formatter.match({
  "location": "Tricentis.validoAMensagemDeSucesso()"
});
formatter.result({
  "duration": 8637693200,
  "status": "passed"
});
});