# Jemo, or Java Demo

## Purpose
This is a simple Java Spring Boot application for SEIS739 - Software Analysis, Design, and Implementation.

This application uses:
* Java Version 21
* maven:3.9.6-sapmachine-21
* openjdk:21

See the Dockerfile and docker-compose.yml for more details.

## Getting Started
In order to get this running, there are a few steps you need to take.
* Clone this repository into a local directory.
* Ensure Docker desktop is installed on your host.
* This project's `application.properties` uses environment variables for connecting to an Avien MySQL server:
  * Be sure to add the DB username and password as environment variables to your BASH profile!
  * If you are not pushing changes to `application.properties` to a public repo, I _suppose_ you could hardcode these values...
* From the `jemo` directory, run `docker-compose build` - this will build the Docker image.
* Now run `docker-compose up -d` - this will run the Docker container (`-d` will allow you to perform CL actions within the container).
* Access the running application by navigating to `https://localhost:8080/` in a web browser.

## Example Actions
Running CL actions within the container is easy! Use `docker-compose exec` as the prefix.

Adding data to the database is also easy, turns out! An example might be `curl http://localhost:8080/jemo/add -d name="Sponge Bob" -d email=bob@crabby.com
` - note that this does _not_ need to be run within the docker container.

Navigate to `https://localhost:8080/jemo/all` to see data.

## Credits
I used the following tutorials to help me in setting this up:
* https://aiven.io/developer/create-a-spring-boot-application-with-a-mysql-backend

Other useful documentation can be found here:
* https://hub.docker.com/