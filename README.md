How to run the application

1) start the spring boot applicaiton
2) crate the file prometheus.yml
3) pull the docker image for prometheus
   docker pull prom/prometheus
4) run the prometheus image
   docker run --name prom -v E:\Programs\prometheus-grafan\prometheus.yml -p 9090:9090 prom/prometheus