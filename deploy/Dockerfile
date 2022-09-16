FROM nginx:latest


WORKDIR /app

ADD deploy/soap_script.sh .

RUN chmod u+x soap_script.sh

CMD ./soap_script.sh

#ADD deploy/soap_script.sh /home/

#RUN chmod u+x /home/soap_script.sh

#CMD ./home/soap_script.sh