FROM google/nodejs

EXPOSE 12618

WORKDIR /etc/services/dmcloud_repo
ADD mock .
RUN ["npm", "install"]

//ENTRYPOINT ["npm", "start"]
ENTRYPOINT ["node", "index.js"]
