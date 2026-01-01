import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Route, Routes,Link} from "react-router-dom";
import Home from './Home';
import ContactUs from './ContactUs';
import AboutUs from './AboutUs';
import Counter from './Counter';

function App() {
  return (
    <Router>
      <div>

      <nav>
      <Link to="/" >Home</Link>{" "}
      <Link to="/aboutus">AboutUs</Link>{" "}
      <Link to="/contactus">ContactUs</Link>{" "}
      <Link to="/counter">Counter</Link>{" "}
      </nav>

      <Routes>
        <Route path ="/" element={<Home/>}></Route>
        <Route path ="/aboutus"element ={<AboutUs></AboutUs>}></Route>
        <Route path ="/contactus"element ={<ContactUs></ContactUs>}></Route>
         <Route path ="/counter" element={<Counter/>}></Route>
      </Routes>
        </div>

    </Router>
  );
}

export default App;
