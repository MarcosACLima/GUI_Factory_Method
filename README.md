# Design Patter - Factory Method
## Produção de elementos da GUI de plataforma cruzada

Neste Projeto, os botões desempenham uma função de produto e os diálogos atuam como criadores.
Diferentes tipos de caixas de diálogo requerem seus próprios tipos de elementos. É por isso que criamos uma subclasse para cada tipo de diálogo e substituímos seus métodos fábrica.
Agora, cada tipo de diálogo instanciará as classes de botão apropriadas. O diálogo base funciona com produtos usando sua interface comum, é por isso que seu código permanece funcional após todas as alterações.

## Tecnologias e Ferramentas

- Java
- Eclipe IDE
- AWT (Abstract Window Toolkit)
- Swing
- Git
- Dillinger 

## Design Patter

Design Patter (Padrões de projetos)  são soluções para problemas que alguém um dia teve e resolveu aplicando um modelo que foi documentado e que você pode adaptar integralmente ou de acordo com necessidade de sua solução. Vou abordar neste artigo o padrão de modelo MVC que tem por objetivo básico separar a lógica de negócio da apresentação.

O grande desafio das equipes de desenvolvimento de aplicações é cada vez mais produzir aplicativos seguros , eficientes , de fácil manutenção , reutilizáveis e em prazos cada vez menores.

Padrões de Projeto são soluções catalogadas para situações comuns do desenvolvimento de software. Baseados em experiências prévias, os padrões definem como partes do software devem ser modeladas a fim de resolver certos problemas ou de evitá-los.

Os padrões criacionais, como o nome sugere, tratam da forma como os objetos são criados no software, o que pode envolver técnicas específicas para cada situação.

## Factory Method

O Factory method é um padrão de projeto criacional, que resolve o problema de criar objetos de produtos sem especificar suas classes concretas.
O Factory Method define um método, que deve ser usado para criar objetos em vez da chamada direta ao construtor. As subclasses podem substituir esse método para alterar a classe de objetos que serão criados.