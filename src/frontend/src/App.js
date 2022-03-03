import './App.css';
import {Row, Col, Button, Form, Image, Container} from "react-bootstrap"
import 'bootstrap/dist/css/bootstrap.min.css';
import {useEffect, useState} from "react";
import {getGiftByCategory} from "./client";
import Gift from "./components/Gift";
import {BiLeftArrow, BiRightArrow} from "react-icons/bi"

function App() {
    const [menuValue, setMenuValue] = useState("featured");
    const [gifts, setGifts] = useState([{}]);
    const [counter, setCounter] = useState(0);

    const countUp = () => {
        (counter <= gifts.length - 2) ? setCounter(counter + 1) : setCounter(0);
    }

    const countDown = () => {
        (counter <= 0) ? setCounter(gifts.length - 1) : setCounter(counter - 1);
    }

    const handleOnChange = (e) => {
        setMenuValue(e.target.value);
    };

    const fetchGifts = () => {
        setCounter(0);
        getGiftByCategory(menuValue)
            .then(res => res.json())
            .then(data => {
                console.log(data);
                setGifts(data);
            }).catch(err => {
                console.log(err.response);
        })
    }
    useEffect(() => {
        fetchGifts();
    }, []);
  return (
    <div className="App">
        <Row>
            <Col md={"auto"}>
                <Image src={"/giftGenLogo.png"} fluid className={"float-start"} style={{paddingLeft: '15vh', height: '150px'}}/>
            </Col>
            <Col>
                <h1 className={"float-start"} style={{paddingTop: '4vh', fontSize: '3rem'}}>GiftGen</h1>
            </Col>
        </Row>

        <Container>
            <Row style={{paddingTop: '25%'}}>
                <Col>
                    <BiLeftArrow onClick={countDown} size={"120px"} className={"float-end arrow"}/>
                </Col>
                <Col md={"auto"}>
                    <Gift giftInfo={gifts[counter]} />
                </Col>
                <Col>
                    <BiRightArrow onClick={countUp} size={"120px"} className={"float-start arrow"}/>
                </Col>
            </Row>
            <Row className={'d-flex justify-content-center'}>
                <Col md={3} style={{padding: 0}} >
                    <Form.Control as="select" onChange={handleOnChange} defaultValue={menuValue} className={"giftForm"}>
                        <option value="featured">Featured</option>
                        <option value="parent">Parent</option>
                        <option value="partner">Partner</option>
                        <option value="friend">Friend</option>
                    </Form.Control>
                </Col>
                <Col md={"auto"} style={{padding: 0}}>
                    <Button variant="success" onClick={fetchGifts} className={"float-start"}>Search</Button>
                </Col>
            </Row>
        </Container>
    </div>
  );
}

export default App;
