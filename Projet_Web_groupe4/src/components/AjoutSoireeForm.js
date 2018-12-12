import React, { Component } from 'react'
import "../style.css";
import axios from 'axios'

class AjoutSoireeForm extends Component {

  constructor(props) {
    super(props);
    this.state = {
      evenements: [],
      date1: '',
      listEvents: [],
      lstEvt: [],
      typeEvt: '',
      nomEvt: '',
      descEvt: '',
      adrEvt: '',
      villeEvt: '',
      idEvt: [],
      restos: [],
      nomResto: '',
      typeResto: '',
      adrResto: '',
      nomSoiree: '',
      heure_debSoiree: '',
      heure_finSoiree: '',
      numEvt: 0,
      numResto: 0
    }


    this.handleChange = this.handleChange.bind(this);
    this.handleChange2 = this.handleChange2.bind(this);
    this.handleChange3 = this.handleChange3.bind(this);
    this.handleChange4 = this.handleChange4.bind(this);
    this.handleChange5 = this.handleChange5.bind(this);
    this.handleChange6 = this.handleChange6.bind(this);
    this.handleChange7 = this.handleChange7.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleSubmit2 = this.handleSubmit2.bind(this);
  }


  handleChange(event) {
    this.setState({ date1: event.target.value });
  }

  handleChange2(event) {
    this.setState({ typeEvt: event.target.value });
  }

  handleChange3(event) {
    this.setState({ nomEvt: event.target.value });
  }

  handleChange4(event) {
    this.setState({ nomResto: event.target.value });
  }

  handleChange5(event) {
    this.setState({ nomSoiree: event.target.value });
  }

  handleChange6(event) {
    this.setState({ heure_debSoiree: event.target.value });
  }

  handleChange7(event) {
    this.setState({ heure_finSoiree: event.target.value });
  }

  componentDidMount() {
    axios
      .get("http://localhost:8080/Evenements")
      .then(response => {
        const newEvents = response.data.map(e => {
          return {
            id: e.id,
            nom: e.nom,
            description: e.description,
            type: e.type,
            date: e.date,
            heure_debut: e.heure_debut,
            adresse: e.adresse,
            ville: e.ville
          };
        });

        const newState = Object.assign({}, this.state, {
          evenements: newEvents
        });

        this.setState(newState);
      })
      .catch(error => console.log(error));
  }

  handleSubmit(event) {
    event.preventDefault();
    axios
      .get("http://localhost:8080/lesRestos?unEvt=" + this.state.idEvt[0])
      .then(res => {
        const newRestos = res.data.map(r => {
          return {
            id: r.id,
            nom: r.nom,
            type: r.type,
            adresse: r.adresse
          };
        });

        const newState = Object.assign({}, this.state, {
          restos: newRestos
        });

        this.setState(newState);
      })
      .catch(error => console.log(error));
  }

  handleSubmit2(event) {
    event.preventDefault();
    axios
      .get("http://localhost:8080/soirees/create?nom=" + this.state.nomSoiree
        + "&heure_debut=" + this.state.heure_debSoiree
        + "&date=" + this.state.date1
        + "&heure_fin=" + this.state.heure_finSoiree
        + "&num_evt=" + this.state.numEvt
        + "&num_resto=" + this.state.numResto)
      .then(res => {
        console.log(res);
        console.log(res.data)
      })
      .catch(error => console.log(error));

    alert("Soirée sauvegardée")
  }










