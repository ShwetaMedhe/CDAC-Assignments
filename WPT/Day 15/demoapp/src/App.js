import logo from './logo.svg';
import './App.css';
import LifecycleDemo from './lifecycle';
import Calculator from './Calculator';
import Factorial from './Factorial';
import TextFormat from './textformat';
import EducationForm from './EducationForm'

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
//}

function App() {
  return (
    <div>
       <LifecycleDemo /> 
      <Factorial />
      <Calculator />
       <TextFormat />
        <EducationForm />
        
    </div>
  );
}

export default App;
