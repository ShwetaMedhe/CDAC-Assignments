import logo from './logo.svg';
import './App.css';
import Counter from './counter';
import Counter_usestate from './counter2';
import Lifecycle from './lifecycle';
import InputToList from './onBlur';


function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
      <Lifecycle />
      <Counter_usestate />
      <Counter />
      <InputToList />
    </div>
  );
}

export default App;
