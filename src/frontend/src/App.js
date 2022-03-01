import './App.css';
import {Row, Col, Button, Form} from "react-bootstrap"
import 'bootstrap/dist/css/bootstrap.min.css';
import {useEffect, useState} from "react";
import {getAllGifts, getGiftByCategory, getParentsGifts} from "./client";
import Gift from "./components/Gift";

function App() {
    const [value, setValue] = useState("featured");
    const [gifts, setGifts] = useState([]);

    const handleOnChange = (e) => {
        setValue(e.target.value);
    };

    const fetchGifts = () => {
        console.log(value);
        console.log(typeof value);
        getGiftByCategory(value)
            .then(res => res.json())
            .then(data => {
                console.log(data);
                setGifts(data);
            }).catch(err => {
                console.log(err.response);
        })
    }

    useEffect(() => {
        console.log("component is mounted");
        fetchGifts();
    }, []);

  return (
    <div className="App">
        <Row>
            <Col><h1>Gifts for {value}</h1></Col>
        </Row>
        <Row>
            {gifts.map((gift) => <Gift key={gift.id} giftInfo={gift}/>)}
        </Row>
       <Row>
           <Col><Form.Control as="select" custom onChange={handleOnChange} defaultValue={value}>
               <option value="featured">Featured</option>
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
