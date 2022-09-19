FROM nginx:latest


WORKDIR /app

ADD deploy/soap_script.sh .

RUN cat soap_script.sh | tr -d '\015' >> soap_script_2.sh

RUN chmod u+x soap_script_2.sh

CMD ./soap_script_2.sh

#RUN chmod u+x soap_script.sh

#CMD ./soap_script.sh

#ADD deploy/soap_script.sh /home/

#RUN chmod u+x /home/soap_script.sh

#CMD ./home/soap_script.sh