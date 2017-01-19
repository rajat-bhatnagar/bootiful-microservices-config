# bootiful-microservices-config

<i>For demonstration spring.profiles.active is set to native and 3 properties files for app1, app2 and app3 have been created under resources/config directory. For the following corresponding URLs , different value for greeting key is observed in response</i><br>
<i><a href="http://localhost:8888/app1/default">http://localhost:8888/app1/default</a></i><br>
<i><a href="http://localhost:8888/app2/default">http://localhost:8888/app2/default</a></i><br>
<i><a href="http://localhost:8888/app3/default">http://localhost:8888/app3/default</a></i><br>

<u><b> WORK IN PROGRESS ( Notes)</b></u><br>
<i>1. Create a ConfigServer Client(Seperate GIT Project) and Read Configuration from Config Server<br>
<i>2. Refactor existing code / Add Spock dependency and add tests/<i><br>
<i>3. Resiliency and self healing microservices( explore)</i><br>