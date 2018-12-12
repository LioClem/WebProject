import React from 'react'
import "../style.css";
import axios from 'axios'

class ConsulteSoiree extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            soiree: [],
            nom: '',
        }
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);        
    }

    handleChange(event) {
        this.setState({ nom: event.target.value });
        console.log(this.state.nom)
    }

    handleSubmit(event) {
        //alert('Your favorite flavor is: ' + this.state.value);
        event.preventDefault();
        axios.get("http://localhost:8080/soirees/delete?nom=" + this.state.nom)
            .then(res => {
                console.log(res);
                console.log(res.data);
            })
            alert("Soirée " + this.state.nom + " supprimée !")
        
        
    }

    render() {
        const { soiree } = this.state;
        return (
            <div>
                <form className="ajoutSoiree" onSubmit={this.handleSubmit}>
                    <h2 className="titleh2">Supprime ta soirée : </h2>
                    <div>
                        <label>
                            Nom :
            <input type="text" name="nom" className="input" value={this.state.value} onChange={this.handleChange} />
                        </label>
                    </div>
                    <input type="submit" value="Valider" className="button-valider" />                        
                </form>
            </div >

        )

    }
}

export default ConsulteSoiree