# 📌 Convenção de Código Java (Java Code Style Guide)

Este documento reúne as principais **convenções de código Java**, seguindo as recomendações amplamente usadas pela comunidade e alinhadas às boas práticas definidas pela **Oracle**.

---

## 🎯 Objetivo

A convenção de código do Java é um conjunto de regras recomendadas para escrever código Java que seja:

- fácil de ler
- fácil de entender
- fácil de manter
- consistente em projetos grandes
- simples de compartilhar e colaborar

---

## 🧱 Convenções Principais

### 🏛️ 1) Nome de Classes (PascalCase)

**Regra:**
- Começar com letra maiúscula
- Usar **PascalCase** (UpperCamelCase)

**Exemplo:**
```java
public class MinhaClasse {
}
```

---

### ⚙️ 2) Nome de Métodos (camelCase)

**Regra:**
- Começar com letra minúscula
- Usar **camelCase**

**Exemplo:**
```java
public void meuMetodo() {
}
```

---

### 🧩 3) Nome de Variáveis (camelCase)

**Regra:**
- Começar com letra minúscula
- Usar **camelCase**

**Exemplo:**
```java
int minhaVariavel = 10;
String nomeCompleto = "Bruno";
```

---

### 🔠 4) Nome de Constantes (UPPER_CASE)

**Regra:**
- Letras maiúsculas
- Separadas por underline `_`

**Exemplo:**
```java
public static final int MINHA_CONSTANTE = 100;
```

---

## 📏 5) Tamanho Máximo de Linha

**Regra recomendada:**
- Cada linha deve ter no máximo **80 caracteres**

**Por que isso é útil?**
- facilita leitura
- melhora revisão de código (code review)
- evita linhas gigantes e difíceis de entender

---

## 🧼 6) Uso de Espaços em Branco

Recomenda-se usar espaços para separar:

- operadores
- palavras-chave
- elementos de controle de fluxo

**Exemplo correto:**
```java
if (condicao) {
    System.out.println("Condição verdadeira");
}
```

**Exemplo ruim:**
```java
if(condicao){
System.out.println("Condição verdadeira");
}
```

---

## 📝 7) Comentários no Código

Comentários podem ser usados para:

- explicar **o que** o código faz
- explicar **por que** ele foi escrito daquela forma
- registrar regras de negócio importantes

**Exemplo:**
```java
// Necessário porque o sistema externo pode retornar null em casos específicos
if (usuario == null) {
    return;
}
```

---

## ⚠️ Comentários são um tema polêmico

Muitas pessoas desenvolvedoras defendem que:

> Um bom código deve ser autoexplicativo.

Ou seja: se você utiliza nomes intuitivos e descritivos para variáveis e métodos, o código fica mais claro e reduz a necessidade de comentários.

**Exemplo (autoexplicativo):**
```java
boolean usuarioEstaLogado = true;
boolean usuarioTemPermissao = false;

if (usuarioEstaLogado && usuarioTemPermissao) {
    System.out.println("Acesso liberado!");
} else {
    System.out.println("Acesso negado!");
}
```

---

## 📌 Conclusão

Convenções de código são **recomendações**, não regras obrigatórias.

Mesmo assim, seguir essas práticas ajuda a:

- criar um padrão consistente no projeto
- melhorar manutenção no longo prazo
- facilitar colaboração com outras pessoas
- tornar o código mais profissional

---

## 📚 Referência

- Oracle - Java Code Conventions
- Padrões amplamente adotados pela comunidade Java
