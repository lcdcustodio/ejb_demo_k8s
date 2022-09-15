FROM quay.io/wildfly/wildfly
ADD target/*.jar /opt/jboss/wildfly/standalone/deployments/