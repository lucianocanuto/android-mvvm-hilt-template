# Android MVVM Hilt Template

Projeto base Android utilizando **MVVM**, **Hilt** e padrão **Resource** para gerenciamento de estados de UI.

Este template foi criado como referência organizacional para novos projetos, seguindo boas práticas de arquitetura e separação de responsabilidades.

---

## 🏗 Arquitetura

O projeto segue a estrutura em camadas:

UI → ViewModel → Repository → Data Source

### Camadas

- **Presentation**
  - `ui/` → Activities / Fragments
  - `viewmodel/` → ViewModels responsáveis pelo estado da tela

- **Data**
  - `repository/` → Implementações concretas dos repositórios

- **Domain (contrato)**
  - Interfaces de repositório

- **Util**
  - `Resource` → Classe selada para controle de estados (Loading, Success, Error)

---

## 🔄 Fluxo de execução

1. A UI chama uma ação no ViewModel
2. O ViewModel define o estado como `Loading`
3. O ViewModel chama o Repository
4. O Repository retorna o resultado
5. O ViewModel atualiza o estado para `Success` ou `Error`
6. A UI observa o estado e atualiza a interface

---

## 🧠 Padrões utilizados

- MVVM (Model-View-ViewModel)
- Repository Pattern
- Injeção de dependência com Hilt
- Encapsulamento com LiveData
- Resource Pattern para gerenciamento de estado

---

## 🎯 Objetivo

Servir como base organizacional para novos projetos Android, facilitando:

- Consulta de estrutura
- Reutilização de arquitetura
- Padronização de fluxo
- Separação clara de responsabilidades

---

## 🚀 Tecnologias

- Kotlin
- Android SDK
- ViewModel
- LiveData
- Hilt

---

Projeto desenvolvido como template de estudo e referência arquitetural.
