EJB Demo Kubernetes
===========

"# ejb_demo_kubernetes 2" 

mvn clean package

docker build -t ejb_demo_k8s .

#docker run -p 8080:8080 ejb_demo_k8s

- kubectl apply -f .\deploy\deployment.yaml 
- kubectl apply -f .\deploy\service.yaml
