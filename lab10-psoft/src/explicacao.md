Explicaço do padrao escolhido

O padrao escolhido para refatorar esse codigo foi
o padrao State pois o cóigo apresentado possui
complexidades relacionadas a estado de um componente
que poderiam ser facilmente eliminadas com o uso de tal
padrao. Dessa forma, foi necessáio construir uma interface
com todos os métodos que precisariam ser implementados nos estados,
uma classe abstrata que implementa tal interface e os estados extendendo
a mesma. Dessa forma, é possível criar um código que mude o estado
de uma entidade em tempo de execução de acordo com a padronização de
tipo (interface).