FROM google/nodejs

EXPOSE 12618

WORKDIR /etc/services/dmcloud_engine
ADD mock .
RUN ["npm", "install"]

ENTRYPOINT ["node", "index.js"]
