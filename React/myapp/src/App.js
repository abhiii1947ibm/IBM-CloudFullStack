import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Hello from './hello';



function App() {

  let [count, setCount] = useState(0);

  const op = {
    IncreaseCount: () => setCount(count + 1),
    DecreaseCount: () => setCount(count - 1)
  }

  // function IncreaseCount() {
  //   setCount(count + 1);
  // }
  // function DecreaseCount() {
  //   setCount(count - 1);
  // }
  return (
    <>
    <div class="App">
      <h1>Hello, React!</h1>
      <h2>Count: {count}</h2>
      {/* <button onClick={IncreaseCount}>+</button>
      <br/>
      <button onClick={DecreaseCount}>-</button> */}

      <button onClick={op.IncreaseCount}>+</button>
      <br/>
      <button onClick={op.DecreaseCount}>-</button>

      <Hello />

    </div>
    </>
  );
}

export default App;
