import React from 'react'
import "../style.css";
import axios from 'axios'

class ConsulteSoiree extends React.Component {

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
      evenement: [],
    }
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ entry: event.target.value });
    console.log(this.state.entry)
  }

  handleSubmit(event) {
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
    console.log("num evt " + this.state.numEvt)

  }

  render() {

    return (
      <div>
        <form className="ajoutSoiree" onSubmit={this.handleSubmit}>

          <h2 className="titleh2">Consulte ta soirée : </h2>
          <div>
            <label>
              Nom :
            <input type="text" name="nom" className="input" value={this.state.value} onChange={this.handleChange} />
            </label>
          </div>
          <input type="submit" value="Valider" className="button-valider" />
          <h2 className="titleh2">Description de la soirée : </h2>
          <div class="panel panel-primary border">
            <div class="panel-heading">
              <h3 class="panel-title">Soirée {this.state.nom} </h3>
            </div>
            <div class="panel-body">
              <div class="form-group">
                <label for="rule-title">Nom :</label>
                <input className="input" type="text" id="evenement" value={this.state.nom} />
              </div>
              <div class="form-group">
                <label for="rule-desc">Heure de début : </label>
                <input className="input" type="text" id="type" value={this.state.heure_debut} />
              </div>
              <div class="form-group">
                <label for="rule-desc">Heure de fin : </label>
                <input className="input" id="rule-desc" value={this.state.heure_fin} />
              </div>
              <div class="form-group">
                <label for="rule-desc">Date : </label>
                <input className="input" type="text" id="rule-title" value={this.state.date} />
              </div>
              <h3>Evenement :</h3>
              <div className="form-group">
                <label for="rule-desc">Numéro de l'évènenement : </label>
                <input className="input" type="text" id="rule-title" value={this.state.numEvt} />
              </div>

              <h3>Restaurant :</h3>
              <div class="form-group">
                <label for="rule-desc">Numéro du restaurant : </label>
                <input className="input" type="text" id="rule-title" value={this.state.numResto} />
              </div>
              <div class="form-group distance">
                <label for="rule-desc">Distance à parcourir (en m à vol d'oiseau): </label>
                <input className="input" type="text" id="rule-title" value={this.state.distance} />

              </div>
            </div>
          </div>
        </form>
      </div >

    )

  }

}

export default ConsulteSoiree