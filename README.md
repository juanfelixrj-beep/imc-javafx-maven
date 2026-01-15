# IMC JavaFX App

Aplicação desktop para cálculo de IMC (Índice de Massa Corporal), desenvolvida em JavaFX com Maven, focada em consolidar fundamentos de Java moderno, estrutura de projeto e empacotamento fora da IDE.

---

## Objetivo

Este projeto foi criado com fins de aprendizado técnico, com foco em:

- JavaFX (UI desktop)
- FXML e Scene Builder
- Estrutura de projeto com Maven
- Tratamento de encoding (UTF-8 / Unicode)
- Build e execução fora da IDE
- Empacotamento com jpackage

---

## Funcionalidades

- Entrada de peso (kg)
- Entrada de altura (cm)
- Cálculo automático do IMC
- Exibição do resultado na interface
- Interface gráfica simples e responsiva

---

## Tecnologias Utilizadas

- Java 17 (LTS)
- JavaFX
- FXML
- Maven
- Scene Builder
- jpackage

---

## Estrutura do Projeto

src/
└── main/
├── java/
│ └── app/
│ ├── MainApp.java
│ └── MainController.java
└── resources/
└── app/
├── main-view.fxml
└── style.css
pom.xml
