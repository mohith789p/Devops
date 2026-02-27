FROM nginx:alpine

RUN rm /usr/share/nginx/html/index.html

COPY index.html /etc/nginx/templates/index.html.template

ENV NGINX_ENVSUBST_OUTPUT_DIR=/usr/share/nginx/html

ENV ROLL_NO="23PA1A05XX" \
    TITLE="Docker Lab" \
    WELCOME_MSG="Welcome"