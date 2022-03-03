import {Card} from "react-bootstrap";

function Gift({giftInfo}) {
    return(
        <Card style={{ width: '26rem' }}>
            <Card.Body>
                <Card.Title>{giftInfo.name}</Card.Title>
                <Card.Subtitle className="mb-2 text-muted">{giftInfo.price}$</Card.Subtitle>
                <Card.Text className={"cardContent"}>{giftInfo.description}</Card.Text>
                <Card.Link href={giftInfo.buyLink} target={"_blank"}>Product Link</Card.Link>
            </Card.Body>
        </Card>
    )
}

export default Gift;