# Eureka Discovery Service

Eureka discovery service is a service registry where each microservice will register itself to give information about service-specific metadata.

# Building from Source
Clone the git repository using the URL on the Gitlab home page:

    $ git clone https://github.com/muhammadaliqasmi/eureka-discovery-service.git
    $ cd eureka-discovery-service

## Command Line
Use Maven 2.2 or 3.0, then on the command line:

   $ mvn clean install

## SpringSource Tool Suite (STS)
In STS (or any Eclipse distro or other IDE with Maven support), import the module directories as existing projects.  They should compile and the tests should run with no additional steps.