import './App.css';
import {Row, Col, Button, Form} from "react-bootstrap"
import 'bootstrap/dist/css/bootstrap.min.css';
import {useState} from "react";

function App() {
    const [value, setValue] = useState("black");

    const handleOnChange = (e) => {
        setValue(e.target.value);
    };

    const asd = () => {
        console.log(value);
    }

  return (
    <div className="App">
        <Row>
            <Col><h1>Placeholder</h1></Col>
        </Row>
       <Row>
           <Col><Form.Control as="select" custom onChange={handleOnChange} defaultValue={value}>
               <option value="random">Random</option>
               <option value="parent">Parent</option>
               <option value="partner">Partner</option>
               <option value="friend">Friend</option>
           </Form.Control></Col>
            <Col>
                <Button variant="success" onClick={asd}>Success</Button>
            </Col>
       </Row>

    </div>
  );
}

export default App;
