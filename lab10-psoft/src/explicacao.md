## Explicação do padrão escolhido

O padrão escolhido para refatorar esse codigo foi
o padrão State pois o código apresentado possui
complexidades relacionadas ao estado de um componente
que poderiam ser facilmente eliminadas com o uso de tal
padrão. Dessa forma, foi necessário construir uma interface
com todos os métodos que precisariam ser implementados nos estados,
uma classe abstrata que implementa tal interface e os estados extendendo
a mesma. Dessa forma, é possível criar um código que mude o estado
de uma entidade em tempo de execução de acordo com a padronização de
tipo (interface).
