
export SERVER_PORT=8088

gradle run





echo  https://ruuben.medium.com/monitoring-micronaut-applications-with-prometheus-and-grafana-657f75207f51
echo https://micronaut-projects.github.io/micronaut-micrometer/latest/guide/
curl http://localhost:8080/metrics/system.cpu.usage
