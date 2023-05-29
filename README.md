Resuloção do Exercício Altice Labs 2023 - Labseq -  Afonso Cardoso | afonsocardoso72@gmail.com :

-Caso não tenha Quarkus instalado, deverá seguir os passos:
	Na Windows Powershell correr os comandos:
		iex "& { $(iwr https://ps.jbang.dev) } trust add https://repo1.maven.org/maven2/io/quarkus/quarkus-cli/"
		iex "& { $(iwr https://ps.jbang.dev) } app install --fresh --force quarkus@quarkusio"

-Caso não tenha Angular instalado, deverá seguir os passos:
	Na Windows Powershell correr o comando:
		npm install -g @angular/cli

-Deverá ter NodeJs instalado.
-Deverá ter Java SDK 17.0.7 e corretamente definida a Varíavel de Sistema Path e JAVA_HOME.

-Para correr o projeto deverá seguir os passos:
	Abrir a Windows Powershell na pasta "/code-with-quarkus" e correr o comando:
		./mvnw clean install
		./mvnw compile quarkus:dev
	Abrir outra Windows Powershell na pasta "/labseq-gui" e correr o comando:
		ng serve

Após estes passos, o endpoint fica acessível através de: http://localhost:8080/labseq/{n} , sendo n o index da sequência que pretendemos calcular.
Para aceder à GUI: http://localhost:4200
Para aceder ao Swagger http://localhost:8080/swagger-ui
