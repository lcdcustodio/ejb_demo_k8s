while true;
do
	curl -v --request POST --header "Content-Type: text/xml;charset=UTF-8" \
	--data \
	'<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web="http://webservice.ejb.demo.kubernetes.com/"> \
	<soapenv:Header/> \ 
	<soapenv:Body> \ 
	<web:getTeam/> \ 
	</soapenv:Body> \ 
	</soapenv:Envelope>' \
    http://svc-ejb-demo-k8s:8080/ejb_demo_kubernetes-1.0-SNAPSHOT/TeamWS

	sleep .1
done