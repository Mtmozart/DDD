![Programação-Arquitetura Java (1)](https://github.com/jacqueline-oliveira/3699-java-domain-driven-design/assets/66698429/1337777b-95b9-4222-8f24-e01c0fb01f67)

![](https://img.shields.io/github/license/alura-cursos/android-com-kotlin-personalizando-ui)

# CodeChella

App de simulação de um site para venda de ingressos de eventos diversos

## 🔨 Objetivos do projeto

- Aplicar as técnicas do desenvolvimento orientado ao domínio;
- Criar software que realmente entregue valor ao cliente;
- Entender sobre subdomínios, contextos delimitados e contextos compartilhados;
- Aprender sobre os blocos de construção (Entidades, Objetos de valor, Agregados);
- Conhecer as vantagens da utilização de camadas anticorrupção.


## NOTAS

O DomainDriven Design (DDD) é uma abordagem para o desenvolvimento de software que foca em modelar o domínio do problema, ou seja, o negócio que o software está tentando resolver. 
Em vez de focar apenas na tecnologia, o DDD busca entender profundamente o negócio e suas regras, traduzindo essa complexidade para o código de forma clara e organizada.

## Problema e soluções

O DomainDriven Design (DDD) é uma abordagem que foca em entender a complexidade do negócio, que é a complexidade essencial do software, bucando entender como cada setor de uma empresa funciona e como eles se conectam, como se fosse um quebracabeça.

Cada setor pode ter uma linguagem própria, uma empresa pode ter "cliente" pode ser chamado de prospect, usuário, cliente ou parceiro, dependendo do setor.

O DDD nos ajuda a organizar essa "linguagem" e a modelar o software de forma a atender às necessidades do cliente, como se a gente estivesse montando o quebracabeça da melhor forma possível.

Os pilares do DDD nos ajudam a construir esse quebracabeça de forma eficiente. 

principais conceitos e práticas do DDD:

**Modelagem do Domínio:**
        Envolve a compreensão detalhada do problema que o software está resolvendo.
        Identificação de entidades, agregados, serviços, eventos, objetos de valor e regras de negócio relevantes.

**Linguagem Ubíqua:**
        Uso de uma linguagem comum e consistente (ubíqua) para comunicação entre a equipe de desenvolvimento e os especialistas do domínio.
        Termos do domínio são usados tanto na comunicação quanto no código-fonte, promovendo alinhamento e entendimento comum.
**Padrões de Projeto Estratégicos e Táticos:**
        Estratégicos: Direcionam o design em um nível alto, como definição de Bounded Contexts e Context Mapping.
        Táticos: Detalham a implementação, como Agregados, Entidades, Repositórios, Serviços de Domínio, Objetos de Valor, etc.

**Bounded Context:**
        Delimitação clara dentro da qual um modelo de domínio é definido e aplicado consistentemente.
        Em sistemas complexos, vários bounded contexts podem colaborar entre si, cada um com seu próprio modelo de domínio.

**Context Mapping:**
        Técnica para mapear e definir a comunicação entre diferentes bounded contexts.
        Padrões específicos incluem Partnership, Shared Kernel, Customer-Supplier, entre outros.

**Implementação Orientada a Domínio:**
        O código deve refletir o modelo de domínio de forma direta e organizada.
        Linguagens de programação são escolhidas por sua capacidade de expressar diretamente o modelo de domínio.

**Event Sourcing:**
        Técnica onde o estado do sistema é determinado pela sequência de eventos que ocorreram.
        Útil para sistemas onde é importante manter um histórico completo de todas as alterações de estado.

**Teste de Unidade de Domínio:**
        Validação das regras de negócio através de testes de unidade focados no código de domínio.
        Garantem que as regras do domínio sejam corretamente implementadas e mantidas.

 **Evolução Contínua do Modelo de Domínio:**
        Reconhecimento de que o modelo de domínio evolui à medida que o entendimento do problema melhora.
        A modelagem de domínio é um processo contínuo e iterativo.
 
**Colaboração com Especialistas do Domínio:**
        Colaboração próxima entre desenvolvedores e especialistas no domínio do problema.
        Garantia de que o modelo de domínio seja preciso, relevante e útil.

Linguagem onipresentes, tem que encontrar um meio termo, resolve-se na conversa.

A "linguagem onipresente" (Ubiquitous Language) é um princípio central no Domain-Driven Design (DDD). Ela representa uma linguagem comum e compartilhada usada por todas as partes envolvidas no desenvolvimento de software, incluindo desenvolvedores, analistas de negócios e stakeholders. Essa linguagem é composta por termos específicos do domínio do negócio abordado pelo software. Seus principais objetivos são:

- **Clareza:** A linguagem onipresente elimina ambiguidades, garantindo que todos na equipe compreendam claramente os requisitos do negócio. O uso consistente de termos em discussões e documentos facilita a comunicação entre todos os interessados.

- **Alinhamento Conceitual:** Com a linguagem onipresente, a equipe de desenvolvimento e os stakeholders do negócio compartilham uma compreensão comum dos elementos essenciais do domínio, como entidades, processos, regras de negócio e fluxos de trabalho.

- **Tradução Direta para o Código:** Uma grande vantagem da linguagem onipresente é a possibilidade de ser traduzida diretamente para o código-fonte do software, tornando o código mais expressivo e refletindo fielmente o modelo de domínio.

- **Facilitação da Modelagem de Domínio:** Uma linguagem onipresente bem definida é crucial para uma modelagem de domínio eficaz. Utilizar termos do domínio de negócios em vez de jargões técnicos torna os modelos de domínio mais acessíveis e úteis para todos os interessados.

- **Refatoração e Evolução:** A linguagem onipresente facilita a refatoração e evolução do software ao longo do tempo. Como todos falam a mesma linguagem, ajustar e expandir o código de acordo com mudanças nos requisitos do negócio se torna mais fácil.

- **Participação dos Especialistas do Domínio:** A definição da linguagem onipresente muitas vezes requer colaboração estreita com especialistas do domínio, garantindo que a linguagem seja precisa e relevante.

Em resumo, a linguagem onipresente é essencial para o sucesso de um projeto de software baseado em Domain-Driven Design, promovendo uma comunicação eficaz, alinhamento conceitual e garantindo que o código reflita fielmente o modelo de domínio do negócio.

## Classe anêmicas
Uma classe anêmica é como um fantasma: ela está lá, mas não tem alma! Ela é uma classe que só possui getters e setters, sem nenhuma lógica de negócio ou comportamento próprio. É como se ela fosse um mero contêiner de dados, sem nenhuma inteligência. Imagine um carro que só tem um volante e um banco, mas não tem motor, rodas ou qualquer outro componente que o faça funcionar. Essa é a analogia perfeita para uma classe anêmica: ela tem os atributos, mas não tem a capacidade de fazer nada com eles.
No contexto do DomainDriven Design (DDD), classes anêmicas são um problema porque elas não representam o domínio do negócio de forma completa. Em vez de encapsular a lógica do negócio, elas apenas expõem os dados, tornando o código mais difícil de entender, manter e evoluir. Para evitar classes anêmicas, é importante que as classes do domínio tenham métodos que representem as regras de negócio e as operações que podem ser realizadas com os dados. Lembrese: uma classe de domínio deve ter um motivo para mudar, uma responsabilidade específica no sistema.

## Design estratégico
Analisar o negócio de maneira a separar em domínios e subdomínios.

Como entender o que é domínio principal e subdomínio: 
Mapeia-se o espaço do problema e depois com o espaço de solução onde analiso o contexto "bounded context", crio contextos limitados para lhe dar com eles.

![](https://cdn1.gnarususercontent.com.br/1/795715/52fd5329-0a08-48e7-a4f6-00cce7844bc2.png)

## Subdomínio

**Subdomínio Principal** - O coração do negócio: É o que realmente faz a empresa funcionar e gerar receita.
        
**Características** 
    - Regras de negócio complexas: A lógica por trás dele é complexa e específica para a empresa.
    - Difícil de terceirizar: É difícil encontrar uma solução pronta no mercado que atenda às necessidades específicas do negócio.

Exemplo: O subdomínio principal é a venda de ingressos. A lógica de como os ingressos são vendidos, como os preços são definidos, como as promoções funcionam, tudo isso é único e crucial para o sucesso da empresa.

**Subdomínio Genérico** - Solução pronta no mercado: É algo que pode ser comprado de terceiros, sem precisar desenvolver do zero.
Características: 
    Lógica de negócio simples: As regras de negócio são mais simples e podem ser aplicadas em diversos contextos.
    Baixo risco: Se a solução não atender às necessidades, é fácil trocar por outra.

Exemplo: A plataforma de pagamento da CodeChella é um subdomínio genérico. Existem diversas plataformas de pagamento disponíveis no mercado, e a CodeChella pode escolher a que melhor se adapta às suas necessidades.

## Separando camadas de responsabilidade

Aqui, pensamos como arquirtetura em camadas, sendo elas: Domain Models e Domain Services
![]https://cdn1.gnarususercontent.com.br/1/795715/cac66b33-eb09-4a68-ab44-8cec28b3f7cd.png

Camada de aplicação - recebe as solicitações da interface com o usuário, portanto os controllers podem ir a ela, bem como uma boa prática, os DTO's e os services.
Camada Domínio: Define as regras de negócio, como um evento precisa ter um nome, data e local, e um ingresso precisa ter um tipo, preço e setor.
Camada Infraestrutura: Fornece os recursos técnicos para a aplicação funcionar, como salvar os dados de um evento no banco de dados, enviar um email de confirmação de compra de ingresso ou integrar com um sistema de pagamento externo. 