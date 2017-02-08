# fperdidoLanzaMunoz
Ejercicio fotograma perdido con MVC

Completar el proyecto del Fotograma Perdido con el patrón MVC. Aparecerá en la página principal la opción de identificarse. Cuando el usuario se identifica correctamente dispondrá de dos opciones, concursar y consultar. En concursar se procederá al sistema de concurso ya conocido, ofreciendo un fotograma y tres posibles títulos como respuesta. Si el concursante falla, no se indica la respuesta correcta. Conforme vaya concursando, los fotogramas ya acertados no se volverán a incluir en las futuras participaciones de ese concursante. Cuando el concursante decida terminar, se le ofrecerá el porcentaje de aciertos, los puntos acumulados y su posición en el ranking global. La política de porcentaje, puntuaciones y ranking queda al criterio de cada programador. Los fotogramas deben siempre escogerse de manera aleatoria. Si el concursante opta por la opción de consultar en lugar de concursar, el programa ofrecerá el porcentaje de aciertos global hasta el momento, el número de fotogramas que se le han ofrecido, el número de aciertos, el total de puntos su posición en el ranking y el ranking de los 10 primeros.

Un usuario sin identificar sólo podrá consultar el ranking de los 10 primeros

DataSource:

                <datasource jta="true" jndi-name="java:jboss/datasources/dsfperdido_LanzaMunoz" pool-name="dsfperdido_LanzaMunoz" enabled="true" use-java-context="true" use-ccm="true">
                    <connection-url>jdbc:mysql://localhost:3306/fperdido_LanzaMunoz</connection-url>
                    <driver>mysql5</driver>
                    <security>
                        <user-name>root</user-name>
                        <password>mysql</password>
                    </security>
                </datasource>
