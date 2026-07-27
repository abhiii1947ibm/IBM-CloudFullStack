# Use the official Node.js image
FROM node:20

# Create app directory
WORKDIR /app

# Copy package files
COPY package*.json ./

# Install dependencies
RUN npm install

ENTRYPOINT ["node", "app.js"]

# Expose application port
EXPOSE 8000

# Start the application
CMD ["npm", "start"]