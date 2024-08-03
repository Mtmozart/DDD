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