import { useState } from 'react'
import './App.css'
import './index.css'
function increase() {
  setCounter(counter + 1)
}
function decrease() {
  setCounter(counter - 1)
}


function App() {
  let [counter, setCounter] = useState(0);

  return (
    <>
      <div id="counterDiv">counter={counter}</div>
      <button onClick={() => {
        setCounter(counter + 1)
      }}>increase counter</button>
      <button onClick={() => {
        setCounter(counter - 1)
      }}>decrease counter</button>
    </>
  )
}

export default App