  render() {

    const { evenements, restos, listEvents, lstEvt, typeEvt, nomEvt,
      heure_debSoiree, nomResto, typeResto, adrResto, idEvt, adrEvt, villeEvt,
      descEvt, date1, nomSoiree, heure_finSoiree } = this.state;


    for (let index1 = 0; index1 < evenements.length; index1++) {
      if (listEvents.indexOf(evenements[index1].type) === -1) {
        if (evenements[index1].date.substr(0, 10) === date1) {
          listEvents.push(evenements[index1].type);
        }
      }
    }
    lstEvt.length = 0;
    for (let index = 0; index < evenements.length; index++) {
      if (evenements[index].date.substr(0, 10) === date1) {
        if (evenements[index].type === typeEvt) {
          lstEvt.push(evenements[index].nom);
        }
      }
    }

    this.state.descEvt = ""
    for (let index2 = 0; index2 < evenements.length; index2++) {
      if (evenements[index2].date.substr(0, 10) === date1) {
        if (evenements[index2].type === typeEvt) {
          if (evenements[index2].nom === nomEvt) {
            this.state.descEvt = evenements[index2].description;
            this.state.adrEvt = evenements[index2].adresse;
            this.state.villeEvt = evenements[index2].ville;
          }
        }
      }
    }

    idEvt.length = 0;
    for (let index3 = 0; index3 < evenements.length; index3++) {
      if (evenements[index3].date.substr(0, 10) === date1) {
        if (evenements[index3].type === typeEvt) {
          if (evenements[index3].nom === nomEvt) {
            idEvt.push(evenements[index3].id);
            this.state.numEvt = evenements[index3].id
          }
        }
      }
    }
    idEvt.length = 1;

    for (let index4 = 0; index4 < restos.length; index4++) {
      if (restos[index4].nom === this.state.nomResto) {
        
        this.state.typeResto = restos[index4].type
        this.state.adrResto = restos[index4].adresse
        this.state.numResto = restos[index4].id
      }

    }
    
    return (

      <div>
        <h2 className="ajoutSoiree titleh2 ">Ajoute ta soirée : </h2>
        <form className="ajoutSoiree" onSubmit={this.handleSubmit}>
          <div>
            <label>
              Nom :
              <input type="text" name="nom" value={this.state.value} onChange={this.handleChange5}
                className="input" />
            </label>
          </div>

          <div>
            <label>
              Date :
          <input type="text" value={this.state.value} onChange={this.handleChange} className="input"
                placeholder="YYYY-MM-DD" />
            </label>
          </div>
          <div>
            <label>
              Heure de début :
          <input type="text" className="input" value={this.state.value} onChange={this.handleChange6} placeholder="20:30" />
            </label>
            <label>
              Heure de fin :
          <input type="text" className="input" value={this.state.value} onChange={this.handleChange7} placeholder="23:15" />
            </label>
            <br />

          </div>

          <div>
            <h2 className="titleh2">Choisis ton événement : </h2>

            <h4>Type ?</h4>
            <select value={this.state.value} onChange={this.handleChange2}>
              {listEvents.map((evtType) =>
                <option value={evtType} >
                  {evtType}
                </option>
              )}
            </select>
          </div>
          <br />
          <div>
            <select value={this.state.value} onChange={this.handleChange3}>
              {lstEvt.map((e) =>
                <option value={e}>
                  {e}
                </option>
              )}
            </select>
            <br />
          </div>
          <div>
            <div>
              <h4>Description Evenement : </h4>
              <p className="desc">
                {this.state.descEvt}
              </p>
            </div>
            <div>
            <h4>Adresse Evenement : </h4>
              <p className="desc">
                {this.state.adrEvt}
              </p>
            </div>
            <div>
            <h4>Ville Evenement : </h4>
              <p className="desc">
                {this.state.villeEvt}
              </p>
            </div>



          </div>
          <div>
            <input type="submit" value="Valider l'événement" onSubmit={this.handleSubmit} className="button-valider" />
          </div>


        </form>
        <form className="ajoutSoiree" onSubmit={this.handleSubmit2}>
          <div>
            <h2 className="titleh2">Choisis ton restaurant : </h2>
          </div>
          <div>
            <select value={this.state.value} onChange={this.handleChange4}>
              {restos.map((r) =>
                <option value={r.nom}>
                  {r.nom}
                </option>
              )}
            </select>
          </div>
          <div>
            <div>
              Type :
              <p>{this.state.typeResto}</p>
            </div>
            <div>
              Adresse :
              <p>{this.state.adrResto}</p>
            </div>
          </div>
          <div>
            <input type="submit" value="Valider la soirée" onSubmit={this.handleSubmit2} className="button-valider" />
          </div>
        </form>
      </div>

    )

  }



}
export default AjoutSoireeForm