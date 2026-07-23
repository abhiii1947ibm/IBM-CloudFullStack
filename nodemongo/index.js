require('dotenv').config()
const express = require('express')
const connectDB = require('./db')
const bodyParser = require('body-parser')
const { Quiz } = require('./models/quiz')

const app = express()
const port = process.env.PORT

app.use(express.json());
app.use(bodyParser.urlencoded({ extended: true }));

connectDB().then(() => {
    console.log('Database connection established');
}).catch((err) => {
    console.error('Database connection error:', err);
});

app.get('/getAllQuizzes', async (req, res) => {
    Quiz.find().then(quizzes => {
        res.json(quizzes);
    });
});

app.post('/createQuiz', async (req, res) => {
    const { title, description } = req.body;
    const newQuiz = new Quiz({
        title,
        description,
    });

    newQuiz.save().then(savedQuiz => {
        res.json(savedQuiz);
    }).catch(err => {
        res.status(500).json({ error: 'Failed to create quiz' });
    });
});

app.put('/updateQuiz/:id', async (req, res) => {
    const { id } = req.params;
    const { title, description } = req.body;

    Quiz.findByIdAndUpdate(
        id,
        { title, description },
        { new: true } // Returns the updated document
    )
    .then(updatedQuiz => {
        if (!updatedQuiz) {
            return res.status(404).json({ error: 'Quiz not found' });
        }
        res.json(updatedQuiz);
    })
    .catch(err => {
        res.status(500).json({ error: 'Failed to update quiz' });
    });
});

app.delete('/deleteQuiz/:id', async (req, res) => {
    const { id } = req.params;

    Quiz.findByIdAndDelete(id)
        .then(deletedQuiz => {
            if (!deletedQuiz) {
                return res.status(404).json({ error: 'Quiz not found' });
            }
            res.json({ message: 'Quiz deleted successfully' });
        })
        .catch(err => {
            res.status(500).json({ error: 'Failed to delete quiz' });
        });
});


app.listen(port, () => console.log(`Example app listening on port ${port}!`))