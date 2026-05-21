# 🏨 Sistema de Controle de Reservas de Hotel

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), lógica de programação e manipulação de arrays de objetos.

---

# 📌 Sobre o Projeto

O sistema simula um controle de reservas de hotel diretamente pelo terminal, permitindo cadastrar hóspedes, listar reservas, buscar hóspedes por CPF e ordenar reservas por número de diárias.

Esse projeto foi desenvolvido com o objetivo de praticar:

* Programação Orientada a Objetos
* Estruturas condicionais
* Estruturas de repetição
* Arrays de objetos
* Organização de código em classes
* Métodos getters e setters
* Busca e ordenação de dados
* Integração com Git e GitHub

---

# ⚙️ Funcionalidades

✅ Cadastro de hóspedes
✅ Confirmação de reservas
✅ Listagem completa das reservas
✅ Busca de hóspedes por CPF
✅ Ordenação de reservas por número de diárias
✅ Cálculo automático do valor total das estadias
✅ Validação de opções do menu

---

# 🖥️ Menu Principal

```text
SISTEMA DE CADASTRO PARA HÓSPEDES EM HOTEL
------------------------------------------
Digite a opção desejada:

1 - Nova reserva
2 - Listar reservas
3 - Buscar reserva por CPF do hóspede
4 - Ordenar reservas por números de dias
5 - Sair
```

---

# 🧱 Estrutura do Projeto

```text
src
│
├── SistemaDeCadastroHotel.java
│
└── com
    └── sistemacadastro
        └── entity
            ├── Hospede.java
            └── Funcionalidades.java
```

---

# 📚 Classes do Sistema

## 🔹 Hospede.java

Classe responsável por:

* Armazenar os dados do hóspede
* Realizar o cadastro
* Calcular o valor da estadia
* Exibir revisão da reserva

### Atributos principais:

```java
private String nome;
private String cpf;
private String quarto;
private int numeroDiarias;
private double valorEstadia;
```

---

## 🔹 Funcionalidades.java

Classe auxiliar responsável por:

* Validar opções do menu
* Exibir informações formatadas
* Centralizar funcionalidades reutilizáveis

---

# 🛠️ Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# 🚀 Como Executar

## 1. Clone o repositório

```bash
git clone https://github.com/felipeperes-softwareeng/hotel-reservation-system-java.git
```

---

## 2. Abra o projeto na IDE

Abra o projeto utilizando:

* IntelliJ IDEA
* Eclipse
* VS Code

---

## 3. Execute o arquivo principal

```text
SistemaDeCadastroHotel.java
```

---

# 📸 Imagens do Projeto

Adicione aqui:

* Print do menu principal
* Print do cadastro de hóspedes
* Print da classe Hospede
* Print da classe Funcionalidades

Exemplo:

```markdown
![Menu Principal](imagens/menu.png)
```

---

# 📈 Aprendizados

Durante o desenvolvimento desse projeto, pratiquei:

* Estruturação de sistemas em Java
* Manipulação de arrays de objetos
* Organização de código
* Programação Orientada a Objetos
* Validação de entradas
* Busca e ordenação de informações
* Fluxos de menu interativo

---

# 🔗 Repositório

GitHub:

[https://github.com/felipeperes-student/sistema-controle-de-reserva-hotel](https://github.com/felipeperes-student/sistema-controle-de-reserva-hotel)

---

# 👨‍💻 Autor

Felipe Peres

LinkedIn e GitHub em desenvolvimento 🚀
