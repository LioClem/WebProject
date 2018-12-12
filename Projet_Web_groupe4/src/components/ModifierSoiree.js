import React from 'react'
import "../style.css";
import axios from 'axios'

class ModifierSoiree extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            soiree: [],
            entry: '',
            heure_debut: '',
            heure_fin: '',
            numEvt: '',
            numResto: '',
            date: '',
            distance: '',
        }
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChangeHeureDebut = this.handleChangeHeureDebut.bind(this);
        this.handleChangeHeureFin = this.handleChangeHeureFin.bind(this);
        this.handleChangeDate = this.handleChangeDate.bind(this);
        this.handleChangeNumEvt = this.handleChangeNumEvt.bind(this);
        this.handleChangeNumResto = this.handleChangeNumResto.bind(this);
        this.onSubmit = this.onSubmit.bind(this);

    }

    handleChange(event) {
        this.setState({ entry: event.target.value });
        console.log(this.state.entry)
    }

    handleChangeHeureDebut(event) {
        this.setState({ heure_debut: event.target.value });
        console.log(this.state.heure_debut)
    }

    handleChangeHeureFin(event) {
        this.setState({ heure_fin: event.target.value });
        console.log(this.state.heure_fin)
    }

    handleChangeDate(event) {
        this.setState({ date: event.target.value });
        console.log(this.state.date)
    }

    handleChangeNumEvt(event) {
        this.setState({ numEvt: event.target.value });
        console.log(this.state.numEvt)
    }

    handleChangeNumResto(event) {
        this.setState({ numResto: event.target.value });
        console.log(this.state.numResto)
    }

    handleSubmit(event) {
        //alert('Your favorite flavor is: ' + this.state.value);
        event.preventDefault();
        axios.get("http://localhost:8080/soirees/get?nom=" + this.state.entry)
            .then(res => {
                const soiree = res.data;
                this.setState({ soiree });
                this.setState({ nom: soiree.nom });
                this.setState({ heure_debut: soiree.heure_debut });
                this.setState({ heure_fin: soiree.heure_fin });
                this.setState({ date: (soiree.date).substr(0, 10) });
                this.setState({ numEvt: soiree.numEvt });
                this.setState({ numResto: soiree.numResto });
                this.setState({ distance: Math.round(soiree.distance) });

            })
    }

    onSubmit(event) {

        event.preventDefault();

        const soiree = {
            nom: this.state.nom,
            heure_debut: this.state.heure_debut,
            heure_fin: this.state.heure_fin,
            date: this.state.date,
            numEvt: this.state.numEvt,
            numResto: this.state.numResto,
            distance: this.state.distance,
        };

        axios.get("http://localhost:8080/soirees/update?nom=" + soiree.nom
            + "&heure_debut=" + soiree.heure_debut
            + "&date=" + soiree.date
            + "&heure_fin=" + soiree.heure_fin
            + "&num_evt=" + soiree.numEvt
            + "&num_resto=" + soiree.numResto)
            .then(res => {
                console.log(res);
                console.log(res.data);
            })

        alert("Soirée " + this.state.nom + " bien modifiée !")
    }

      render() {
        return (
            <div>
                <form className="ajoutSoiree" onSubmit={this.handleSubmit}>

                    <h2 className="titleh2">Modifie ta soirée : </h2>
                    <div>
                        <label>
                            Nom :
            <input type="text" name="nom" className="input" value={this.state.value} onChange={this.handleChange} />
                        </label>
                    </div>
                    <input type="submit" value="Valider" className="button-valider" />
                </form>
                <form className="ajoutSoiree" onSubmit={this.onSubmit}>
                    <h2 className="titleh2">Description de la soirée : </h2>
                    <div class="panel panel-primary border">
                            <div class="panel-heading">
                                <h3 class="panel-title">Soirée {this.state.nom} </h3>
                            </div>
                            <div id="soiree">
                            </div>
                            <div class="panel-body">

                                <div class="form-group">
                                    <label for="rule-title">Nom :</label>
                                    <input className="input" type="text" id="evenement" value={this.state.nom} />
                                </div>
                                <div class="form-group">
                                    <label for="rule-desc">Heure de début : </label>
                                    <input className="input" type="text" id="type" value={this.state.heure_debut} onChange={this.handleChangeHeureDebut} />
                                </div>
                                <div class="form-group">
                                    <label for="rule-desc">Heure de fin : </label>
                                    <input className="input" id="rule-desc" value={this.state.heure_fin} onChange={this.handleChangeHeureFin} />
                                </div>
                                <div class="form-group">
                                    <label for="rule-desc">Date : </label>
                                    <input className="input" type="text" id="rule-title" value={this.state.date} onChange={this.handleChangeDate}/>
                                </div>
                                <div class="form-group">
                                    <label for="rule-desc">Numéro de l'évènenement : </label>
                                    <input className="input" type="text" id="rule-title" value={this.state.numEvt} onChange={this.handleChangeNumEvt}/>
                                </div>
                                <div class="form-group">
                                    <label for="rule-desc">Numéro du restaurant : </label>
                                    <input className="input" type="text" id="rule-title" value={this.state.numResto} onChange={this.handleChangeNumResto} />
                                </div>
                                <div class="form-group distance">
                                    <label for="rule-desc">Distance à parcourir (en m à vol d'oiseau): </label>
                                    <input className="input" type="text" id="rule-title" value={this.state.distance} />
                                </div>
                            </div>
                        </div>  
                        <input type="submit" value="Valider" className="button-valider" />             
               
                </form>
            </div >

        )

    }
}
export default ModifierSoiree