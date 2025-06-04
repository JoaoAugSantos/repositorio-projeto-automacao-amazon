# 🤖 Automação Web com Java, Selenium, TestNG e Cucumber

Este projeto é uma automação de testes web desenvolvida em **Java**, utilizando os frameworks **Selenium**, **TestNG**, **Cucumber** e **ExtentReports** (via `tech.grasshopper`) para geração de relatórios ricos e detalhados.

---

## 🛠️ Tecnologias Utilizadas

- **Java 11+**
- **Selenium WebDriver**
- **TestNG**
- **Cucumber (BDD)**
- **ExtentReports (tech.grasshopper)**
- **Maven** (para gerenciamento de dependências)

---

## 📂 Estrutura do Projeto

src/
├── main/
│ └── java/
│ └── [código de suporte, page objects, utils...]
├── test/
│ └── java/
│ ├── stepDefinition/ # Definição dos passos do Cucumber
│ ├── runners/ # Classes runner com TestNG
│ └── features/ # Arquivos .feature (Gherkin)

--
## ⚙️ Como Executar os Testes

1. **Clone o repositório:**

git clone https://github.com/seu-usuario/automacao.git

Execute os testes via Maven:

bash
mvn clean test
Certifique-se de que o ChromeDriver está configurado corretamente no seu PATH ou no projeto.

📈 Relatórios
Os relatórios são gerados automaticamente com o ExtentReports e podem ser acessados após a execução em:

/test-output/extent-report/index.html
O relatório inclui:

Status dos testes

Capturas de tela em caso de falhas

Logs e evidências

🧪 Exemplo de Gherkin
gherkin
Feature: Login no sistema
  Scenario: Login com credenciais válidas
    Given que o usuário acessa a página de login
    When ele insere usuário e senha válidos
    Then ele deve ser redirecionado para a página inicial
📌 Requisitos
Java JDK 11 ou superior

Maven 3.6+

Google Chrome (última versão)

ChromeDriver compatível

✍️ Autor:
João Augusto dos Santos
LinkedIn: https://www.linkedin.com/in/jo%C3%A3o-aug-santos/
GitHub: https://github.com/JoaoAugSantos
