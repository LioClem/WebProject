import React, { Component } from 'react'
import "../style.css";

class Evenement extends Component {
    constructor(props) {
      super(props);
      this.state = {
        evenements: [],
      }
      this.recup();
    }
  
    recup = (e) => {
      fetch("http://localhost:8080")
        .then(res => res.json())
        .then(
          (result) => {
            const evenements = result;
            this.setState({evenements})
          },
          (error) => {
            this.setState({
              isLoaded: true,
              error
            });
          }
        )
    }
  
    render() {
        const {evenements} = this.state
        return (



            <div class="panel panel-primary evt">
                <div class="panel-heading">
                    <h3 class="panel-title">Evenement</h3>
                </div>
                <div>
                    <ul> 
                    {
                        evenements.map( (evenement) => 
                        <li>{evenement.nom}</li>
                        
                    )}
                        
                    </ul>
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



        )



    }

}
/*
var articlesElt = document.getElementById("evenements");

function ajaxGet(url, callback) {

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


ajaxGet("localhost:8080/Evenements", function (reponse) {

    // Transforme la réponse en un tableau d'articles

    //  var events = JSON.parse(reponse);

    //  events.forEach(function (event) {

    // Ajout du titre et du contenu de chaque article

    var nomEvent = document.createElement("h2");

    nomEvent.textContent = event.nom;

    var descEvent = document.createElement("p");

    /*        // Accès à la météo de Lyon avec la clé d'accès 50a65432f17cf542
    ajaxGet("http://api.wunderground.com/api/50a65432f17cf542/conditions/q/France/Lyon.json", function (reponse) {
        var meteo = JSON.parse(reponse);
        // Récupération de certains résultats
        var temperature = meteo.current_observation.temp_c;
        var humidite = meteo.current_observation.relative_humidity;
        var imageUrl = meteo.current_observation.icon_url;
        // Affichage des résultats
        var conditionsElt = document.createElement("div");
        conditionsElt.textContent = "Il fait actuellement " + temperature +
            "°C et l'humidité est de " + humidite;
        var imageElt = document.createElement("img");
        imageElt.src = imageUrl;
        var meteoElt = document.getElementById("meteo");
        meteoElt.appendChild(conditionsElt);
        meteoElt.appendChild(imageElt);
    });
    descEvent.textContent = event.description;

    articlesElt.appendChild(nomEvent);

    articlesElt.appendChild(descEvent);

    //});

});*/





export default Evenement