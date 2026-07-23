const os = require('os');
const fs = require('fs');
const http = require('http');

// console.log(os.arch(), os.freemem(), os.homedir(), os.hostname(), os.uptime());


// fs.readFile('names.txt', (err, data) => {
//     if(err){
//         console.log(err);
//     } else{
//         console.log(data.toString());
//     }
// });

// fs.writeFile('names.txt', 'HI', (err) => {
//     if(err){
//         console.log(err);
//     } else{
//         console.log('file written');
//     }
// });

// async function getHTMLFileSync(filename) {
//     return await fs.readFile(path.join(__dirname, '..', filename), (err, data) => {
//         if(err) {
//             console.log(err);
//         } else {
//             console.log(data.toString());
//             return data.toString();
//         }
//     });
// }

async function getHTMLFileSync(filename) {
    return await fs.readFile(path.join(__dirname, '..', filename), 'utf8');
}

const myServer = http.createServer(async (req, res) => {
    // res.end("Hello World");
    if(req.url === '/start'){
        const html = fs.readFileSync('index.html', 'utf8');
        return res.end(html);
    }
    if(req.url === '/login'){
        return res.end("Login Page");
    }
    res.end("404");

    // if (req.url === '/start') {
    //     res.writeHead(200, { 'Content-Type': 'text/html' });
    //     res.end(await getHTMLFileSync('index.html'));
    // } 
    // if(req.url === '/login') {
    //     res.writeHead(200, {'Content-Type': 'text/html'});
    //     res.end(await getHTMLFileSync('login.html'));
    // }
});



myServer.listen(8000, () => console.log('Server started'));

