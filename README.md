## In this project demonstate how we can dockerize and push our docker image in docker repository

## Setps 

1)  First cteated a demo spring boot project

2)  Generate jar file <code> mvn clean package </code>

3) create Dockerfile and write the necessary configuration

4) In locally running docker build docker image based on docker file <code> docker build -t image_tag_name . </code>

5) Run docker image <code> docker run -p hostport:containport imagename</code>

6) Run docker image Detach Mode<code> docker run -p hostport:containport -d imagename</code>
Ex, <code>docker run -p 8081:8081 -d imagename</code>

7) To see logs <code> docker logs -f first_four_digit_of_container_ID</code>

8) Login in Dockerhub <code>docker login </code> provide credentials

9) <code> docker tag spring_boot_docker_demo  mohosin16103308/spring_boot_docker_demo:0.1.RELEASE</code>

Note: spring_boot_docker_demo here will be image name

10) <code> docker push springdockerlatest mohosin16103308/springdockerlatest:0.1.RELEASE</code>

11) Docker pull <code> docker pull -p 4000:8080 mohosin16103308/springdockerlatest:0.1.release</code>

Note: By default docker will try to pull from latest tag, As our tag name is 0.1.release. So we have to specify when we pull from docker hub.

12) Run MySql <code> docker run  -p 3307:3306 --name localhost -e MYSQL_ROOT_PASSWORD=mohosin -e MYSQL_DATABASE=blog_app -e MYSQL_USER=mohosin -e MYSQL_PASSWORD=mohosin -d mysql:latest </code>
Note: here localhost is the custom of contain name that we can define as we want.

13)<code>  docker logs -f localhost  </code>

14) Login mysql in Docker <code>docker exec -it localhost bash</code>
Note: localhost(container name)

15) To login in terminal <code> mysql -u root -p </p> and provide necessary credentails

16) To see database <code> show databases; </code>, Here we can use other mysql commands.
