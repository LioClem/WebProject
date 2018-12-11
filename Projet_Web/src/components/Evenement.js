import React, { Component } from 'react'
import "../style.css";
import axios from "axios";

class Evenement extends Component {

    

    state = {
        soirees: []
    };
    componentDidMount() {
        axios
            .get("http://localhost:8080/soirees/")
            .then(response => {
                const newSoirees = response.data.map(s => {
                    return {
                        id: s.id,
                        nom: s.nom
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
        const { soirees } = this.state;
        // if (isLoaded) {


        return (
            <div>
                    <ul>
                        {
                            soirees.map(s=>
                                <li>
                                    {s.nom}
                                </li>
                            )
                            

                        }
                    </ul>
                </div>

        )

        //   }



    }

}





/*function ajaxGet(url, callback) {

    var req = new XMLHttpRequest();

    req.open("GET", url);

    req.addEventListener("load", function () {

        if (req.status >= 200 && req.status < 400) {

            // Appelle la fonction callback en lui passant la réponse de la requête

            callback(req.responseText);

        } else {

            console.error(req.status + " " + req.statusText + " " + url);

        }

    });

    req.addEventListener("error", function () {

        console.error("Erreur réseau avec l'URL " + url);

    });

    req.send(null);

}

function afficher(reponse) {

    console.log(reponse);

}

ajaxGet("http://localhost:8080/soirees", afficher); */











/*<div>
                <div class="panel panel-primary evt">
                    <div class="panel-heading">
                        <h3 class="panel-title">Evenement</h3>
                    </div>

                    <div class="panel-body">
                        <form>
                            <div class="form-group">
                                <label for="rule-title">Nom de l'événement :</label>
                                <input className="input" type="text" id="evenement" />
                            </div>
                            <div class="form-group">
                                <label for="rule-desc">Type de l'événément : </label>
                                <input className="input" type="text" id="type" />
                            </div>
                            <div class="form-group">
                                <label for="rule-desc">Description de l'événément : </label>
                                <textarea className="input" id="rule-desc" placeholder="Description" />
                            </div>
                            <div class="form-group">
                                <label for="rule-desc">Date de l'événément : </label>
                                <input className="input" type="text" id="rule-title" />
                            </div>
                            <div class="form-group">
                                <label for="rule-desc">Heure de début : </label>
                                <input className="input" type="text" id="rule-title" />
                            </div>
                            <div class="form-group">
                                <label for="rule-desc">Lieu de l'événément : </label>
                                <input className="input" type="text" id="rule-title" />
                            </div>
                        </form>
                    </div>

                </div>
                <div>
                    <ul>
                        {
                            soirees.map(s=>
                                <li>
                                    {s.nom}
                                </li>
                            )
                            

                        }
                    </ul>
                </div>

            </div>*/



export default Evenement