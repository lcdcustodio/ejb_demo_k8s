EJB Demo Kubernetes
===========

"# ejb_demo_kubernetes 2" 


![Alt text](/picture/hld.png "Optional title")


mvn clean package

docker build -t ejb_demo_k8s .

#docker run -p 8080:8080 ejb_demo_k8s

Assembly EJB WebService on kubernetes

- kubectl apply -f .\deploy\deployment.yaml 
- kubectl apply -f .\deploy\service.yaml
=================

Assembly nginx Pod for calling EJB WebService through SOAP scripts



docker build -f deploy/Dockerfile -t nginx_soap_script .

- kubectl apply -f .\deploy\pod-nginx.yaml


=================
Checkout

- kubectl get services
- kubectl get deployments
- kubectl get rs
- kubectl get pods -o wide 
- kubectl describe service svc-ejb-demo-k8s #endpoint address to load balance

# soap script is up and running
- kubectl logs -f pod-nginx


# check load balancing
- kubectl logs -f <pod_name> #pods created from deployment 

kubectl logs -f deploy-ejb-demo-k8s-69d747ffb6-vd8xj

kubectl logs -f deploy-ejb-demo-k8s-69d747ffb6-vp25d

====================
# check resiliency
- kubectl get pods -o wide 
- kubectl delete pods --all  #pods will be back, except pod-nginx
- kubectl delete pods <pod_name> # downtime is really fast.. s
- kubectl get pods -o wide 
