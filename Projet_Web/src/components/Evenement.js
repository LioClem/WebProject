import React from 'react'
import "../style.css";
import "../ajax.js"

class Evenement extends React.Component {

    componentDidMount() {
        fetch("http://localhost:8080/Evenements")
          .then(res => res.json())
          .then(
            (result) => {
              this.setState({
                isLoaded: true,
                items: result.items
              });
            },
            // Note: it's important to handle errors here
            // instead of a catch() block so that we don't swallow
            // exceptions from actual bugs in components.
            (error) => {
              this.setState({
                isLoaded: true,
                error
              });
            }
          )
      }


    render() {
        return (

            <div class="panel panel-primary evt">
                <div class="panel-heading">
                    <h3 class="panel-title">Evenement</h3>
                </div>
                <div id="evenements">

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

export default Evenement