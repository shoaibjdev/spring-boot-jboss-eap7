# spring-boot-jboss-eap7
Spring Boot App for testing deployment on JBoss EAP 7.1

cd $JBOSS_EAP_7_DOMAIN_HOME
bin/domain.sh --host-config=host-master.xml -Djboss.domain.base.dir=../host0/domain/

bin/domain.sh --host-config=host-slave.xml -Djboss.domain.base.dir=../host1/domain/



Admin ---> http://JBOSS_HOST_IP:19990

Logs Location:
$JBOSS_EAP_7_DOMAIN_HOME/host1/domain/servers/server-ccms/log



Deployment: Using UI (Deploy, Assign, Enable)

Test Application: 
---
curl JBOSS_HOST_IP:8380/SpringBootBasic/hello/SRK



Shutdown:
---
bin/jboss-cli.sh --connect controller=JBOSS_HOST_IP:19990
shutdown --host=host1


