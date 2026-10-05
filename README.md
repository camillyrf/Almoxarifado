# Almoxarifado

Nome: Camilly Ramiro Franco
RA: 26002072

Projeto Integrador desenvolvido em **Java** focado na automação e controle de estoque para uma **Microempresa (ME)** em São João da Boa Vista – SP, atuante na distribuição B2B de produtos de limpeza e utensílios operacionais.

## Sobre o Projeto

O objetivo do sistema é substituir registos manuais por uma solução estruturada de gestão de insumos internos (embalagens, materiais encartelados e suprimentos de escritório), prevenindo a rutura de estoque e garantindo o fluxo logístico de expedição.

 O projeto está alinhado ao **ODS 9 (Indústria, Inovação e Infraestrutura)** da ONU, promovendo a modernização e digitalização dos processos de uma microempresa.

---

## 🚀 Tecnologias e Conceitos Utilizados

- **Linguagem:** Java 
- **Paradigma:** Programação Orientada a Objetos (POO)
  - **Abstração & Herança:** Classe base `Insumo` e subclasses especializadas (`InsumoEmbalagem`, `InsumoEncartelados`, `InsumoEscritorio`).
  - **Encapsulamento:** Proteção de atributos com validações via métodos getters/setters.
  - **Polimorfismo:** Sobrescrita do método `toString()` para exibição personalizada por categoria.
- **Padrão de Arquitetura:** *Manager / Controller* (`Almoxarifado`) para isolar as regras de negócio e gerir a coleção de dados em memória (`ArrayList`).

---

## 💻 Funcionalidades e Relatórios

- [x] Registo validado de insumos por categoria.
- [x] **Relatório 1:** Consulta do Estoque Total.
- [x] **Relatório 2:** Busca de produtos por nome/substring.
- [x] **Relatório 3:** Alerta preventivo de Itens a Repor (nível de estoque mínimo).
- [x] **Relatório 4:** Alerta crítico de Itens em Falta (estoque zerado).

