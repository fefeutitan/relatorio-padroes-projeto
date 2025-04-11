
# 📄 Projeto com Padrão Strategy + JasperReports

Este projeto demonstra a aplicação do padrão **Strategy** em Java e a geração de um **relatório PDF mockado** usando **JasperReports**.

## 🛠️ Tecnologias

- Java 8+
- Maven
- JasperReports
- Padrões de Projeto (Strategy)

## 📎 Funcionalidades

- Implementação didática do padrão Strategy
- Geração de PDF com JasperReports (mockado)

## 🧪 Como executar

```bash
mvn clean install
java -cp target/classes com.seuusuario.relatorio.service.RelatorioService
```

O PDF será gerado como `relatorio-gerado.pdf` no diretório raiz.

## ✨ Captura de tela

Adicione aqui um print do PDF gerado: `./print-relatorio.png`

## 📂 Estrutura

- `src/main/java/.../RelatorioService.java` – Classe que gera o PDF
- `src/main/resources/relatorios/relatorio.jrxml` – Template usado na geração

## 🧠 Conceito aplicado

O padrão Strategy permite trocar dinamicamente o comportamento de uma operação, facilitando manutenção e extensão do código.

JasperReports é utilizado aqui apenas com dados mockados, simulando um cenário de relatório real.
