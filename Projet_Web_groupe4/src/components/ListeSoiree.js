import React, { Component } from 'react'
import "../style.css";

import axios from "axios";


class ListeSoiree extends Component {



    state = {
        soirees: []
    };
    componentDidMount() {
        axios
            .get("http://localhost:8080/soirees/getAll")
            .then(response => {
                const newSoirees = response.data.map(s => {
                    return {
                        id: s.id,
                        nom: s.nom,
                        heureDeb: s.heure_debut,
                        heureFin: s.heure_fin,
                        numEvt: s.numEvt,
                        numResto: s.num_resto,
                        date: s.date,
                        distance: s.distance,
                    };
                });

                const newState = Object.assign({}, this.state, {
                    soirees: newSoirees
                });

                this.setState(newState);
            })
            .catch(error => console.log(error));
    }

    render() {
 const {soirees} = this.state;
        // if (isLoaded) {


        return (
            <div>
            <h2 className="titleh2 liste">Voici la liste de tes soirées:</h2>
                    <ul>
                        {
                            soirees.map(s=>
                              <ul>

                                <header className="card-header" >
                                  <h2 className="card-header--title">{s.nom}</h2>
                                </header>
                                <div className="card-body">
                                  <p className="date">Date: {s.date}</p>
                                  <p className="heureDeb">Heure de début: {s.heureDeb}</p>
                                  <p className="heureFin">Heure de fin: {s.heureFin}</p>
                                  <p className="numEvt">Numéro de l événement: {s.numEvt}</p>
                                  <p className="numResto">Numéro du restaurant: {s.numResto}</p>
                                  <p className="distance">Distance: {s.distance}</p>

                                </div>



                              </ul>
                            )


                        }
                    </ul>
                </div>

        )

        //   }



    }

}



export default ListeSoiree