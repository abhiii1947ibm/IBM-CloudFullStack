const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;

// Root Endpoint
app.get('/', (req, res) => {
    res.status(200).json({
        status: "success",
        message: "Hello Abhishek Nigam, welcome to Jenkins 101: Building Your First Automated CI/CD Pipeline from Scratch!",
        timestamp: new Date()
    });
});

// Health Check Endpoint (crucial for Jenkins Smoke Test)
app.get('/health', (req, res) => {
    res.status(200).json({
        status: "UP",
        uptime: process.uptime(),
        timestamp: new Date()
    });
});

// Start listening only if executed directly (prevents EADDRINUSE during Jest tests)
if (require.main === module) {
    app.listen(PORT, () => {
        console.log(`Server is running and listening on port ${PORT}`);
    });
}

module.exports = app;
