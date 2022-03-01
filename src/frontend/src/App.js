import './App.css';
import {Row, Col, Button, Form} from "react-bootstrap"
import 'bootstrap/dist/css/bootstrap.min.css';
import {useEffect, useState} from "react";
import {getAllGifts, getParentsGifts} from "./client";
import Gift from "./components/Gift";

function App() {
    const [value, setValue] = useState("random");
    const [gifts, setGifts] = useState(["no gifts"]);

    const handleOnChange = (e) => {
        setValue(e.target.value);
    };

    const fetchGifts = () => {
        console.log(value);
        getParentsGifts()
            .then(res => res.json())
            .then(data => {
                console.log(data);
                setGifts(data);
            }).catch(err => {
                console.log(err.response);
        })
    }

    /*
    useEffect(() => {
        console.log("component is mounted");
        fetchGifts();
    }, []);

     */

  return (
    <div className="App">
        <Row>
            <Col><h1>Placeholder</h1></Col>
        </Row>
        <Row>
            {gifts.map((gift) => <Gift key={gift.id} giftInfo={gift}/>)}
        </Row>
       <Row>
           <Col><Form.Control as="select" custom onChange={handleOnChange} defaultValue={value}>
               <option value="random">Random</option>
               <option value="parent">Parent</option>
               <option value="partner">Partner</option>
               <option value="friend">Friend</option>
           </Form.Control></Col>
            <Col>
                <Button variant="success" onClick={fetchGifts}>Success</Button>
            </Col>
       </Row>

    </div>
  );
}

export default App;
