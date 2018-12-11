import React, { Component } from 'react'
import "../style.css";
import axios from 'axios'

class AjoutSoireeForm extends Component {

  constructor(props) {
    super(props);
    this.state = {
      evenements: [],
      date:"",
      listEvents = [],
    }
  

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    for (let index1 = 0; index1 < evenements.length; index1++) {
      if (listEvents.indexOf(evenements[index1].type) === -1) {
        listEvents.push(evenements[index1].type);
      }
    }
    this.setState({value: event.target.value});
  }

  handleSubmit(event) {
    event.preventDefault();
    
  }


  componentDidMount() {
    axios
      .get("http://localhost:8080/Evenements")
      .then(response => {
        const newEvents = response.data.map(e => {
          return {
            id: e.id,
            nom: e.nom,
            type: e.type,
            date: e.date
          };
        });

        const newState = Object.assign({}, this.state, {
          evenements: newEvents
        });

        this.setState(newState);
      })
      .catch(error => console.log(error));
  }

  



  render() {

    const { evenements, listEvents } = this.state
    const dateYEvents = [];
    const dateMEvents = [];
    const dateDEvents = [];
    for (let index1 = 0; index1 < evenements.length; index1++) {
      if (dateYEvents.indexOf(evenements[index1].date.substr(0,4)) === -1) {
        dateYEvents.push(evenements[index1].date.substr(0,4));
      }
      if (dateMEvents.indexOf(evenements[index1].date.substr(5,2)) === -1) {
        dateMEvents.push(evenements[index1].date.substr(5,2));
      }
      if (dateDEvents.indexOf(evenements[index1].date.substr(8,2)) === -1) {
        dateDEvents.push(evenements[index1].date.substr(8,2));
      }
    }
    
   
    return (

      <div>
        <h1 className="ajoutSoiree">Ajoute ta soirée : </h1>
        <form className="ajoutSoiree" onSubmit={this.handleSubmit}>
          <div>
            <label>
              Nom :
    <input type="text" name="nom" className="input" />
            </label>
          </div>

          <div>
            <label>
              Date :
          <input type="text" onChange={this.handleChange} name="date" className="input" type="text"
    data-parse="date"
    placeholder="YYYY-MM-DD"
    pattern="\d{4}\-\d{2}-\d{2}"
    required/>
            </label>
          </div>
          <div>
            <label>
              Heure de début :
          <input type="text" name="heureDeb" className="input" />
            </label>
            <label>
              Heure de fin :
          <input type="text" name="heureFin" className="input" />
            </label>
            <br/>
            <input type="submit" value="Submit" />
          </div>
          <div>
            <h2>Choisis ton événement : </h2>
           
            <h4>Type ?</h4>
            <select value={this.state.value} onChange={this.handleChange}>
             {listEvents.map((evtType) =>
              <option key={evtType.value}>
                {evtType}
              </option>
            )}
            </select>
          </div>
          <div>
            <h2>Choisis ton restaurant : </h2>
          </div>
          <input type="submit" value="Valider" className="button-valider" />
        </form>
      </div>

    )

  }



}
export default AjoutSoireeForm