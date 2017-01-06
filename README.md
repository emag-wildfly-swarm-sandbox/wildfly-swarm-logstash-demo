# wildfly-swarm-logstash-demo

WildFly Swarm Logstash Demo

## Usage

### Run Logstash

``` sh
$ cd $LOGSTASH_HOME
$ bin/logstash -f /this/project/etc/logstash/conf.d/wildfly-swarm.conf
```

### Run app

``` sh
$ ./mvnw clean package &&\
  java -jar target/wildfly-swarm-logstash-demo-swarm.jar \
  -Dswarm.project.stage=logstash
```

### Check Logstash console

If you access the app [APIs][#apis], you can see the following log in Logstash console.

```
{
     "loggerClassName" => "org.jboss.logging.Logger",
               "level" => "INFO",
             "message" => "info",
                 "ndc" => "",
                 "mdc" => {},
          "threadName" => "default task-2",
                "tags" => [],
            "threadId" => 162,
            "sequence" => 27,
          "@timestamp" => 2017-01-03T02:31:55.499Z,
                "port" => 47616,
            "@version" => 1,
                "host" => "127.0.0.1",
    "wildflySwarmNode" => "your.host.name",
          "loggerName" => "wildflyswarm.logstash.MyController"
}
```

#### APIs

* /debug
* /info
* /warn
* /error
* /exception
