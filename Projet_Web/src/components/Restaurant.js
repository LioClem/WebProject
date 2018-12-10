import React, { Component } from 'react'
import "../style.css";

class Restaurant extends Component {
    constructor(props) {
        super(props);
        this.state = {
            evenements: [],
        };    
    }

    componentDidMount() {
        fetch("http://localhost:8080/Restaurants")
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        evenements: result.evenements
                    });
                }
            )
    }
    render() {
        const { evenements} = this.state;
            return (                
                    <div>
                        <ul>

                            {evenements.map(e => (
                                <li key={e.nom}>
                                    {e.nom} {e.type}
                                </li>
                            ))}
                        </ul>
                    </div>
            )
    }

}





export default Restaurant